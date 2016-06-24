package com.kyriakosalexandrou.hostelworld.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kyriakosalexandrou.hostelworld.ImageUtil;
import com.kyriakosalexandrou.hostelworld.R;
import com.kyriakosalexandrou.hostelworld.helpers.BaseProgressBarHelper;
import com.kyriakosalexandrou.hostelworld.models.property.PropertyFullDetails;
import com.squareup.picasso.Picasso;

/**
 * Created by Kyriakos on 23/06/2016.
 */
public class PropertyFullDetailsFragment extends BaseFragment {
    public static final String TAG = PropertyFullDetailsFragment.class.getName();
    private PropertyFullDetails mPropertyFullDetails;
    private ImageView mThumbnail;
    private TextView mName;
    private TextView mAddress1;
    private TextView mAddress2;
    private TextView mCity;
    private TextView mCounty;
    private TextView mDescription;
    private TextView mDirections;

    public PropertyFullDetailsFragment() {
    }

    public static PropertyFullDetailsFragment newInstance(BaseProgressBarHelper baseProgressBarHelper, PropertyFullDetails propertyFullDetails) {
        PropertyFullDetailsFragment fragment = new PropertyFullDetailsFragment();
        fragment.setProgressBarHelper(baseProgressBarHelper);
        fragment.setPropertyFullDetails(propertyFullDetails);
        return fragment;
    }

    protected void setPropertyFullDetails(PropertyFullDetails propertyFullDetails) {
        mPropertyFullDetails = propertyFullDetails;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_property_full_details, container, false);
        bindViews(view);

        loadImage();
        mName.setText(mPropertyFullDetails.getName());
        mAddress1.setText(mPropertyFullDetails.getAddress1());
        mAddress2.setText(mPropertyFullDetails.getAddress2());
        mCity.setText(mPropertyFullDetails.getPropertyIsIn().getName());
        mCounty.setText(mPropertyFullDetails.getPropertyIsIn().getCountry());
        mDescription.setText(mPropertyFullDetails.getDescription());
        mDirections.setText(mPropertyFullDetails.getDirections());

        return view;
    }

    private void loadImage() {
        String completeImageUrl = ImageUtil.loadFirstImage(mPropertyFullDetails.getImages());
        Picasso.with(getContext()).load(completeImageUrl).into(mThumbnail);
    }

    private void bindViews(View view) {
        mThumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        mName = (TextView) view.findViewById(R.id.name);
        mAddress1 = (TextView) view.findViewById(R.id.address_1);
        mAddress2 = (TextView) view.findViewById(R.id.address_2);
        mCity = (TextView) view.findViewById(R.id.city);
        mCounty = (TextView) view.findViewById(R.id.county);
        mDescription = (TextView) view.findViewById(R.id.description);
        mDirections = (TextView) view.findViewById(R.id.directions);
    }
}
