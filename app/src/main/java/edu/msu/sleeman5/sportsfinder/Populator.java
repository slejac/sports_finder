package edu.msu.sleeman5.sportsfinder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Could likely use GeoCoding methods and addresses, but actual Latitudes/Longitudes are
well-documented quicker and easier to work with, can likely avoid using an extra thread as well
*/
public class Populator {
    public static List<HashMap<String, String>> populate(int dataType) {
        List<HashMap<String, String>> data = new ArrayList<>();
        if (dataType == 1) {  // NFL
            // NFC East
            HashMap tempMap = new HashMap();
            tempMap.put("team", "Washington Commanders");
            tempMap.put("venue", "FedExField");
            tempMap.put("latitude", "38.5428");
            tempMap.put("longitude", "-76.5152");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New York Giants");
            tempMap.put("venue", "MetLife Stadium");
            tempMap.put("latitude", "40.8135");
            tempMap.put("longitude", "-74.0745");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Philadelphia Eagles");
            tempMap.put("venue", "Lincoln Financial Field");
            tempMap.put("latitude", "39.9005");
            tempMap.put("longitude", "-75.1672");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Dallas Cowboys");
            tempMap.put("venue", "AT&T Stadium");
            tempMap.put("latitude", "32.7480");
            tempMap.put("longitude", "-97.0934");
            data.add(tempMap);

            // NFC North
            tempMap = new HashMap();
            tempMap.put("team", "Detroit Lions");
            tempMap.put("venue", "Ford Field");
            tempMap.put("latitude", "42.3373");
            tempMap.put("longitude", "-83.0407");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Chicago Bears");
            tempMap.put("venue", "Soldier Field");
            tempMap.put("latitude", "41.8575");
            tempMap.put("longitude", "-87.6167");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Green Bay Packers");
            tempMap.put("venue", "Lambeau Field");
            tempMap.put("latitude", "44.5013");
            tempMap.put("longitude", "-88.0622");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Minnesota Vikings");
            tempMap.put("venue", "U.S. Bank Stadium");
            tempMap.put("latitude", "44.9736");
            tempMap.put("longitude", "-93.2575");
            data.add(tempMap);

            // NFC South
            tempMap = new HashMap();
            tempMap.put("team", "Carolina Panthers");
            tempMap.put("venue", "Bank of America Stadium");
            tempMap.put("latitude", "35.2258");
            tempMap.put("longitude", "-80.8530");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Tampa Bay Buccaneers");
            tempMap.put("venue", "Raymond James Stadium");
            tempMap.put("latitude", "27.9759");
            tempMap.put("longitude", "-82.5033");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New Orleans Saints");
            tempMap.put("venue", "Caesars Superdome");
            tempMap.put("latitude", "29.9505");
            tempMap.put("longitude", "-90.0753");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Atlanta Falcons");
            tempMap.put("venue", "Mercedes-Benz Stadium");
            tempMap.put("latitude", "33.7370");
            tempMap.put("longitude", "-84.3870");
            data.add(tempMap);

            // NFC West
            tempMap = new HashMap();
            tempMap.put("team", "Arizona Cardinals");
            tempMap.put("venue", "State Farm Stadium");
            tempMap.put("latitude", "33.5276");
            tempMap.put("longitude", "-112.2626");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Los Angeles Rams");
            tempMap.put("venue", "SoFi Stadium");
            tempMap.put("latitude", "34.0112");
            tempMap.put("longitude", "-117.8275");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "San Francisco 49ers");
            tempMap.put("venue", "Levi's Stadium");
            tempMap.put("latitude", "37.4033");
            tempMap.put("longitude", "-121.9694");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Seattle Seahawks");
            tempMap.put("venue", "Lumen Field");
            tempMap.put("latitude", "47.5951");
            tempMap.put("longitude", "-122.3321");
            data.add(tempMap);

            // AFC East
            tempMap = new HashMap();
            tempMap.put("team", "Miami Dolphins");
            tempMap.put("venue", "Hard Rock Stadium");
            tempMap.put("latitude", "25.9583");
            tempMap.put("longitude", "-80.2396");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New York Jets");
            tempMap.put("venue", "MetLife Stadium");
            tempMap.put("latitude", "40.8135");
            tempMap.put("longitude", "-74.0745");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Buffalo Bills");
            tempMap.put("venue", "Highmark Stadium");
            tempMap.put("latitude", "42.7738");
            tempMap.put("longitude", "-78.7870");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New England Patriots");
            tempMap.put("venue", "Gillette Stadium");
            tempMap.put("latitude", "42.0878");
            tempMap.put("longitude", "-71.2587");
            data.add(tempMap);

            // AFC North
            tempMap = new HashMap();
            tempMap.put("team", "Baltimore Ravens");
            tempMap.put("venue", "M&T Bank Stadium");
            tempMap.put("latitude", "39.2780");
            tempMap.put("longitude", "-76.6227");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Cincinnati Bengals");
            tempMap.put("venue", "Paul Brown Stadium");
            tempMap.put("latitude", "39.0946");
            tempMap.put("longitude", "-84.5173");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Pittsburgh Steelers");
            tempMap.put("venue", "Heinz Field");
            tempMap.put("latitude", "40.4468");
            tempMap.put("longitude", "-80.0157");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Cleveland Browns");
            tempMap.put("venue", "FirstEnergy Stadium");
            tempMap.put("latitude", "41.5061");
            tempMap.put("longitude", "-81.6995");
            data.add(tempMap);

            // AFC South
            tempMap = new HashMap();
            tempMap.put("team", "Jacksonville Jaguars");
            tempMap.put("venue", "TIAA Bank Field");
            tempMap.put("latitude", "30.3239");
            tempMap.put("longitude", "-81.6373");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Houston Texans");
            tempMap.put("venue", "NRG Stadium");
            tempMap.put("latitude", "29.6847");
            tempMap.put("longitude", "-95.4107");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Tennessee Titans");
            tempMap.put("venue", "Nissan Stadium");
            tempMap.put("latitude", "36.1665");
            tempMap.put("longitude", "-86.7713");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Indianapolis Colts");
            tempMap.put("venue", "Lucas Oil Stadium");
            tempMap.put("latitude", "39.7601");
            tempMap.put("longitude", "-86.1639");
            data.add(tempMap);

            // AFC West
            tempMap = new HashMap();
            tempMap.put("team", "Denver Broncos");
            tempMap.put("venue", "Empower Field at Mile High");
            tempMap.put("latitude", "39.7439");
            tempMap.put("longitude", "-105.0201");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Las Vegas Raiders");
            tempMap.put("venue", "Allegiant Stadium");
            tempMap.put("latitude", "36.0909");
            tempMap.put("longitude", "-115.1833");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Los Angeles Chargers");
            tempMap.put("venue", "SoFi Stadium");
            tempMap.put("latitude", "34.0112");
            tempMap.put("longitude", "-117.8275");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Kansas City Chiefs");
            tempMap.put("venue", "GEHA Field at Arrowhead Stadium");
            tempMap.put("latitude", "39.0489");
            tempMap.put("longitude", "-94.4839");
            data.add(tempMap);

        } else if (dataType == 2) {  // NBA
            // Atlantic Division
            HashMap tempMap = new HashMap();
            tempMap.put("team", "Brooklyn Nets");
            tempMap.put("venue", "Barclays Center");
            tempMap.put("latitude", "40.6826");
            tempMap.put("longitude", "-73.9754");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New York Knicks");
            tempMap.put("venue", "Madison Square Garden");
            tempMap.put("latitude", "40.7505");
            tempMap.put("longitude", "-73.9934");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Philadelphia 76ers");
            tempMap.put("venue", "Wells Fargo Center");
            tempMap.put("latitude", "39.9012");
            tempMap.put("longitude", "-75.1720");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Toronto Raptors");
            tempMap.put("venue", "Scotiabank Arena");
            tempMap.put("latitude", "43.6435");
            tempMap.put("longitude", "-79.3791");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Boston Celtics");
            tempMap.put("venue", "TD Garden");
            tempMap.put("latitude", "42.3662");
            tempMap.put("longitude", "-71.0621");
            data.add(tempMap);

            // Central Division
            tempMap = new HashMap();
            tempMap.put("team", "Detroit Pistons");
            tempMap.put("venue", "Little Caesars Arena");
            tempMap.put("latitude", "42.3411");
            tempMap.put("longitude", "-83.0553");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Milwaukee Bucks");
            tempMap.put("venue", "Fiserv Forum");
            tempMap.put("latitude", "43.0451");
            tempMap.put("longitude", "-87.9174");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Chicago Bulls");
            tempMap.put("venue", "United Center");
            tempMap.put("latitude", "41.8807");
            tempMap.put("longitude", "-87.6742");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Cleveland Cavaliers");
            tempMap.put("venue", "Rocket Mortgage FieldHouse");
            tempMap.put("latitude", "41.4965");
            tempMap.put("longitude", "-81.6881");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Indiana Pacers");
            tempMap.put("venue", "Gainbridge Fieldhouse");
            tempMap.put("latitude", "39.7640");
            tempMap.put("longitude", "-86.1555");
            data.add(tempMap);

            // Southeast Division
            tempMap = new HashMap();
            tempMap.put("team", "Washington Wizards");
            tempMap.put("venue", "Capital One Arena");
            tempMap.put("latitude", "38.8982");
            tempMap.put("longitude", "-77.0209");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Miami Heat");
            tempMap.put("venue", "Kaseya Center");
            tempMap.put("latitude", "25.7814");
            tempMap.put("longitude", "-80.1870");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Orlando Magic");
            tempMap.put("venue", "Amway Center");
            tempMap.put("latitude", "28.5392");
            tempMap.put("longitude", "-81.3839");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Atlanta Hawks");
            tempMap.put("venue", "State Farm Arena");
            tempMap.put("latitude", "33.7573");
            tempMap.put("longitude", "-84.3963");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Charlotte Hornets");
            tempMap.put("venue", "Spectrum Center");
            tempMap.put("latitude", "35.2217");
            tempMap.put("longitude", "-80.8368");
            data.add(tempMap);

            // Southwest Division
            tempMap = new HashMap();
            tempMap.put("team", "Dallas Mavericks");
            tempMap.put("venue", "American Airlines Center");
            tempMap.put("latitude", "32.7905");
            tempMap.put("longitude", "-96.8110");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "San Antonio Spurs");
            tempMap.put("venue", "AT&T Center");
            tempMap.put("latitude", "29.4270");
            tempMap.put("longitude", "-98.4375");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Houston Rockets");
            tempMap.put("venue", "Toyota Center");
            tempMap.put("latitude", "29.7508");
            tempMap.put("longitude", "-95.3621");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New Orleans Pelicans");
            tempMap.put("venue", "Smoothie King Center");
            tempMap.put("latitude", "29.9427");
            tempMap.put("longitude", "-90.0758");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Memphis Grizzlies");
            tempMap.put("venue", "FedExForum");
            tempMap.put("latitude", "35.1363");
            tempMap.put("longitude", "-90.0503");
            data.add(tempMap);

            // Northwest Division
            tempMap = new HashMap();
            tempMap.put("team", "Denver Nuggets");
            tempMap.put("venue", "Ball Arena");
            tempMap.put("latitude", "39.7425");
            tempMap.put("longitude", "-105.0045");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Utah Jazz");
            tempMap.put("venue", "Vivint Arena");
            tempMap.put("latitude", "40.7683");
            tempMap.put("longitude", "-111.9011");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Minnesota Timberwolves");
            tempMap.put("venue", "Target Center");
            tempMap.put("latitude", "44.9795");
            tempMap.put("longitude", "-93.2761");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Oklahoma City Thunder");
            tempMap.put("venue", "Paycom Center");
            tempMap.put("latitude", "35.4580");
            tempMap.put("longitude", "-97.5090");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Portland Trailblazers");
            tempMap.put("venue", "Moda Center");
            tempMap.put("latitude", "45.5257");
            tempMap.put("longitude", "-122.6667");
            data.add(tempMap);

            // Pacific
            tempMap = new HashMap();
            tempMap.put("team", "Phoenix Suns");
            tempMap.put("venue", "Footprint Center");
            tempMap.put("latitude", "33.4457");
            tempMap.put("longitude", "-112.0712");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Sacramento Kings");
            tempMap.put("venue", "Golden 1 Center");
            tempMap.put("latitude", "38.5802");
            tempMap.put("longitude", "-121.4997");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Golden State Warriors");
            tempMap.put("venue", "Chase Center");
            tempMap.put("latitude", "37.7680");
            tempMap.put("longitude", "-122.3879");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Los Angeles Clippers");
            tempMap.put("venue", "Crypto.com Arena");
            tempMap.put("latitude", "34.0430");
            tempMap.put("longitude", "-118.2673");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Los Angeles Lakers");
            tempMap.put("venue", "Crypto.com Arena");
            tempMap.put("latitude", "34.0430");
            tempMap.put("longitude", "-118.2673");
            data.add(tempMap);
        } else if (dataType == 3) {  // MLB

        } else if (dataType == 4) {  // NHL

        }
        return data;
    }
}
