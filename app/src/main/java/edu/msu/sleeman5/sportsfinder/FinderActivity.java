package edu.msu.sleeman5.sportsfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;
import java.util.Map;

public class FinderActivity extends AppCompatActivity {

    // MLB Fields
    private static List<Map<String, String>> fields;

    private double userLongitude = 0;
    private double userLatitude = 0;
    private double type = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finderactivity);

        Intent intent = getIntent();
        userLongitude = intent.getDoubleExtra(MainActivity.CUR_LONGITUDE, 0);
        userLatitude = intent.getDoubleExtra(MainActivity.CUR_LATITUDE, 0);
        type = intent.getDoubleExtra(MainActivity.SPORT_DATA, 0);

        // Create List of Mappings for Each Arena
        fields = Populator.populate(fields, type);
    }
}