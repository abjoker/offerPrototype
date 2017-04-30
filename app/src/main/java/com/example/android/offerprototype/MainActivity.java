package com.example.android.offerprototype;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar!=null)
            actionBar.hide();
        Button options  =(Button) findViewById(R.id.B1);

        options.setOnClickListener(new View.OnClickListener(){

            @Override
             public void onClick(View v){
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        TextView skip  =(TextView) findViewById(R.id.t1);

        skip.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

}}
