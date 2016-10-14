package feedapp.app.com.feedapp.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import feedapp.app.com.feedapp.FeedbackFragment;
import feedapp.app.com.feedapp.R;
import feedapp.app.com.feedapp.model.ClientDetailList;

/**
 * Created by ADMIN on 03-10-2016.
 */

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.ViewHolder> {
    Context mContext;
    Bundle bundle;
    List<ClientDetailList> mClientDetailList;

    public TripAdapter(Context mContext, Bundle bundle) {
        this.mContext = mContext;
        this.bundle=bundle;
        mClientDetailList=this.bundle.getParcelableArrayList("ClientDetailList");
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.trip_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextView_TripID.setText(mClientDetailList.get(position).getTripID());

        holder.mTextView_TripID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FeedbackFragment mFeedbackFragment=new FeedbackFragment();
                mFeedbackFragment.setArguments(bundle);
                FragmentManager mFragmentManager=((FragmentActivity) mContext).getSupportFragmentManager();
                FragmentTransaction mFragmentTransaction=mFragmentManager.beginTransaction();
                mFragmentTransaction.replace(R.id.content_main,mFeedbackFragment);
                mFragmentTransaction.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mClientDetailList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView_TripID;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView_TripID=(TextView) itemView.findViewById(R.id.mTextView_tripid);
        }
    }
}
