
package feedapp.app.com.feedapp.model.DriverReviewFragmentResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverDetailList {

    @SerializedName("driId")
    @Expose
    private Integer driId;
    @SerializedName("driName")
    @Expose
    private String driName;
    @SerializedName("driContact")
    @Expose
    private Object driContact;
    @SerializedName("otp")
    @Expose
    private Object otp;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("login")
    @Expose
    private Object login;

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
    public Object getDriContact() {
        return driContact;
    }

    /**
     * 
     * @param driContact
     *     The driContact
     */
    public void setDriContact(Object driContact) {
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
    public Object getLogin() {
        return login;
    }

    /**
     * 
     * @param login
     *     The login
     */
    public void setLogin(Object login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return driName;
    }
}
