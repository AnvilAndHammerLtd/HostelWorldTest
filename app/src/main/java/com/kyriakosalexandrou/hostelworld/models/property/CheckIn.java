
package com.kyriakosalexandrou.hostelworld.models.property;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckIn {

    @SerializedName("startsAt")
    @Expose
    private String startsAt;
    @SerializedName("endsAt")
    @Expose
    private String endsAt;

    /**
     * @return The startsAt
     */
    public String getStartsAt() {
        return startsAt;
    }

    /**
     * @param startsAt The startsAt
     */
    public void setStartsAt(String startsAt) {
        this.startsAt = startsAt;
    }

    /**
     * @return The endsAt
     */
    public String getEndsAt() {
        return endsAt;
    }

    /**
     * @param endsAt The endsAt
     */
    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }

}
