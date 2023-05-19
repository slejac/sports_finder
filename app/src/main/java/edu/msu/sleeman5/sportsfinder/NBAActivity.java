package edu.msu.sleeman5.sportsfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class NBAActivity extends AppCompatActivity {

    private double userLongitude = 0;
    private double userLatitude = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nbaactivity);

        Intent intent = getIntent();
        userLongitude = intent.getDoubleExtra(MainActivity.CUR_LONGITUDE, 0);
        userLatitude = intent.getDoubleExtra(MainActivity.CUR_LATITUDE, 0);
    }

    /*
    Could likely use GeoCoding methods and addresses, but actual Latitudes/Longitudes are
    well-documented quicker and easier to work with, can likely avoid using an extra thread as well
     */
}