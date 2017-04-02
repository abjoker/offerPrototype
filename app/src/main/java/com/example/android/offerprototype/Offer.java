package com.example.android.offerprototype;

import android.widget.ArrayAdapter;

import static android.os.Build.VERSION_CODES.N;

/**
 * Created by asha on 25-02-2017.
 */

public class Offer{
    private static final int NO_IMAGE_RESOURCE=-1;
    private String oTitle;
    private String oDueDate;
    private String oAddress;
    private int oResourceId=NO_IMAGE_RESOURCE;

    public Offer(){}
    public Offer(String t,String d,String a,int rId){
        oTitle=t;
        oDueDate=d;
        oAddress=a;
        oResourceId=rId;
    }

    public String getTitle(){return oTitle;}
    public String getDueDate(){return oDueDate;}
    public String getAddress(){return oAddress;}

    public int getResourceId(){return oResourceId;}
    public boolean hasImage(){
        return oResourceId!=NO_IMAGE_RESOURCE;
    }
}
