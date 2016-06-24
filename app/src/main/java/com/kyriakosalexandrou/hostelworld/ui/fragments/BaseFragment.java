package com.kyriakosalexandrou.hostelworld.ui.fragments;

import android.support.v4.app.Fragment;

import com.kyriakosalexandrou.hostelworld.helpers.BaseProgressBarHelper;

/**
 * Created by Kyriakos on 23/06/2016.
 */
public class BaseFragment extends Fragment {
    private static final String TAG = BaseFragment.class.getName();
    private BaseProgressBarHelper mProgressBarHelper;

    public BaseFragment() {
    }

    protected BaseProgressBarHelper getProgressBarHelper() {
        return mProgressBarHelper;
    }

    protected void setProgressBarHelper(BaseProgressBarHelper baseProgressBarHelper) {
        mProgressBarHelper = baseProgressBarHelper;
    }
}