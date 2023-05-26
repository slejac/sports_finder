package edu.msu.sleeman5.sportsfinder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Could likely use GeoCoding methods and addresses, but actual Latitudes/Longitudes are
well-documented quicker and easier to work with, can likely avoid using an extra thread as well
*/
public class Populator {
    public static List<Map<String, String>> populate(List<Map<String, String>> data, double dataType) {
        if (dataType == 1) {  // NFL
            // NFC East
            Map tempMap = new HashMap();
            tempMap.put("team", "Washington Commanders");
            tempMap.put("venue", "FedExField");
            tempMap.put("latitude", "38.5428");
            tempMap.put("longitude", "-76.5152");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "New York Giants");
            tempMap.put("venue", "MetLife Stadium");
            tempMap.put("latitude", "40.8135");
            tempMap.put("longitude", "-74.0745");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Philadelphia Eagles");
            tempMap.put("venue", "Lincoln Financial Field");
            tempMap.put("latitude", "39.9005");
            tempMap.put("longitude", "-75.1672");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Dallas Cowboys");
            tempMap.put("venue", "AT&T Stadium");
            tempMap.put("latitude", "32.7480");
            tempMap.put("longitude", "-97.0934");
            data.add(tempMap);

            // NFC North
            tempMap.clear();
            tempMap.put("team", "Detroit Lions");
            tempMap.put("venue", "Ford Field");
            tempMap.put("latitude", "42.3373");
            tempMap.put("longitude", "-83.0407");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Chicago Bears");
            tempMap.put("venue", "Soldier Field");
            tempMap.put("latitude", "41.8575");
            tempMap.put("longitude", "-87.6167");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Green Bay Packers");
            tempMap.put("venue", "Lambeau Field");
            tempMap.put("latitude", "44.5013");
            tempMap.put("longitude", "-88.0622");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Minnesota Vikings");
            tempMap.put("venue", "U.S. Bank Stadium");
            tempMap.put("latitude", "44.9736");
            tempMap.put("longitude", "-93.2575");
            data.add(tempMap);

            // NFC South
            tempMap.clear();
            tempMap.put("team", "Carolina Panthers");
            tempMap.put("venue", "Bank of America Stadium");
            tempMap.put("latitude", "35.2258");
            tempMap.put("longitude", "-80.8530");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Tampa Bay Buccaneers");
            tempMap.put("venue", "Raymond James Stadium");
            tempMap.put("latitude", "27.9759");
            tempMap.put("longitude", "-82.5033");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "New Orleans Saints");
            tempMap.put("venue", "Caesars Superdome");
            tempMap.put("latitude", "29.9505");
            tempMap.put("longitude", "-90.0753");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Atlanta Falcons");
            tempMap.put("venue", "Mercedes-Benz Stadium");
            tempMap.put("latitude", "33.7370");
            tempMap.put("longitude", "-84.3870");
            data.add(tempMap);

            // NFC West
            tempMap.clear();
            tempMap.put("team", "Arizona Cardinals");
            tempMap.put("venue", "State Farm Stadium");
            tempMap.put("latitude", "33.5276");
            tempMap.put("longitude", "-112.2626");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Los Angeles Rams");
            tempMap.put("venue", "SoFi Stadium");
            tempMap.put("latitude", "34.0112");
            tempMap.put("longitude", "-117.8275");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "San Francisco 49ers");
            tempMap.put("venue", "Levi's Stadium");
            tempMap.put("latitude", "37.4033");
            tempMap.put("longitude", "-121.9694");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Seattle Seahawks");
            tempMap.put("venue", "Lumen Field");
            tempMap.put("latitude", "47.5951");
            tempMap.put("longitude", "-122.3321");
            data.add(tempMap);

            // AFC East
            tempMap.clear();
            tempMap.put("team", "Miami Dolphins");
            tempMap.put("venue", "Hard Rock Stadium");
            tempMap.put("latitude", "25.9583");
            tempMap.put("longitude", "-80.2396");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "New York Jets");
            tempMap.put("venue", "MetLife Stadium");
            tempMap.put("latitude", "40.8135");
            tempMap.put("longitude", "-74.0745");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Buffalo Bills");
            tempMap.put("venue", "Highmark Stadium");
            tempMap.put("latitude", "42.7738");
            tempMap.put("longitude", "-78.7870");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "New England Patriots");
            tempMap.put("venue", "Gillette Stadium");
            tempMap.put("latitude", "42.0878");
            tempMap.put("longitude", "-71.2587");
            data.add(tempMap);

            // AFC North
            tempMap.clear();
            tempMap.put("team", "Baltimore Ravens");
            tempMap.put("venue", "M&T Bank Stadium");
            tempMap.put("latitude", "39.2780");
            tempMap.put("longitude", "-76.6227");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Cincinnati Bengals");
            tempMap.put("venue", "Paul Brown Stadium");
            tempMap.put("latitude", "39.0946");
            tempMap.put("longitude", "-84.5173");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Pittsburgh Steelers");
            tempMap.put("venue", "Heinz Field");
            tempMap.put("latitude", "40.4468");
            tempMap.put("longitude", "-80.0157");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Cleveland Browns");
            tempMap.put("venue", "FirstEnergy Stadium");
            tempMap.put("latitude", "41.5061");
            tempMap.put("longitude", "-81.6995");
            data.add(tempMap);

            // AFC South
            tempMap.clear();
            tempMap.put("team", "Jacksonville Jaguars");
            tempMap.put("venue", "TIAA Bank Field");
            tempMap.put("latitude", "30.3239");
            tempMap.put("longitude", "-81.6373");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Houston Texans");
            tempMap.put("venue", "NRG Stadium");
            tempMap.put("latitude", "29.6847");
            tempMap.put("longitude", "-95.4107");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Tennessee Titans");
            tempMap.put("venue", "Nissan Stadium");
            tempMap.put("latitude", "36.1665");
            tempMap.put("longitude", "-86.7713");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Indianapolis Colts");
            tempMap.put("venue", "Lucas Oil Stadium");
            tempMap.put("latitude", "39.7601");
            tempMap.put("longitude", "-86.1639");
            data.add(tempMap);

            // AFC West
            tempMap.clear();
            tempMap.put("team", "Denver Broncos");
            tempMap.put("venue", "Empower Field at Mile High");
            tempMap.put("latitude", "39.7439");
            tempMap.put("longitude", "-105.0201");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Las Vegas Raiders");
            tempMap.put("venue", "Allegiant Stadium");
            tempMap.put("latitude", "36.0909");
            tempMap.put("longitude", "-115.1833");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Los Angeles Chargers");
            tempMap.put("venue", "SoFi Stadium");
            tempMap.put("latitude", "34.0112");
            tempMap.put("longitude", "-117.8275");
            data.add(tempMap);

            tempMap.clear();
            tempMap.put("team", "Kansas City Chiefs");
            tempMap.put("venue", "GEHA Field at Arrowhead Stadium");
            tempMap.put("latitude", "39.0489");
            tempMap.put("longitude", "-94.4839");
            data.add(tempMap);
        } else if (dataType == 2) {  // NBA

        } else if (dataType == 3) {  // MLB

        } else if (dataType == 4) {  // NHL

        }
        return data;
    }
}
