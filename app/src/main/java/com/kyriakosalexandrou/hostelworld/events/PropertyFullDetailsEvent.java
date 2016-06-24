package com.kyriakosalexandrou.hostelworld.events;

import com.kyriakosalexandrou.hostelworld.models.property.PropertyFullDetails;

/**
 * Created by Kyriakos on 23/06/2016.
 */
public class PropertyFullDetailsEvent {
    private ErrorEvent mErrorEvent;
    private PropertyFullDetails mPropertyFullDetails;

    public PropertyFullDetailsEvent(ErrorEvent errorEvent) {
        this.mErrorEvent = errorEvent;
    }

    public PropertyFullDetails getPropertyFullDetails() {
        return mPropertyFullDetails;
    }

    public ErrorEvent getErrorEvent() {
        return mErrorEvent;
    }

    public void setPropertyFullDetails(PropertyFullDetails propertyFullDetails) {
        mPropertyFullDetails = propertyFullDetails;
    }
}
