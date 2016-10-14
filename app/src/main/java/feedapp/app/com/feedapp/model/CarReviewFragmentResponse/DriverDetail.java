
package feedapp.app.com.feedapp.model.CarReviewFragmentResponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverDetail implements Parcelable{

    @SerializedName("driId")
    @Expose
    private Integer driId;
    @SerializedName("driName")
    @Expose
    private String driName;
    @SerializedName("driContact")
    @Expose
    private String driContact;
    @SerializedName("otp")
    @Expose
    private Object otp;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("login")
    @Expose
    private String login;

    protected DriverDetail(Parcel in) {
        driName = in.readString();
        driContact = in.readString();
        color = in.readString();
        login = in.readString();
    }

    public static final Creator<DriverDetail> CREATOR = new Creator<DriverDetail>() {
        @Override
        public DriverDetail createFromParcel(Parcel in) {
            return new DriverDetail(in);
        }

        @Override
        public DriverDetail[] newArray(int size) {
            return new DriverDetail[size];
        }
    };

    /**
     * 
     * @return
     *     The driId
     */
    public Integer getDriId() {
        return driId;
    }

    /**
     * 
     * @param driId
     *     The driId
     */
    public void setDriId(Integer driId) {
        this.driId = driId;
    }

    /**
     * 
     * @return
     *     The driName
     */
    public String getDriName() {
        return driName;
    }

    /**
     * 
     * @param driName
     *     The driName
     */
    public void setDriName(String driName) {
        this.driName = driName;
    }

    /**
     * 
     * @return
     *     The driContact
     */
    public String getDriContact() {
        return driContact;
    }

    /**
     * 
     * @param driContact
     *     The driContact
     */
    public void setDriContact(String driContact) {
        this.driContact = driContact;
    }

    /**
     * 
     * @return
     *     The otp
     */
    public Object getOtp() {
        return otp;
    }

    /**
     * 
     * @param otp
     *     The otp
     */
    public void setOtp(Object otp) {
        this.otp = otp;
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
     *     The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * 
     * @param login
     *     The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(driName);
        dest.writeString(driContact);
        dest.writeString(color);
        dest.writeString(login);
    }
}
