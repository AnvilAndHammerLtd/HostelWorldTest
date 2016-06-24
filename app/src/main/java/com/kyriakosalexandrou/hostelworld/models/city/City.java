
package com.kyriakosalexandrou.hostelworld.models.city;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class City {

    @SerializedName("properties")
    @Expose
    private List<PropertyBriefDetails> properties = new ArrayList<PropertyBriefDetails>();

    /**
     * @return The properties
     */
    public List<PropertyBriefDetails> getProperties() {
        return properties;
    }

    /**
     * @param properties The properties
     */
    public void setProperties(List<PropertyBriefDetails> properties) {
        this.properties = properties;
    }

}
