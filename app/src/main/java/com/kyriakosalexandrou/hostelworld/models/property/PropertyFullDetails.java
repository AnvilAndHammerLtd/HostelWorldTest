
package com.kyriakosalexandrou.hostelworld.models.property;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.kyriakosalexandrou.hostelworld.models.Image;
import com.kyriakosalexandrou.hostelworld.models.PropertyIsIn;

import java.util.ArrayList;
import java.util.List;

public class PropertyFullDetails {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("rating")
    @Expose
    private Rating rating;
    @SerializedName("bestFor")
    @Expose
    private List<Object> bestFor = new ArrayList<Object>();
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("address1")
    @Expose
    private String address1;
    @SerializedName("address2")
    @Expose
    private String address2;
    @SerializedName("directions")
    @Expose
    private String directions;
    @SerializedName("city")
    @Expose
    private PropertyIsIn propertyIsIn;
    @SerializedName("paymentMethods")
    @Expose
    private List<String> paymentMethods = new ArrayList<String>();
    @SerializedName("policies")
    @Expose
    private List<String> policies = new ArrayList<String>();
    @SerializedName("totalRatings")
    @Expose
    private String totalRatings;
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("depositPercentage")
    @Expose
    private Integer depositPercentage;
    @SerializedName("associations")
    @Expose
    private List<String> associations = new ArrayList<String>();
    @SerializedName("checkIn")
    @Expose
    private CheckIn checkIn;

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
     * @return The rating
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * @param rating The rating
     */
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    /**
     * @return The bestFor
     */
    public List<Object> getBestFor() {
        return bestFor;
    }

    /**
     * @param bestFor The bestFor
     */
    public void setBestFor(List<Object> bestFor) {
        this.bestFor = bestFor;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
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
     * @return The address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 The address1
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return The address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 The address2
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return The directions
     */
    public String getDirections() {
        return directions;
    }

    /**
     * @param directions The directions
     */
    public void setDirections(String directions) {
        this.directions = directions;
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
     * @return The paymentMethods
     */
    public List<String> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * @param paymentMethods The paymentMethods
     */
    public void setPaymentMethods(List<String> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * @return The policies
     */
    public List<String> getPolicies() {
        return policies;
    }

    /**
     * @param policies The policies
     */
    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }

    /**
     * @return The totalRatings
     */
    public String getTotalRatings() {
        return totalRatings;
    }

    /**
     * @param totalRatings The totalRatings
     */
    public void setTotalRatings(String totalRatings) {
        this.totalRatings = totalRatings;
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
     * @return The depositPercentage
     */
    public Integer getDepositPercentage() {
        return depositPercentage;
    }

    /**
     * @param depositPercentage The depositPercentage
     */
    public void setDepositPercentage(Integer depositPercentage) {
        this.depositPercentage = depositPercentage;
    }

    /**
     * @return The associations
     */
    public List<String> getAssociations() {
        return associations;
    }

    /**
     * @param associations The associations
     */
    public void setAssociations(List<String> associations) {
        this.associations = associations;
    }

    /**
     * @return The checkIn
     */
    public CheckIn getCheckIn() {
        return checkIn;
    }

    /**
     * @param checkIn The checkIn
     */
    public void setCheckIn(CheckIn checkIn) {
        this.checkIn = checkIn;
    }

}
