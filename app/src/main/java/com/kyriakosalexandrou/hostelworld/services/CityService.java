package com.kyriakosalexandrou.hostelworld.services;

import android.util.Log;

import com.kyriakosalexandrou.hostelworld.events.PropertiesBriefDetailsEvent;
import com.kyriakosalexandrou.hostelworld.events.PropertyFullDetailsEvent;
import com.kyriakosalexandrou.hostelworld.models.city.City;
import com.kyriakosalexandrou.hostelworld.models.property.PropertyFullDetails;

import org.greenrobot.eventbus.EventBus;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Kyriakos on 23/06/2016.
 */
public class CityService {
    private static final String TAG = CityService.class.getName();
    private ICityService mService;


    public CityService(RestAdapter restAdapter) {
        mService = restAdapter.create(ICityService.class);
    }

    public void getCityPropertiesRequest(
            final String cityId, final PropertiesBriefDetailsEvent event) {

        mService.getCityProperties(cityId, new Callback<City>() {

                    @Override
                    public void success(City city, Response response) {
                        Log.v(TAG, "getCityPropertiesRequest success");
                        event.setCity(city);
                        EventBus.getDefault().postSticky(event);
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.v(TAG, "getCityPropertiesRequest failure");
                        EventBus.getDefault().postSticky(event.getErrorEvent());
                    }
                }
        );
    }

    public void getPropertyFullDetailsRequest(
            final String propertyId, final PropertyFullDetailsEvent event) {

        mService.getPropertyFullDetails(propertyId, new Callback<PropertyFullDetails>() {

                    @Override
                    public void success(PropertyFullDetails propertyFullDetails, Response response) {
                        Log.v(TAG, "getPropertyFullDetailsRequest success");
                        event.setPropertyFullDetails(propertyFullDetails);
                        EventBus.getDefault().postSticky(event);
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.v(TAG, "getPropertyFullDetailsRequest failure");
                        EventBus.getDefault().postSticky(event.getErrorEvent());
                    }
                }
        );
    }

    public interface ICityService {
        @GET("//private-anon-b39d95479-practical3.apiary-mock.com/cities/{cityId}/properties/")
        void getCityProperties(@Path("cityId") String cityId, Callback<City> response);

        @GET("//private-anon-b39d95479-practical3.apiary-mock.com/properties/{propertyId}")
        void getPropertyFullDetails(@Path("propertyId") String propertyId, Callback<PropertyFullDetails> response);
    }
}
