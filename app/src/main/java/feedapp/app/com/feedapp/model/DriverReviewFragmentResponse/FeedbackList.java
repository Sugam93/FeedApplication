
package feedapp.app.com.feedapp.model.DriverReviewFragmentResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeedbackList {

    @SerializedName("feedbackID")
    @Expose
    private Integer feedbackID;
    @SerializedName("drivingRating")
    @Expose
    private Double drivingRating;
    @SerializedName("driverBehaviourRating")
    @Expose
    private Double driverBehaviourRating;
    @SerializedName("driverTestingRating")
    @Expose
    private Double driverTestingRating;
    @SerializedName("carConditionRating")
    @Expose
    private Double carConditionRating;
    @SerializedName("overallServiceRating")
    @Expose
    private Double overallServiceRating;
    @SerializedName("averageRating")
    @Expose
    private Double averageRating;
    @SerializedName("remark")
    @Expose
    private String remark;
    @SerializedName("tripID")
    @Expose
    private String tripID;
    @SerializedName("clientDetail")
    @Expose
    private Object clientDetail;

    /**
     * 
     * @return
     *     The feedbackID
     */
    public Integer getFeedbackID() {
        return feedbackID;
    }

    /**
     * 
     * @param feedbackID
     *     The feedbackID
     */
    public void setFeedbackID(Integer feedbackID) {
        this.feedbackID = feedbackID;
    }

    /**
     * 
     * @return
     *     The drivingRating
     */
    public Double getDrivingRating() {
        return drivingRating;
    }

    /**
     * 
     * @param drivingRating
     *     The drivingRating
     */
    public void setDrivingRating(Double drivingRating) {
        this.drivingRating = drivingRating;
    }

    /**
     * 
     * @return
     *     The driverBehaviourRating
     */
    public Double getDriverBehaviourRating() {
        return driverBehaviourRating;
    }

    /**
     * 
     * @param driverBehaviourRating
     *     The driverBehaviourRating
     */
    public void setDriverBehaviourRating(Double driverBehaviourRating) {
        this.driverBehaviourRating = driverBehaviourRating;
    }

    /**
     * 
     * @return
     *     The driverTestingRating
     */
    public Double getDriverTestingRating() {
        return driverTestingRating;
    }

    /**
     * 
     * @param driverTestingRating
     *     The driverTestingRating
     */
    public void setDriverTestingRating(Double driverTestingRating) {
        this.driverTestingRating = driverTestingRating;
    }

    /**
     * 
     * @return
     *     The carConditionRating
     */
    public Double getCarConditionRating() {
        return carConditionRating;
    }

    /**
     * 
     * @param carConditionRating
     *     The carConditionRating
     */
    public void setCarConditionRating(Double carConditionRating) {
        this.carConditionRating = carConditionRating;
    }

    /**
     * 
     * @return
     *     The overallServiceRating
     */
    public Double getOverallServiceRating() {
        return overallServiceRating;
    }

    /**
     * 
     * @param overallServiceRating
     *     The overallServiceRating
     */
    public void setOverallServiceRating(Double overallServiceRating) {
        this.overallServiceRating = overallServiceRating;
    }

    /**
     * 
     * @return
     *     The averageRating
     */
    public Double getAverageRating() {
        return averageRating;
    }

    /**
     * 
     * @param averageRating
     *     The averageRating
     */
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    /**
     * 
     * @return
     *     The remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark
     *     The remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 
     * @return
     *     The tripID
     */
    public String getTripID() {
        return tripID;
    }

    /**
     * 
     * @param tripID
     *     The tripID
     */
    public void setTripID(String tripID) {
        this.tripID = tripID;
    }

    /**
     * 
     * @return
     *     The clientDetail
     */
    public Object getClientDetail() {
        return clientDetail;
    }

    /**
     * 
     * @param clientDetail
     *     The clientDetail
     */
    public void setClientDetail(Object clientDetail) {
        this.clientDetail = clientDetail;
    }

}
