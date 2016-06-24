
package com.kyriakosalexandrou.hostelworld.models.property;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("overall")
    @Expose
    private Integer overall;
    @SerializedName("atmosphere")
    @Expose
    private Integer atmosphere;
    @SerializedName("cleanliness")
    @Expose
    private Integer cleanliness;
    @SerializedName("facilities")
    @Expose
    private Integer facilities;
    @SerializedName("staff")
    @Expose
    private Integer staff;
    @SerializedName("security")
    @Expose
    private Integer security;
    @SerializedName("location")
    @Expose
    private Integer location;
    @SerializedName("valueForMoney")
    @Expose
    private Integer valueForMoney;

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
     * @return The atmosphere
     */
    public Integer getAtmosphere() {
        return atmosphere;
    }

    /**
     * @param atmosphere The atmosphere
     */
    public void setAtmosphere(Integer atmosphere) {
        this.atmosphere = atmosphere;
    }

    /**
     * @return The cleanliness
     */
    public Integer getCleanliness() {
        return cleanliness;
    }

    /**
     * @param cleanliness The cleanliness
     */
    public void setCleanliness(Integer cleanliness) {
        this.cleanliness = cleanliness;
    }

    /**
     * @return The facilities
     */
    public Integer getFacilities() {
        return facilities;
    }

    /**
     * @param facilities The facilities
     */
    public void setFacilities(Integer facilities) {
        this.facilities = facilities;
    }

    /**
     * @return The staff
     */
    public Integer getStaff() {
        return staff;
    }

    /**
     * @param staff The staff
     */
    public void setStaff(Integer staff) {
        this.staff = staff;
    }

    /**
     * @return The security
     */
    public Integer getSecurity() {
        return security;
    }

    /**
     * @param security The security
     */
    public void setSecurity(Integer security) {
        this.security = security;
    }

    /**
     * @return The location
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    /**
     * @return The valueForMoney
     */
    public Integer getValueForMoney() {
        return valueForMoney;
    }

    /**
     * @param valueForMoney The valueForMoney
     */
    public void setValueForMoney(Integer valueForMoney) {
        this.valueForMoney = valueForMoney;
    }

}
