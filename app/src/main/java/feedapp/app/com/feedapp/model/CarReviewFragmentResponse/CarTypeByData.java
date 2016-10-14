
package feedapp.app.com.feedapp.model.CarReviewFragmentResponse;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import feedapp.app.com.feedapp.model.DriverReviewFragmentResponse.DriverDetailList;

public class CarTypeByData {

    @SerializedName("carDetailList")
    @Expose
    private List<CarDetailList> carDetailList = new ArrayList<CarDetailList>();

    /**
     * 
     * @return
     *     The carDetailList
     */
    public List<CarDetailList> getCarDetailList() {
        return carDetailList;
    }

    /**
     * 
     * @param carDetailList
     *     The carDetailList
     */
    public void setCarDetailList(List<CarDetailList> carDetailList) {
        this.carDetailList = carDetailList;
    }

}
