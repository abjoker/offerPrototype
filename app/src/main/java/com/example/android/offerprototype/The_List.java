package com.example.android.offerprototype;

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
    private static final String LOG_TAG = The_List.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_for_list);
        final ArrayList<Info> arrayList=new ArrayList<>();
        arrayList.add(new Info("The Plaza"));
        arrayList.add(new Info("The Mall"));
        arrayList.add(new Info("A shop"));
        arrayList.add(new Info("A Place"));
        arrayList.add(new Info("Second Floor"));
        arrayList.add(new Info("An Outlet"));
                listView=(ListView)findViewById(R.id.layout_for_list);
                infoAdapter=new TheListAdapter(this,arrayList);
                listView.setAdapter(infoAdapter);
        Log.i(LOG_TAG,"Text: ListView created");

        //ListView linearLayout=(ListView) findViewById(R.id.layout_for_list);
//        listView.setOnTouchListener(new OnSwipeTouchListener(The_List.this) {
//
//            public void onSwipeRight() {
//                Intent intent =new Intent(The_List.this,Main2Activity.class);
//                startActivity(intent);
//            }
//
//
//        });
    }}

