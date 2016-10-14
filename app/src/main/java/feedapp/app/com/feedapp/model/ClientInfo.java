
package feedapp.app.com.feedapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClientInfo {

    @SerializedName("clientDetailList")
    @Expose
    private List<ClientDetailList> clientDetailList = new ArrayList<ClientDetailList>();

    /**
     * 
     * @return
     *     The clientDetailList
     */
    public List<ClientDetailList> getClientDetailList() {
        return clientDetailList;
    }

    /**
     * 
     * @param clientDetailList
     *     The clientDetailList
     */
    public void setClientDetailList(List<ClientDetailList> clientDetailList) {
        this.clientDetailList = clientDetailList;
    }
}
