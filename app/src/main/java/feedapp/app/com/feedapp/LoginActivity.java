package feedapp.app.com.feedapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feedapp.app.com.feedapp.model.CarDetail;
import feedapp.app.com.feedapp.model.ClientDetailList;
import feedapp.app.com.feedapp.model.ClientInfo;
import feedapp.app.com.feedapp.model.CarReviewFragmentResponse.DriverDetail;
import feedapp.app.com.feedapp.model.GuestDetail;
import feedapp.app.com.feedapp.service.APIService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {
    EditText mEditText_Contact;
    String contact;
    Button mButton_Login;
    APIService mAPIService;
    List<ClientDetailList> mClientDetailList=new ArrayList<>();
    List<CarDetail> mCarDetailList=new ArrayList<>();
    List<DriverDetail> mDriverDetailList=new ArrayList<>();
    List<GuestDetail> mGuestDetailList=new ArrayList<>();
    private String baseURL="http://192.227.159.120:8080/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TODO initialization() called here
        initialization();

        //TODO login button click event here
        mButton_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact=mEditText_Contact.getText().toString();
                if(!contact.equals(""))
                {
                    mAPIService=setupRetrofit(baseURL);
                    Map<String,String> params=new HashMap<String, String>();
                    params.put("contactNo",contact);
                    Call<ClientInfo> mCall=mAPIService.getClientInfoCall(params);
                    Log.e("url", ""+mCall.request().url());
                    mCall.enqueue(new Callback<ClientInfo>() {
                        @Override
                        public void onResponse(Call<ClientInfo> call, Response<ClientInfo> response) {
                            try {
                                mClientDetailList=response.body().getClientDetailList();

                                /*String tripID=mClientDetailList.get(0).getTripID();*/
                                for(int i=0;i<mClientDetailList.size();i++){
                                    mGuestDetailList.add(mClientDetailList.get(i).getGuestDetail());
                                    mCarDetailList.add(mClientDetailList.get(i).getCarDetail());
                                    mDriverDetailList.add(mClientDetailList.get(i).getCarDetail().getDriverDetail());
                                }
                                Intent mIntent=new Intent(LoginActivity.this,MainActivity.class);
                                Bundle bundle=new Bundle();
                                bundle.putParcelableArrayList("ClientDetailList",(ArrayList<? extends Parcelable>) mClientDetailList);
                                bundle.putParcelableArrayList("GuestDetailList",(ArrayList<? extends Parcelable>) mGuestDetailList);
                                bundle.putParcelableArrayList("CarDetailList",(ArrayList<? extends Parcelable>) mCarDetailList);
                                bundle.putParcelableArrayList("DriverDetailList",(ArrayList<? extends Parcelable>) mDriverDetailList);
                                mIntent.putExtras(bundle);
                                startActivity(mIntent);
                            }catch (Exception e) {
                                Toast.makeText(LoginActivity.this, "Please Enter Valid Number", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<ClientInfo> call, Throwable t) {

                        }
                    });

                }
                else{
                    Toast.makeText(LoginActivity.this,"Please Enter Contact Number",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //TODO initialization method here
    private void initialization() {
        mEditText_Contact=(EditText) findViewById(R.id.et_contact);
        mButton_Login=(Button) findViewById(R.id.mButton_login);
    }

    //TODO SetupRetrofit Method here
    public static APIService setupRetrofit(String url) {
        Retrofit mRetrofit=new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();

        APIService mAPIService=mRetrofit.create(APIService.class);
        return mAPIService;
    }
}
