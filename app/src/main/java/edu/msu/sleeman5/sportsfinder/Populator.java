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
            // AL East
            HashMap tempMap = new HashMap();
            tempMap.put("team", "New York Yankees");
            tempMap.put("venue", "Yankee Stadium");
            tempMap.put("latitude", "40.8296");
            tempMap.put("longitude", "-73.9262");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Boston Red Sox");
            tempMap.put("venue", "Fenway Park");
            tempMap.put("latitude", "42.3467");
            tempMap.put("longitude", "-71.0972");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Tampa Bay Rays");
            tempMap.put("venue", "Tropicana Field");
            tempMap.put("latitude", "27.7682");
            tempMap.put("longitude", "-82.6534");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Toronto Blue Jays");
            tempMap.put("venue", "Rogers Centre");
            tempMap.put("latitude", "43.6418");
            tempMap.put("longitude", "-79.3901");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Baltimore Orioles");
            tempMap.put("venue", "Oriole Park at Camden Yards");
            tempMap.put("latitude", "39.2838");
            tempMap.put("longitude", "-76.6217");
            data.add(tempMap);

            // AL Central
            tempMap = new HashMap();
            tempMap.put("team", "Detroit Tigers");
            tempMap.put("venue", "Comerica Park");
            tempMap.put("latitude", "42.3390");
            tempMap.put("longitude", "-83.0485");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Minnesota Twins");
            tempMap.put("venue", "Target Field");
            tempMap.put("latitude", "44.9817");
            tempMap.put("longitude", "-93.2776");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Chicago White Sox");
            tempMap.put("venue", "Guaranteed Rate Field");
            tempMap.put("latitude", "41.8300");
            tempMap.put("longitude", "-87.6339");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Cleveland Guardians");
            tempMap.put("venue", "Progressive Field");
            tempMap.put("latitude", "41.4908");
            tempMap.put("longitude", "-81.6845");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Kansas City Royals");
            tempMap.put("venue", "Kauffman Stadium");
            tempMap.put("latitude", "39.0517");
            tempMap.put("longitude", "-94.4803");
            data.add(tempMap);

            // AL West
            tempMap = new HashMap();
            tempMap.put("team", "Houston Astros");
            tempMap.put("venue", "Minute Maid Park");
            tempMap.put("latitude", "29.7572");
            tempMap.put("longitude", "-95.3552");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Texas Rangers");
            tempMap.put("venue", "Globe Life Field");
            tempMap.put("latitude", "32.7475");
            tempMap.put("longitude", "-97.0838");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Seattle Mariners");
            tempMap.put("venue", "T-Mobile Park");
            tempMap.put("latitude", "47.5913");
            tempMap.put("longitude", "-122.3325");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Los Angeles Angels");
            tempMap.put("venue", "Angel Stadium of Anaheim");
            tempMap.put("latitude", "33.8003");
            tempMap.put("longitude", "-117.8827");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Oakland Athletics");
            tempMap.put("venue", "Oakland-Alameda County Coliseum");
            tempMap.put("latitude", "37.7516");
            tempMap.put("longitude", "-122.2005");
            data.add(tempMap);

            // NL East
            tempMap = new HashMap();
            tempMap.put("team", "Atlanta Braves");
            tempMap.put("venue", "Truist Park");
            tempMap.put("latitude", "33.8911");
            tempMap.put("longitude", "-84.4684");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Miami Marlins");
            tempMap.put("venue", "LoanDepot Park");
            tempMap.put("latitude", "25.7781");
            tempMap.put("longitude", "-80.2196");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New York Mets");
            tempMap.put("venue", "Citi Field");
            tempMap.put("latitude", "40.7542");
            tempMap.put("longitude", "-73.8408");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Philadelphia Phillies");
            tempMap.put("venue", "Citizens Bank Park");
            tempMap.put("latitude", "39.9035");
            tempMap.put("longitude", "-75.1598");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Washington Nationals");
            tempMap.put("venue", "Nationals Park");
            tempMap.put("latitude", "38.8730");
            tempMap.put("longitude", "-77.0074");
            data.add(tempMap);

            // AL Central
            tempMap = new HashMap();
            tempMap.put("team", "Chicago Cubs");
            tempMap.put("venue", "Wrigley Field");
            tempMap.put("latitude", "41.9484");
            tempMap.put("longitude", "-87.6553");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Cincinnati Reds");
            tempMap.put("venue", "Great American Ball Park");
            tempMap.put("latitude", "39.0974");
            tempMap.put("longitude", "-84.5071");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Milwaukee Brewers");
            tempMap.put("venue", "American Family Field");
            tempMap.put("latitude", "43.0280");
            tempMap.put("longitude", "-87.9715");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Pittsburgh Pirates");
            tempMap.put("venue", "PNC Park");
            tempMap.put("latitude", "40.4475");
            tempMap.put("longitude", "-80.0072");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "St. Louis Cardinals");
            tempMap.put("venue", "Busch Stadium");
            tempMap.put("latitude", "38.6226");
            tempMap.put("longitude", "-90.1928");
            data.add(tempMap);

            // NL West
            tempMap = new HashMap();
            tempMap.put("team", "Arizona Diamondbacks");
            tempMap.put("venue", "Chase Field");
            tempMap.put("latitude", "33.4405");
            tempMap.put("longitude", "-112.0668");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Colorado Rockies");
            tempMap.put("venue", "Coors Field");
            tempMap.put("latitude", "39.7559");
            tempMap.put("longitude", "-104.9942");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "San Francisco Giants");
            tempMap.put("venue", "Oracle Park");
            tempMap.put("latitude", "37.7786");
            tempMap.put("longitude", "-122.3893");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Los Angeles Dodgers");
            tempMap.put("venue", "Dodger Stadium");
            tempMap.put("latitude", "34.0739");
            tempMap.put("longitude", "-118.2400");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "San Diego Padres");
            tempMap.put("venue", "Petco Park");
            tempMap.put("latitude", "32.7073");
            tempMap.put("longitude", "-117.1566");
            data.add(tempMap);

        } else if (dataType == 4) {  // NHL
            // Atlantic
            HashMap tempMap = new HashMap();
            tempMap.put("team", "Boston Bruins");
            tempMap.put("venue", "TD Garden");
            tempMap.put("latitude", "42.3662");
            tempMap.put("longitude", "-71.0621");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Buffalo Sabres");
            tempMap.put("venue", "KeyBank Center");
            tempMap.put("latitude", "42.8751");
            tempMap.put("longitude", "-78.8765");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Detroit Red Wings");
            tempMap.put("venue", "Little Caesars Arena");
            tempMap.put("latitude", "42.3411");
            tempMap.put("longitude", "-83.0553");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Florida Panthers");
            tempMap.put("venue", "FLA Live Arena");
            tempMap.put("latitude", "26.1584");
            tempMap.put("longitude", "-80.3254");
            data.add(tempMap);


            tempMap = new HashMap();
            tempMap.put("team", "Montreal Canadiens");
            tempMap.put("venue", "Centre Bell");
            tempMap.put("latitude", "45.4961");
            tempMap.put("longitude", "-73.5693");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Ottawa Senators");
            tempMap.put("venue", "Canadian Tire Centre");
            tempMap.put("latitude", "45.2969");
            tempMap.put("longitude", "-75.9268");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Tampa Bay Lightning");
            tempMap.put("venue", "Amalie Arena");
            tempMap.put("latitude", "27.9390");
            tempMap.put("longitude", "-82.4512");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Toronto Maple Leafs");
            tempMap.put("venue", "Scotiabank Arena");
            tempMap.put("latitude", "43.6435");
            tempMap.put("longitude", "-79.3791");
            data.add(tempMap);

            // Metropolitan
            tempMap = new HashMap();
            tempMap.put("team", "Carolina Hurricanes");
            tempMap.put("venue", "PNC Arena");
            tempMap.put("latitude", "35.8020");
            tempMap.put("longitude", "-78.7198");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Columbus Blue Jackets");
            tempMap.put("venue", "Nationwide Arena");
            tempMap.put("latitude", "39.9682");
            tempMap.put("longitude", "-83.0037");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New Jersey Devils");
            tempMap.put("venue", "Prudential Center");
            tempMap.put("latitude", "40.7335");
            tempMap.put("longitude", "-74.1693");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "New York Islanders");
            tempMap.put("venue", "UBS Arena");
            tempMap.put("latitude", "40.7118");
            tempMap.put("longitude", "-73.7260");
            data.add(tempMap);


            tempMap = new HashMap();
            tempMap.put("team", "New York Rangers");
            tempMap.put("venue", "Madison Square Garden");
            tempMap.put("latitude", "40.7505");
            tempMap.put("longitude", "-73.9934");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Philadelphia Flyers");
            tempMap.put("venue", "Wells Fargo Center");
            tempMap.put("latitude", "39.9012");
            tempMap.put("longitude", "-75.1720");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Pittsburgh Penguins");
            tempMap.put("venue", "PPG Paints Arena");
            tempMap.put("latitude", "40.4393");
            tempMap.put("longitude", "-79.9896");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Washington Capitals");
            tempMap.put("venue", "Capital One Arena");
            tempMap.put("latitude", "38.8982");
            tempMap.put("longitude", "-77.0209");
            data.add(tempMap);

            // Central
            tempMap = new HashMap();
            tempMap.put("team", "Arizona Coyotes");
            tempMap.put("venue", "Mullett Arena");
            tempMap.put("latitude", "33.4254");
            tempMap.put("longitude", "-111.9290");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Chicago Blackhawks");
            tempMap.put("venue", "United Center");
            tempMap.put("latitude", "41.8807");
            tempMap.put("longitude", "-87.6742");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Colorado Avalanche");
            tempMap.put("venue", "Ball Arena");
            tempMap.put("latitude", "39.7425");
            tempMap.put("longitude", "-105.0045");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Dallas Stars");
            tempMap.put("venue", "American Airlines Center");
            tempMap.put("latitude", "32.7905");
            tempMap.put("longitude", "-96.8110");
            data.add(tempMap);


            tempMap = new HashMap();
            tempMap.put("team", "Minnesota Wild");
            tempMap.put("venue", "XCel Energy Center");
            tempMap.put("latitude", "44.9448");
            tempMap.put("longitude", "-93.1011");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Nashville Predators");
            tempMap.put("venue", "Bridgestone Arena");
            tempMap.put("latitude", "36.1592");
            tempMap.put("longitude", "-86.7785");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "St. Louis Blues");
            tempMap.put("venue", "Enterprise Center");
            tempMap.put("latitude", "38.6268");
            tempMap.put("longitude", "-90.2027");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Winnipeg Jets");
            tempMap.put("venue", "Canada Life Centre");
            tempMap.put("latitude", "49.8927");
            tempMap.put("longitude", "-97.1435");
            data.add(tempMap);

            // Pacific
            tempMap = new HashMap();
            tempMap.put("team", "Anaheim Ducks");
            tempMap.put("venue", "Honda Center");
            tempMap.put("latitude", "33.8047");
            tempMap.put("longitude", "-117.8727");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Calgary Flames");
            tempMap.put("venue", "Scotiabank Saddledome");
            tempMap.put("latitude", "51.0374");
            tempMap.put("longitude", "-114.0519");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Edmonton Oilers");
            tempMap.put("venue", "Rogers Place");
            tempMap.put("latitude", "53.5470");
            tempMap.put("longitude", "-113.4978");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Los Angeles Kings");
            tempMap.put("venue", "Crypto.com Arena");
            tempMap.put("latitude", "34.0430");
            tempMap.put("longitude", "-118.2673");
            data.add(tempMap);


            tempMap = new HashMap();
            tempMap.put("team", "San Jose Sharks");
            tempMap.put("venue", "SAP Center at San Jose");
            tempMap.put("latitude", "37.3330");
            tempMap.put("longitude", "-121.9020");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Seattle Kraken");
            tempMap.put("venue", "Climate Pledge Arena");
            tempMap.put("latitude", "47.6221");
            tempMap.put("longitude", "-122.3541");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Vancouver Canucks");
            tempMap.put("venue", "Rogers Arena");
            tempMap.put("latitude", "49.2778");
            tempMap.put("longitude", "-123.1088");
            data.add(tempMap);

            tempMap = new HashMap();
            tempMap.put("team", "Las Vegas Golden Knights");
            tempMap.put("venue", "T-Mobile Arena");
            tempMap.put("latitude", "36.1028");
            tempMap.put("longitude", "-115.1782");
            data.add(tempMap);
        }
        return data;
    }
}
