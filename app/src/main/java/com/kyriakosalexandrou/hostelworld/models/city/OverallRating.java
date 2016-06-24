
package com.kyriakosalexandrou.hostelworld.models.city;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OverallRating {

    @SerializedName("overall")
    @Expose
    private Integer overall;
    @SerializedName("numberOfRatings")
    @Expose
    private Integer numberOfRatings;

    /**
     * @return The overall
     */
    public Integer getOverall() {
        return overall;
    }

    /**
     * @param overall The overall
     */
    public void setOverall(Integer overall) {
        this.overall = overall;
    }

    /**
     * @return The numberOfRatings
     */
    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    /**
     * @param numberOfRatings The numberOfRatings
     */
    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

}
