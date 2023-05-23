package edu.msu.sleeman5.sportsfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;
import java.util.Map;

public class NBAActivity extends AppCompatActivity {

    // NBA Data Code
    private static final int DATA_TYPE = 2;

    // NBA Arenas
    private static List<Map> arenas;

    private double userLongitude = 0;
    private double userLatitude = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nbaactivity);

        Intent intent = getIntent();
        userLongitude = intent.getDoubleExtra(MainActivity.CUR_LONGITUDE, 0);
        userLatitude = intent.getDoubleExtra(MainActivity.CUR_LATITUDE, 0);

        // Create List of Mappings for Each Arena
        arenas = Populator.populate(arenas, DATA_TYPE);
    }
}