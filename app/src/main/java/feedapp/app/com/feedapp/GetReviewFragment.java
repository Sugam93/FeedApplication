package feedapp.app.com.feedapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class GetReviewFragment extends Fragment {
    Button mButton_carnumberreview,mButton_drivernamereview;

    public GetReviewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_get_review, container, false);

        //TODO car number review fragment called here
        mButton_carnumberreview= (Button) view.findViewById(R.id.mButton_carnumberreview);
        mButton_carnumberreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarReviewFragment mCarReviewFragment=new CarReviewFragment();
                FragmentManager mFragmentManager=getFragmentManager();
                FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.content_main,mCarReviewFragment);
                mFragmentTransaction.commit();
            }
        });

        //TODO driver name review fragment called here
        mButton_drivernamereview= (Button) view.findViewById(R.id.mButton_drivernamereview);
        mButton_drivernamereview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DriverReviewFragment mDriverReviewFragment=new DriverReviewFragment();
                FragmentManager mFragmentManager=getFragmentManager();
                FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.content_main,mDriverReviewFragment);
                mFragmentTransaction.commit();
            }
        });

        return view;
    }

}
