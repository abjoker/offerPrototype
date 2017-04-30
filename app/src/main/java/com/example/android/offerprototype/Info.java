package com.example.android.offerprototype;

/**
 * Created by asha on 08-04-2017.
 */

public class Info {



        private String place;
        private int distance;
        //private String url;


        Info(){}
        Info(String ePlace,int eDistance){

            place=ePlace;
            distance=eDistance;

        }


        public String getPlace(){return place;}
      public int getDistance(){return distance;}


    }
