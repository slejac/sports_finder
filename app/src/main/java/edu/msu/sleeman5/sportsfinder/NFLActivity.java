package edu.msu.sleeman5.sportsfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;
import java.util.Map;

public class NFLActivity extends AppCompatActivity {

    // NFL Data Code
    private static final int DATA_TYPE = 1;

    // NFL Venues
    private static List<Map> stadiums;

    private double userLongitude = 0;
    private double userLatitude = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nflactivity);

        Intent intent = getIntent();
        userLongitude = intent.getDoubleExtra(MainActivity.CUR_LONGITUDE, 0);
        userLatitude = intent.getDoubleExtra(MainActivity.CUR_LATITUDE, 0);

        // Create List of Mappings for Each Arena
        stadiums = Populator.populate(stadiums, DATA_TYPE);
    }
}