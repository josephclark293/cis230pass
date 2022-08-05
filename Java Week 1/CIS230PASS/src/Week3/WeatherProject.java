/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author josep
 */
import java.net.*;
import java.io.*;

public class WeatherProject {

    final private String city = "Greenwood";
    final private String countryCode = "US";
    final private String openWeatherMapApiKey = "eaff7d5ed9abac9fef6b8aa238c0c041";
    final private String serverPath = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "," + countryCode + "&APPID=" + openWeatherMapApiKey;
    final private URL url;
    final private String rawData;

    public static void main(String[] args) {
        try {
            WeatherProject wp = new WeatherProject();
            int temp = wp.getTemp();
            int celsius = temp - 273;
            int fahrenheit = (int) ((celsius * 9 / 5.0) + 32);
            double windSpeed = wp.getWindSpeed();
            int humiditity = wp.getHumidity();
            String cloudCondition = wp.getCloudCondition();
            /*
            Your code below here. Write some if statements that will tell 
            user about the weather
             */
            /*
            if (fahrenheit < 32) {
                if (windSpeed > 10 && humiditity > 50) {
                    System.out.println("It is freezing, windy ,and damp outside.");

                } else if (windSpeed > 10 && humiditity < 50) {
                    System.out.println("It is freezing and windy outside.");
                } else {
                    System.out.println("It is freezing, but the wind speed is less than 10 mph.");
                }

            } else if (fahrenheit < 60) {//why do I not need to put fahrenheit > 32 && fahrenheit < 60?
                if (windSpeed > 10 && humiditity > 50) {
                    System.out.println("It is cold, windy, and damp outside.");
                } else if (windSpeed > 10 && humiditity < 50) {
                    System.out.println("It is cold and windy outside.");
                } else {
                    System.out.println("It is cold");
                }
            } else {//fahrenheit > 60
                System.out.println("It is nice");
            }
            System.out.println("The cloud condition is " + cloudCondition);
*/
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public WeatherProject() throws MalformedURLException, ProtocolException, IOException {
        url = new URL(serverPath);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();
        rawData = content.toString();
        System.out.println(rawData);
    }

    int getTemp() {
        int startIndex = rawData.indexOf("temp");
        //6 and 9 are the distance needed to only get numeric data from JSON string.
        return Integer.valueOf(rawData.substring(startIndex + 6, startIndex + 9));

    }

    double getWindSpeed() {
        int startIndex = rawData.indexOf("wind");
        return Double.valueOf(rawData.substring(startIndex + 15, startIndex + 19));

    }

    int getHumidity() {
        int startIndex = rawData.indexOf("humidity");
        return Integer.valueOf(rawData.substring(startIndex + 10, startIndex + 12));
    }

    String getCloudCondition() {
        int startIndex = rawData.indexOf("description");
        return rawData.substring(startIndex + 13, rawData.indexOf("\"icon") - 1);
    }

}
