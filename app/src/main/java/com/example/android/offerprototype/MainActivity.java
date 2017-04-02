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

        Button options  =(Button) findViewById(R.id.B1);

        options.setOnClickListener(new View.OnClickListener(){

            @Override
             public void onClick(View v){
                Intent intent =new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        ImageButton myOffer = (ImageButton) findViewById(R.id.google);

        myOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://accounts.google.com/ServiceLogin?passive=1209600&osid=1&continue=https://plus.google.com/apps/activities&followup=https://plus.google.com/apps/activities");
                Intent intent =new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);}
            }
        });

        ImageButton myOffer2 = (ImageButton) findViewById(R.id.twitter);

        myOffer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://twitter.com/login");
                Intent intent =new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);}
            }
        });

        ImageButton myOffer3 = (ImageButton) findViewById(R.id.facebook);

        myOffer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://en-gb.facebook.com/login/");
                Intent intent =new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);}
            }
        });


}}
