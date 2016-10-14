
package feedapp.app.com.feedapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GuestDetail implements Parcelable{

    @SerializedName("cId")
    @Expose
    private Integer cId;
    @SerializedName("cName")
    @Expose
    private String cName;
    @SerializedName("personName")
    @Expose
    private String personName;
    @SerializedName("contactNo")
    @Expose
    private String contactNo;
    @SerializedName("emailId")
    @Expose
    private String emailId;

    protected GuestDetail(Parcel in) {
        cName = in.readString();
        personName = in.readString();
        contactNo = in.readString();
        emailId = in.readString();
    }

    public static final Creator<GuestDetail> CREATOR = new Creator<GuestDetail>() {
        @Override
        public GuestDetail createFromParcel(Parcel in) {
            return new GuestDetail(in);
        }

        @Override
        public GuestDetail[] newArray(int size) {
            return new GuestDetail[size];
        }
    };

    /**
     * 
     * @return
     *     The cId
     */
    public Integer getCId() {
        return cId;
    }

    /**
     * 
     * @param cId
     *     The cId
     */
    public void setCId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 
     * @return
     *     The cName
     */
    public String getCName() {
        return cName;
    }

    /**
     * 
     * @param cName
     *     The cName
     */
    public void setCName(String cName) {
        this.cName = cName;
    }

    /**
     * 
     * @return
     *     The personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * 
     * @param personName
     *     The personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * 
     * @return
     *     The contactNo
     */
    public String getContactNo() {
        return contactNo;
    }

    /**
     * 
     * @param contactNo
     *     The contactNo
     */
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * 
     * @return
     *     The emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * 
     * @param emailId
     *     The emailId
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cName);
        dest.writeString(personName);
        dest.writeString(contactNo);
        dest.writeString(emailId);
    }
}
