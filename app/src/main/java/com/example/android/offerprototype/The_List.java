package com.example.android.offerprototype;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by asha on 08-04-2017.
 */

public class The_List extends AppCompatActivity {
    private TheListAdapter infoAdapter;
    private ListView listView;
    Context context;

    private static final String LOG_TAG = The_List.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_list);
        ArrayList<Info> arraylist=new ArrayList<>();
        arraylist.add(new Info("The Plaza",12));
        arraylist.add(new Info("The Mall",6));
        arraylist.add(new Info("A shop",8));
        arraylist.add(new Info("A Place",10));
        arraylist.add(new Info("Second Floor",14));
        arraylist.add(new Info("An Outlet",7));
        listView=(ListView)findViewById(R.id.layout_for_list);
        infoAdapter=new TheListAdapter(this,arraylist);
        listView.setAdapter(infoAdapter);
        Log.i(LOG_TAG,"Text: ListView created");


        listView.setOnTouchListener(new OnSwipeTouchListener(The_List.this) {

            public void onSwipeRight() {
                Intent intent =new Intent(The_List.this,Main2Activity.class);

                ((Activity) context).overridePendingTransition(R.anim.right,R.anim.left);
                startActivity(intent);
                }


        });
    }}


