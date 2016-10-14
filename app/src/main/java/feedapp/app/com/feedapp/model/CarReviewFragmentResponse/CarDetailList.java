
package feedapp.app.com.feedapp.model.CarReviewFragmentResponse;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarDetailList {

    @SerializedName("carId")
    @Expose
    private Integer carId;
    @SerializedName("carType")
    @Expose
    private String carType;
    @SerializedName("carName")
    @Expose
    private String carName;
    @SerializedName("carNo")
    @Expose
    private String carNo;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("driID")
    @Expose
    private Integer driID;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("seatingCap")
    @Expose
    private Integer seatingCap;
    @SerializedName("month")
    @Expose
    private String month;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("driverDetail")
    @Expose
    private DriverDetail driverDetail;

    /**
     * 
     * @return
     *     The carId
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 
     * @param carId
     *     The carId
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 
     * @return
     *     The carType
     */
    public String getCarType() {
        return carType;
    }

    /**
     * 
     * @param carType
     *     The carType
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * 
     * @return
     *     The carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * 
     * @param carName
     *     The carName
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * 
     * @return
     *     The carNo
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 
     * @param carNo
     *     The carNo
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The driID
     */
    public Integer getDriID() {
        return driID;
    }

    /**
     * 
     * @param driID
     *     The driID
     */
    public void setDriID(Integer driID) {
        this.driID = driID;
    }

    /**
     * 
     * @return
     *     The color
     */
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The seatingCap
     */
    public Integer getSeatingCap() {
        return seatingCap;
    }

    /**
     * 
     * @param seatingCap
     *     The seatingCap
     */
    public void setSeatingCap(Integer seatingCap) {
        this.seatingCap = seatingCap;
    }

    /**
     * 
     * @return
     *     The month
     */
    public String getMonth() {
        return month;
    }

    /**
     * 
     * @param month
     *     The month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 
     * @return
     *     The year
     */
    public String getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The driverDetail
     */
    public DriverDetail getDriverDetail() {
        return driverDetail;
    }

    /**
     * 
     * @param driverDetail
     *     The driverDetail
     */
    public void setDriverDetail(DriverDetail driverDetail) {
        this.driverDetail = driverDetail;
    }

}
