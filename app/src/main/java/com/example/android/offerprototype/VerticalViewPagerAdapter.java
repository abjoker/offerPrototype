package com.example.android.offerprototype;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by asha on 28-03-2017.
 */



import java.util.ArrayList;


/**
 * Created by rizvan on 12/13/16.
 */

public class VerticalViewPagerAdapter extends PagerAdapter {


    Context mContext;
    LayoutInflater mLayoutInflater;
    ArrayList<Offer> arrayListinPager=new ArrayList<>();

    public VerticalViewPagerAdapter(Context context, ArrayList<Offer> arrayList) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        arrayListinPager=arrayList;
    }

    //The Changes begin from here..
    @Override
    public int getCount() {
        return 12;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        View itemView = mLayoutInflater.inflate(R.layout.content_main2, container, false);
        Offer offer= arrayListinPager.get(position%4);

        TextView tTitle = (TextView) itemView.findViewById(R.id.title);
        TextView tDueDate = (TextView) itemView.findViewById(R.id.due_date);
        TextView tAddress = (TextView) itemView.findViewById(R.id.address);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.offer_pic);

        tTitle.setText(offer.getTitle());
            tDueDate.setText(offer.getDueDate());
            tAddress.setText(offer.getAddress());
            imageView.setImageResource(offer.getResourceId());

        ImageView info = (ImageView) itemView.findViewById(R.id.info);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    Intent intent = new Intent(mContext.getApplicationContext(), The_List.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    mContext.startActivity(intent);
                }

            }
        });
        ImageView back = (ImageView) itemView.findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(mContext.getApplicationContext(),MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);


            }
        });

//        ImageView top = (ImageView) itemView.findViewById(R.id.back_to_top);
//
//        top.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//          instantiateItem(container,0);
//
//            }
//        });


//        LinearLayout linearLayout=(LinearLayout) itemView.findViewById(R.id.complete_view);
//        linearLayout.setOnTouchListener(new OnSwipeTouchListener(mContext.getApplicationContext()) {
//
//            public void onSwipeLeft() {
//                Intent intent =new Intent(mContext.getApplicationContext(),The_List.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                mContext.startActivity(intent);
//            }
//
//        });


        container.addView(itemView);
        return itemView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}

