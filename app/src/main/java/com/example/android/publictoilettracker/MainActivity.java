package com.example.android.publictoilettracker;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * This method does necessary background tasks to set up a map activity
     * such as getting the GPS location and appointing a marker with that
     * location
     *
     * @param view
     */
    public void prepareMap(View view) {

    }
}
