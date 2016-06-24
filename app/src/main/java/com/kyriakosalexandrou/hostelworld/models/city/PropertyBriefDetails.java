
package com.kyriakosalexandrou.hostelworld.models.city;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kyriakosalexandrou.hostelworld.models.Image;
import com.kyriakosalexandrou.hostelworld.models.PropertyIsIn;

import java.util.ArrayList;
import java.util.List;

public class PropertyBriefDetails {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("city")
    @Expose
    private PropertyIsIn propertyIsIn;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("overallRating")
    @Expose
    private OverallRating overallRating;

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The propertyIsIn
     */
    public PropertyIsIn getPropertyIsIn() {
        return propertyIsIn;
    }

    /**
     * @param propertyIsIn The propertyIsIn
     */
    public void setPropertyIsIn(PropertyIsIn propertyIsIn) {
        this.propertyIsIn = propertyIsIn;
    }

    /**
     * @return The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * @param images The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * @return The overallRating
     */
    public OverallRating getOverallRating() {
        return overallRating;
    }

    /**
     * @param overallRating The overallRating
     */
    public void setOverallRating(OverallRating overallRating) {
        this.overallRating = overallRating;
    }

}
