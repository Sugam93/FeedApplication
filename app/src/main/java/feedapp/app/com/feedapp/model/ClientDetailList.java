
package feedapp.app.com.feedapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientDetailList implements Parcelable {

    @SerializedName("clientID")
    @Expose
    private Integer clientID;
    @SerializedName("carID")
    @Expose
    private Integer carID;
    @SerializedName("driID")
    @Expose
    private Integer driID;
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("pickUpTime")
    @Expose
    private String pickUpTime;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("bookingDate")
    @Expose
    private String bookingDate;
    @SerializedName("pickUpPlace")
    @Expose
    private String pickUpPlace;
    @SerializedName("tripID")
    @Expose
    private String tripID;
    @SerializedName("placeName")
    @Expose
    private String placeName;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("remarks")
    @Expose
    private String remarks;
    @SerializedName("guestID")
    @Expose
    private Integer guestID;
    @SerializedName("guestDetail")
    @Expose
    private GuestDetail guestDetail;
    @SerializedName("carDetail")
    @Expose
    private CarDetail carDetail;

    protected ClientDetailList(Parcel in) {
        startDate = in.readString();
        pickUpTime = in.readString();
        endDate = in.readString();
        bookingDate = in.readString();
        pickUpPlace = in.readString();
        tripID = in.readString();
        placeName = in.readString();
        status = in.readString();
        userName = in.readString();
        remarks = in.readString();
    }

    public static final Creator<ClientDetailList> CREATOR = new Creator<ClientDetailList>() {
        @Override
        public ClientDetailList createFromParcel(Parcel in) {
            return new ClientDetailList(in);
        }

        @Override
        public ClientDetailList[] newArray(int size) {
            return new ClientDetailList[size];
        }
    };

    /**
     * 
     * @return
     *     The clientID
     */
    public Integer getClientID() {
        return clientID;
    }

    /**
     * 
     * @param clientID
     *     The clientID
     */
    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    /**
     * 
     * @return
     *     The carID
     */
    public Integer getCarID() {
        return carID;
    }

    /**
     * 
     * @param carID
     *     The carID
     */
    public void setCarID(Integer carID) {
        this.carID = carID;
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
     *     The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The pickUpTime
     */
    public String getPickUpTime() {
        return pickUpTime;
    }

    /**
     * 
     * @param pickUpTime
     *     The pickUpTime
     */
    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    /**
     * 
     * @return
     *     The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 
     * @param endDate
     *     The endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 
     * @return
     *     The bookingDate
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * 
     * @param bookingDate
     *     The bookingDate
     */
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    /**
     * 
     * @return
     *     The pickUpPlace
     */
    public String getPickUpPlace() {
        return pickUpPlace;
    }

    /**
     * 
     * @param pickUpPlace
     *     The pickUpPlace
     */
    public void setPickUpPlace(String pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
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
     *     The placeName
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * 
     * @param placeName
     *     The placeName
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
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
     *     The userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName
     *     The userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     * @return
     *     The remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 
     * @param remarks
     *     The remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 
     * @return
     *     The guestID
     */
    public Integer getGuestID() {
        return guestID;
    }

    /**
     * 
     * @param guestID
     *     The guestID
     */
    public void setGuestID(Integer guestID) {
        this.guestID = guestID;
    }

    /**
     * 
     * @return
     *     The guestDetail
     */
    public GuestDetail getGuestDetail() {
        return guestDetail;
    }

    /**
     * 
     * @param guestDetail
     *     The guestDetail
     */
    public void setGuestDetail(GuestDetail guestDetail) {
        this.guestDetail = guestDetail;
    }

    /**
     * 
     * @return
     *     The carDetail
     */
    public CarDetail getCarDetail() {
        return carDetail;
    }

    /**
     * 
     * @param carDetail
     *     The carDetail
     */
    public void setCarDetail(CarDetail carDetail) {
        this.carDetail = carDetail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(startDate);
        dest.writeString(pickUpTime);
        dest.writeString(endDate);
        dest.writeString(bookingDate);
        dest.writeString(pickUpPlace);
        dest.writeString(tripID);
        dest.writeString(placeName);
        dest.writeString(status);
        dest.writeString(userName);
        dest.writeString(remarks);
    }
}
