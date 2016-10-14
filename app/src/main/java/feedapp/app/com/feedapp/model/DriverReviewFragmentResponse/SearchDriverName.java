
package feedapp.app.com.feedapp.model.DriverReviewFragmentResponse;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchDriverName {

    @SerializedName("feedbackList")
    @Expose
    private List<FeedbackList> feedbackList = new ArrayList<FeedbackList>();

    /**
     * 
     * @return
     *     The feedbackList
     */
    public List<FeedbackList> getFeedbackList() {
        return feedbackList;
    }

    /**
     * 
     * @param feedbackList
     *     The feedbackList
     */
    public void setFeedbackList(List<FeedbackList> feedbackList) {
        this.feedbackList = feedbackList;
    }

}
