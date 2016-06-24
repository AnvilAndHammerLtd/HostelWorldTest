package com.kyriakosalexandrou.hostelworld.events;

import com.kyriakosalexandrou.hostelworld.models.city.City;

/**
 * Created by Kyriakos on 23/06/2016.
 */
public class PropertiesBriefDetailsEvent {
    private ErrorEvent mErrorEvent;
    private City mCity;

    public PropertiesBriefDetailsEvent(ErrorEvent errorEvent) {
        this.mErrorEvent = errorEvent;
    }

    public City getCity() {
        return mCity;
    }

    public ErrorEvent getErrorEvent() {
        return mErrorEvent;
    }

    public void setCity(City city) {
        mCity = city;
    }
}
