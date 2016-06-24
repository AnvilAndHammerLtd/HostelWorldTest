package com.kyriakosalexandrou.hostelworld.ui.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.kyriakosalexandrou.hostelworld.R;
import com.kyriakosalexandrou.hostelworld.Util;
import com.kyriakosalexandrou.hostelworld.events.PropertiesBriefDetailsEvent;
import com.kyriakosalexandrou.hostelworld.events.ErrorEvent;
import com.kyriakosalexandrou.hostelworld.models.city.City;
import com.kyriakosalexandrou.hostelworld.services.CityService;
import com.kyriakosalexandrou.hostelworld.ui.fragments.PropertiesBriefDetailsFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class CitiesActivity extends BaseActivity {

    //the super is called from the base class
    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_main);

        CityService cityService = new CityService(REST_ADAPTER);
        ErrorEvent errorEvent = new ErrorEvent(getString(R.string.get_properties_in_city_request_failure));
        /*
        normally this screen would contain a list of the cities but for now we assume
        that we only have this hardcoded city for now
         */
        cityService.getCityPropertiesRequest("1530", new PropertiesBriefDetailsEvent(errorEvent));
        getProgressBarHelper().showProgressBar();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(PropertiesBriefDetailsEvent event) {
        EventBus.getDefault().removeStickyEvent(event);
        getProgressBarHelper().hideProgressBar();
        goToPropertiesFragment(event.getCity());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(ErrorEvent event) {
        EventBus.getDefault().removeStickyEvent(event);
        getProgressBarHelper().hideProgressBar();
        Util.showToastMessageCentered(this, event.getErrorMessage());
    }

    private void goToPropertiesFragment(City city) {
        FragmentManager fm = getSupportFragmentManager();
        PropertiesBriefDetailsFragment companyFragment = PropertiesBriefDetailsFragment.newInstance(getProgressBarHelper(), city);
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment, companyFragment, PropertiesBriefDetailsFragment.TAG);
        ft.commit();
        fm.executePendingTransactions();
    }
}
