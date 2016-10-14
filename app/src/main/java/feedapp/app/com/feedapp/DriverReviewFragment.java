package feedapp.app.com.feedapp;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import feedapp.app.com.feedapp.model.CarReviewFragmentResponse.DriverDetail;
import feedapp.app.com.feedapp.model.DriverReviewFragmentResponse.DriverDetailList;
import feedapp.app.com.feedapp.model.DriverReviewFragmentResponse.DriverTypeByData;
import feedapp.app.com.feedapp.model.DriverReviewFragmentResponse.FeedbackList;
import feedapp.app.com.feedapp.model.DriverReviewFragmentResponse.SearchDriverName;
import feedapp.app.com.feedapp.model.feedbackresponse.FeedbackResponse;
import feedapp.app.com.feedapp.service.APIService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DriverReviewFragment extends Fragment {
    View mView;

    EditText mOverallFeedback;
    EditText mFromdate;
    EditText mTodate;
    String fdate,tdate;
    ImageView mSearch;
    Spinner mSpinner;
    RatingBar mRbDriving;
    RatingBar mRbDriverBehaviour;
    RatingBar mRbDriveronPerfo;
    RatingBar mRbCarCondition;
    RatingBar mRbOverallService;
    RatingBar mRbAverageRating;
    String drivername;

    private String baseURL = "http://192.227.159.120:8080/";
    APIService mApiService;
    private DatePickerDialog fromDatePickerDialog;
    private DatePickerDialog toDatePickerDialog;
    List<FeedbackList> mFeedbackList;/*=new ArrayList<>();*/
    List<DriverDetailList> mDriverReviewList = new ArrayList<>();


    private SimpleDateFormat dateFormatter;

    public DriverReviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_driver_review, container, false);


        //setupRetrofit();
        mApiService = setupRetrofit(baseURL);
        Map<String, String> data = new HashMap<>();
        Call<DriverTypeByData> mCall = mApiService.getDriverTypeByDataCall(data);
        Log.e("url", "" + mCall.request().url());
        mCall.enqueue(new Callback<DriverTypeByData>() {
            @Override
            public void onResponse(Call<DriverTypeByData> call, Response<DriverTypeByData> response) {
                try {
                    mDriverReviewList = response.body().getDriverDetailList();

                    String[] mDrivewrListArray = new String[mDriverReviewList.size()];

                    for (int i = 0; i < mDriverReviewList.size(); i++) {
                        mDrivewrListArray[i] = mDriverReviewList.get(i).getDriName();
                        /*Toast.makeText(getActivity(), "Response:" + mDriverReviewList.get(i).getDriName(), Toast.LENGTH_LONG).show();*/
                    }

                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, mDrivewrListArray);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    mSpinner.setAdapter(adapter);

                } catch (Exception e) {

                }
            }

            @Override
            public void onFailure(Call<DriverTypeByData> call, Throwable t) {

            }

        });

        //TODO intialization() called here
        initialization();

        //TODO date picker dialog show method called here
        datePickerShow();

        //TODO set date and time method called here
        setDateTimeField();

        //TODO rating bar click events method
        ratingbarClickEvents();


        //TODO search button onClick() here
        mSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //TODO date validation method called here
                dateValidation();

                fdate = mFromdate.getText().toString();
                tdate = mTodate.getText().toString();
                mApiService=setupRetrofit(baseURL);
                Map<String, String> data = new HashMap<>();
                data.put("type","driver");
                data.put("fromDate",fdate);
                data.put("toDate",tdate);
                data.put("driName",mSpinner.getSelectedItem().toString());


                Call<SearchDriverName> mCall=mApiService.getSearchDriverNameCall(data);
                Log.e("url", ""+mCall.request().url());
                mCall.enqueue(new Callback<SearchDriverName>() {
                    @Override
                    public void onResponse(Call<SearchDriverName> call, Response<SearchDriverName> response) {

                        try {
                            mFeedbackList=response.body().getFeedbackList();
                            mRbDriving.setRating(Float.parseFloat(mFeedbackList.get(0).getDrivingRating().toString()));
                            mRbDriverBehaviour.setRating(Float.parseFloat(mFeedbackList.get(0).getDriverBehaviourRating().toString()));
                            mRbDriveronPerfo.setRating(Float.parseFloat(mFeedbackList.get(0).getDriverTestingRating().toString()));
                            mRbCarCondition.setRating(Float.parseFloat(mFeedbackList.get(0).getCarConditionRating().toString()));
                            mRbOverallService.setRating(Float.parseFloat(mFeedbackList.get(0).getOverallServiceRating().toString()));
                            mRbAverageRating.setRating(Float.parseFloat(mFeedbackList.get(0).getAverageRating().toString()));
                        }catch (Exception e) {

                        }
                    }

                    @Override
                    public void onFailure(Call<SearchDriverName> call, Throwable t) {

                    }
                });

            }
        });

        return mView;
    }

    private APIService setupRetrofit(String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        mApiService = retrofit.create(APIService.class);
        return mApiService;
    }

    //TODO date validation here
    private void dateValidation() {
        try {
            Date mFromDate = dateFormatter.parse(mFromdate.getText().toString());
            Date mToDate = dateFormatter.parse(mTodate.getText().toString());
            if (mFromDate.compareTo(mToDate) < 0) {

            } else {
                Toast.makeText(getContext(), "To Date Must Be After From Date", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //TODO ratingbar onClick here
    private void ratingbarClickEvents() {
        mRbDriving.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(getContext(), "Your Selected Ratings: " + rating, Toast.LENGTH_SHORT).show();
            }
        });

        mRbDriverBehaviour.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getContext(), "Your Selected Ratings: " + v, Toast.LENGTH_SHORT).show();
            }
        });

        mRbDriveronPerfo.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getContext(), "Your Selected Ratings: " + v, Toast.LENGTH_SHORT).show();
            }
        });

        mRbCarCondition.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getContext(), "Your Selected Ratings: " + String.valueOf(mRbCarCondition), Toast.LENGTH_SHORT).show();
            }
        });

        mRbOverallService.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getContext(), "Your Selected Ratings: " + v, Toast.LENGTH_SHORT).show();
            }
        });

        mRbAverageRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getContext(), "Your Selected Ratings: " + v, Toast.LENGTH_SHORT).show();
            }
        });
    }

    //TODO initialization method here
    private void initialization() {
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        mSpinner = (Spinner) mView.findViewById(R.id.sp_driver);
        mOverallFeedback = (EditText) mView.findViewById(R.id.met_overallFeedbackDriverSide);
        mSearch = (ImageView) mView.findViewById(R.id.miv_searchDriverSide);
        mRbDriving = (RatingBar) mView.findViewById(R.id.mrb_drivingDriverSide);
        mRbDriverBehaviour = (RatingBar) mView.findViewById(R.id.mrb_driverBehaviourDriverSide);
        mRbDriveronPerfo = (RatingBar) mView.findViewById(R.id.mrb_driversOnPerformanceTimeDriverSide);
        mRbCarCondition = (RatingBar) mView.findViewById(R.id.mrb_carConditionDriverSide);
        mRbOverallService = (RatingBar) mView.findViewById(R.id.mrb_overallServicesDriverSide);
        mRbAverageRating = (RatingBar) mView.findViewById(R.id.mrb_averageRatingDriverSide);
    }

    //TODO Date Picker Dialog Here
    private void datePickerShow() {

        mFromdate = (EditText) mView.findViewById(R.id.met_fromDateDriverSide);
        mFromdate.setInputType(InputType.TYPE_NULL);
        mFromdate.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus = true) {
                    fromDatePickerDialog.show();
                    v.clearFocus();
                }
            }
        });

        mTodate = (EditText) mView.findViewById(R.id.met_toDateDriverSide);
        mTodate.setInputType(InputType.TYPE_NULL);
        mTodate.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus = true) {
                    toDatePickerDialog.show();
                    v.clearFocus();
                }
            }
        });
    }

    //TODO setting date and time on edit text here
    private void setDateTimeField() {

        Calendar newCalendar = Calendar.getInstance();
        fromDatePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                mFromdate.setText(dateFormatter.format(newDate.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        toDatePickerDialog = new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                mTodate.setText(dateFormatter.format(newDate.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
    }
}
