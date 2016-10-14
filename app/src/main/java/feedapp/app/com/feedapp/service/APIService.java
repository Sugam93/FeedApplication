package feedapp.app.com.feedapp.service;

import java.util.Map;

import feedapp.app.com.feedapp.CarReviewFragment;
import feedapp.app.com.feedapp.model.CarReviewFragmentResponse.CarTypeByData;
import feedapp.app.com.feedapp.model.ClientDetailList;
import feedapp.app.com.feedapp.model.ClientInfo;
import feedapp.app.com.feedapp.model.DriverReviewFragmentResponse.DriverTypeByData;
import feedapp.app.com.feedapp.model.DriverReviewFragmentResponse.SearchDriverName;
import feedapp.app.com.feedapp.model.feedbackresponse.FeedbackResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by ADMIN on 06-10-2016.
 */

public interface APIService {
    //Todo service call getTripIdByContactNo
    @GET("/endsystem/getTripIdByContactNo")
    Call<ClientInfo> getClientInfoCall(
            @QueryMap Map<String,String> params
    );

    @GET("/endsystem/getSaveFeedbackData")
    Call<FeedbackResponse> getFeedbackResponse(
            @QueryMap Map<String,String> params
    );

    @GET("/endsystem/getCarTypeByData")
    Call<CarTypeByData> getCarTypeByDataCall(
            @QueryMap Map<String,String> params
    );

    @GET("endsystem/getDriverTypeByData")
    Call<DriverTypeByData> getDriverTypeByDataCall(
            @QueryMap Map<String,String> params
    );

    @GET("endsystem/getTypeByFeedbackData")
    Call<SearchDriverName> getSearchDriverNameCall(
            @QueryMap Map<String,String> params
    );

}
