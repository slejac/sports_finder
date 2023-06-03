package edu.msu.sleeman5.sportsfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class FinderActivity extends AppCompatActivity {

    private double userLongitude = 0;
    private double userLatitude = 0;
    private int type = 0;

    // Data from Populator
    private List<HashMap<String, String>> venues;

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finderactivity);

        Intent intent = getIntent();
        userLongitude = intent.getDoubleExtra(MainActivity.CUR_LONGITUDE, 0);
        userLatitude = intent.getDoubleExtra(MainActivity.CUR_LATITUDE, 0);
        type = intent.getIntExtra(MainActivity.SPORT_DATA, 0);

        // Create List of Mappings for Each Arena
        venues = Populator.populate(type);

        // Distance Greater than Earth's Circumnavigation, Impossible
        double min = 50000000;

        for (int i = 0; i < venues.size(); i++) {
            float[] distances = new float[1];
            Location.distanceBetween(userLatitude, userLongitude, Double.parseDouble(venues.get(i).get("latitude")), Double.parseDouble(venues.get(i).get("longitude")), distances);
            if (distances[0] < min) {
                index = i;
                min = distances[0];
            }
        }

        // Convert to Miles
        min = min * 0.000621371;

        TextView viewTeam = (TextView)findViewById(R.id.textTeam);
        viewTeam.setText(venues.get(index).get("team"));
        TextView viewVenue = (TextView)findViewById(R.id.textVenue);
        viewVenue.setText(venues.get(index).get("venue"));
        TextView viewDistance = (TextView)findViewById(R.id.textDistance);
        viewDistance.setText(Integer.toString((int)min) + " miles");
    }

    public void onDirections(View view) {
        // https://developers.google.com/maps/documentation/urls/android-intents
        String lat = venues.get(index).get("latitude");
        String lon = venues.get(index).get("longitude");
        String uriString = "google.navigation:q=";
        uriString += lat;
        uriString += ",";
        uriString += lon;
        uriString += "&mode=d";

        Uri gmmIntentUri = Uri.parse(uriString);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}