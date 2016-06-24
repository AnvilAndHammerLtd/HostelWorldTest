package com.kyriakosalexandrou.hostelworld.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kyriakosalexandrou.hostelworld.helpers.BaseProgressBarHelper;
import com.kyriakosalexandrou.hostelworld.helpers.FactoryProgressBarHelper;
import com.kyriakosalexandrou.hostelworld.helpers.SimpleProgressBarHelper;

import org.greenrobot.eventbus.EventBus;
import retrofit.RestAdapter;

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = BaseActivity.class.getName();

    public static final FactoryProgressBarHelper PROGRESS_BAR_HELPER_FACTORY = new FactoryProgressBarHelper();
    private BaseProgressBarHelper mProgressBarHelper;
    private static final String BASE_URL = "http:/";

    public static final RestAdapter REST_ADAPTER = new RestAdapter.Builder()
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .setEndpoint(BASE_URL)
            .build();

    public BaseProgressBarHelper getProgressBarHelper() {
        return mProgressBarHelper;
    }

    public void setProgressBarHelper(BaseProgressBarHelper baseProgressBarHelper) {
        mProgressBarHelper = baseProgressBarHelper;
    }

    protected void onCreate(Bundle savedInstanceState, int layoutId) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId);

        setProgressBarHelper(
                PROGRESS_BAR_HELPER_FACTORY.getProgressBar(
                        this,
                        SimpleProgressBarHelper.ProgressBarSize.FULL_SCREEN
                )
        );
    }

    @Override
    public  void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public  void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
