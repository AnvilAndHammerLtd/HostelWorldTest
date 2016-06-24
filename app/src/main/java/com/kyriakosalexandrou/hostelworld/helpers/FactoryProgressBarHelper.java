package com.kyriakosalexandrou.hostelworld.helpers;

import android.content.Context;

/**
 * Created by Kyriakos on 23/06/2016.
 * <p/>
 * Factory class to easily create a specific progress bar
 */
public class FactoryProgressBarHelper {

    public BaseProgressBarHelper getProgressBar(Context context, BaseProgressBarHelper.ProgressBarSize progressBarSize) {
        BaseProgressBarHelper progressBarHelper;

        switch (progressBarSize) {
            case SMALL:
                progressBarHelper = new SimpleProgressBarHelper(context, SimpleProgressBarHelper.ProgressBarSize.SMALL);
                break;

            case LARGE:
                progressBarHelper = new SimpleProgressBarHelper(context, SimpleProgressBarHelper.ProgressBarSize.LARGE);
                break;

            case FULL_SCREEN:
                progressBarHelper = new SimpleProgressBarHelper(context, SimpleProgressBarHelper.ProgressBarSize.FULL_SCREEN);
                break;

            default:
                progressBarHelper = new SimpleProgressBarHelper(context, SimpleProgressBarHelper.ProgressBarSize.SMALL);
        }
        return progressBarHelper;
    }
}