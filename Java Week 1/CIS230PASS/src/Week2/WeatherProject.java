/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

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
        try{
            WeatherProject wp =  new WeatherProject();
            int temp = wp.getTemp();
            /*
            YOU WILL PLACE YOUR CODE BELOW HERE.
            GIVEN TO YOU IS THE INT OF THE CURRENT TEMPERATURE IN KELVIN.
            Convert to celsius and print and then convert to fahrenheit and print. 
            Kelvin to Celsius: C - 273. C to F: (C * 9/5) + 32
            */
            int celsius = temp - 273;
            System.out.println(celsius);
            System.out.println("Fahrenheit is " +((int) (celsius * 9/5.0) + 32));
            //Do NOT spend time worrying on code below. 
        }catch (Exception e){
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
    int getTemp(){
        int startIndex = rawData.indexOf("temp");
        //6 and 9 are the distance needed to only get numeric data from JSON string.
        return Integer.valueOf(rawData.substring(startIndex + 6, startIndex + 9)); 
        
    }

}
