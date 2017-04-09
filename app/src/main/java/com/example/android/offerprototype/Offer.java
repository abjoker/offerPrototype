package com.example.android.offerprototype;

import android.widget.ArrayAdapter;

import static android.os.Build.VERSION_CODES.N;

/**
 * Created by asha on 25-02-2017.
 */

public class Offer{
    private static final int NO_IMAGE_RESOURCE=-1;
    private int oTitle;
    private int oDueDate;
    private int oAddress;
    private int oResourceId=NO_IMAGE_RESOURCE;

    public Offer(){}
    public Offer(int t,int d,int a,int rId){
        oTitle=t;
        oDueDate=d;
        oAddress=a;
        oResourceId=rId;
    }

    public int getTitle(){return oTitle;}
    public int getDueDate(){return oDueDate;}
    public int getAddress(){return oAddress;}

    public int getResourceId(){return oResourceId;}
    public boolean hasImage(){
        return oResourceId!=NO_IMAGE_RESOURCE;
    }
}
