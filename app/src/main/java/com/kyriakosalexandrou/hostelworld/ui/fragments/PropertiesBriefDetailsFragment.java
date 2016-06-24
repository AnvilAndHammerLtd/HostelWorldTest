package com.kyriakosalexandrou.hostelworld.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.kyriakosalexandrou.hostelworld.R;
import com.kyriakosalexandrou.hostelworld.Util;
import com.kyriakosalexandrou.hostelworld.events.ErrorEvent;
import com.kyriakosalexandrou.hostelworld.events.PropertyFullDetailsEvent;
import com.kyriakosalexandrou.hostelworld.helpers.BaseProgressBarHelper;
import com.kyriakosalexandrou.hostelworld.models.city.City;
import com.kyriakosalexandrou.hostelworld.models.property.PropertyFullDetails;
import com.kyriakosalexandrou.hostelworld.services.CityService;
import com.kyriakosalexandrou.hostelworld.ui.activities.BaseActivity;
import com.kyriakosalexandrou.hostelworld.ui.adapters.PropertiesBriefDetailsAdapter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by Kyriakos on 23/06/2016.
 */
public class PropertiesBriefDetailsFragment extends BaseFragment {
    public static final String TAG = PropertiesBriefDetailsFragment.class.getName();
    private City mCity;
    private ListView mCityPropertiesList;

    public PropertiesBriefDetailsFragment() {
    }

    public static PropertiesBriefDetailsFragment newInstance(BaseProgressBarHelper baseProgressBarHelper, City city) {
        PropertiesBriefDetailsFragment fragment = new PropertiesBriefDetailsFragment();
        fragment.setProgressBarHelper(baseProgressBarHelper);
        fragment.setCity(city);
        return fragment;
    }

    protected void setCity(City city) {
        mCity = city;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_properties_brief_details, container, false);
        bindViews(view);

        PropertiesBriefDetailsAdapter mPropertiesBriefDetailsAdapter = new PropertiesBriefDetailsAdapter(getContext(), mCity.getProperties());
        mCityPropertiesList.setAdapter(mPropertiesBriefDetailsAdapter);

        mCityPropertiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                getPropertyFullDetailsRequest(position);
            }
        });

        mPropertiesBriefDetailsAdapter.notifyDataSetChanged();

        return view;
    }

    private void getPropertyFullDetailsRequest(int position) {
        CityService cityService = new CityService(BaseActivity.REST_ADAPTER);
        ErrorEvent errorEvent = new ErrorEvent(getContext().getString(R.string.get_property_full_full_details_request));

        cityService.getPropertyFullDetailsRequest(
                mCity.getProperties().get(position).getId(),
                new PropertyFullDetailsEvent(errorEvent));

        getProgressBarHelper().showProgressBar();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(PropertyFullDetailsEvent event) {
        EventBus.getDefault().removeStickyEvent(event);
        getProgressBarHelper().hideProgressBar();
        goToPropertyFullDetailsFragment(event.getPropertyFullDetails());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(ErrorEvent event) {
        EventBus.getDefault().removeStickyEvent(event);
        getProgressBarHelper().hideProgressBar();
        Util.showToastMessageCentered(getContext(), event.getErrorMessage());
    }

    private void goToPropertyFullDetailsFragment(PropertyFullDetails propertyFullDetails) {
        FragmentManager fm = getFragmentManager();
        PropertyFullDetailsFragment companyFragment = PropertyFullDetailsFragment.newInstance(getProgressBarHelper(), propertyFullDetails);
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment, companyFragment, PropertyFullDetailsFragment.TAG);
        ft.addToBackStack(null);
        ft.commit();
        fm.executePendingTransactions();
    }

    private void bindViews(View view) {
        mCityPropertiesList = (ListView) view.findViewById(R.id.properties_list);
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
