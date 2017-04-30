package com.example.android.offerprototype;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by asha on 28-03-2017.
 */
import com.google.gson.Gson;

import java.util.ArrayList;

public class VerticalViewPagerAdapter extends PagerAdapter {
    View.OnClickListener mOnClickListener;

    Context mContext;
    LayoutInflater mLayoutInflater;
    ArrayList<Offer> arrayListinPager=new ArrayList<>();

    public VerticalViewPagerAdapter(Context context, ArrayList<Offer> arraylist) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        arrayListinPager=arraylist;
    }

    //The Changes begin from here..
    @Override
    public int getCount() {
        return arrayListinPager.size()*2;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        View itemView = mLayoutInflater.inflate(R.layout.content_main2, container, false);
        final Offer offer= arrayListinPager.get(position%2);

        TextView tTitle = (TextView) itemView.findViewById(R.id.title);
        TextView tDueDate = (TextView) itemView.findViewById(R.id.due_date);
        TextView tAddress = (TextView) itemView.findViewById(R.id.address);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.offer_pic);



        tTitle.setText(offer.getTitle());
            tDueDate.setText(offer.getDueDate());
            tAddress.setText(offer.getAddress());
            imageView.setImageResource(offer.getResourceId());

        ImageView info = (ImageView) itemView.findViewById(R.id.info3);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext.getApplicationContext(), The_List.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                mContext.startActivity(intent);
                ((Activity) mContext).overridePendingTransition( R.anim.your_right_to_left,R.anim.your_left_to_right);


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

       final ImageView star = (ImageView) itemView.findViewById(R.id.add_favourite);

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(star.getSolidColor()!= Color.CYAN)
                {star.setColorFilter(Color.CYAN);
                    Snackbar snackbar = Snackbar
                            .make(star, "You marked it as favourite", Snackbar.LENGTH_LONG)
                            .setAction("Undo",mOnClickListener);
                    snackbar.setActionTextColor(Color.WHITE);
                    View snackbarView = snackbar.getView();
                    snackbarView.setBackgroundColor(Color.DKGRAY);
                    TextView textView = (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.YELLOW);
                    snackbar.show();

                }
                else
                star.setColorFilter(Color.WHITE);




            }
        });

        ImageView share = (ImageView) itemView.findViewById(R.id.share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent =new Intent(mContext.getApplicationContext(),MainActivity.class);
//
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                mContext.startActivity(intent);

                String msg=mContext.getResources().getString(offer.getTitle())+"\n"+mContext.getResources().getString(offer.getAddress());
                Intent i=new Intent(android.content.Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject test");
                i.putExtra(android.content.Intent.EXTRA_TEXT, msg);
                mContext.startActivity(Intent.createChooser(i,"Share via"));
            }
        });

        LinearLayout linearLayout=(LinearLayout) itemView.findViewById(R.id.complete_view);
        linearLayout.setOnTouchListener(new OnSwipeTouchListener(mContext.getApplicationContext()) {

            public void onSwipeLeft() {

                Intent intent =new Intent(mContext.getApplicationContext(),The_List.class);

                mContext.startActivity(intent);
                ((Activity) mContext).overridePendingTransition( R.anim.your_right_to_left,R.anim.your_left_to_right);


            }

        });


        container.addView(itemView);
        return itemView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }


}

