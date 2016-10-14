
package feedapp.app.com.feedapp.model.DriverReviewFragmentResponse;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverTypeByData {

    @SerializedName("driverDetailList")
    @Expose
    private List<DriverDetailList> driverDetailList = new ArrayList<DriverDetailList>();

    /**
     * 
     * @return
     *     The driverDetailList
     */
    public List<DriverDetailList> getDriverDetailList() {
        return driverDetailList;
    }

    /**
     * 
     * @param driverDetailList
     *     The driverDetailList
     */
    public void setDriverDetailList(List<DriverDetailList> driverDetailList) {
        this.driverDetailList = driverDetailList;
    }

}
