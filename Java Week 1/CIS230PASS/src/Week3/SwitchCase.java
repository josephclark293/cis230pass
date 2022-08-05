/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author josep
 */
public class SwitchCase {
    final private String day = "24";
    final private String serverPath = "https://api.covidtracking.com/v2/us/daily/2021-01-" + day + ".json";
    final private String rawData;
    public static void main(String[] args) {
        try{
            SwitchCase sp = new SwitchCase();
            //System.out.println(sp.getHospitalized());
            int val = sp.getHospitalized();
            switch(val){
                case 0: System.out.println("Less than 100,000 cases");break;
                case 1: System.out.println("Greater than 100,000 cases");break;
                case 2: System.out.println("Greater than 150,00 cases");
            } 
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public SwitchCase() throws Exception{
        URL url = new URL(serverPath);
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
        
        //System.out.println(rawData);
    }
    int getHospitalized(){
        int index = rawData.indexOf("\"hospitalized\":{\"currently\":{\"value\":");
        String s2 = rawData.substring(index);
        System.out.println(s2);
        int index2 = s2.indexOf("value");
        int val = Integer.valueOf(s2.substring(index2 + 7,index2 + 13));
        if(val < 100_000){
            return 0;
        }else if( val < 150_000){
            return 1;
        }else{
            return 2;
        }
    }
}
    

