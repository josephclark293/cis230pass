/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class StudentMovieProject {

    final static String apiKey = "k_hnoh3d8x";
    String serverPath = "https://imdb-api.com/en/API/SearchMovie/" + apiKey + "/";
    String jsonResponseSearch = "";
    String jsonResponseRatings = "";
    String [] rgRatings;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        new StudentMovieProject();
    }

    /*
    This block below is where we will place our Method CALLS.   
    You can think of this as your main method in a way. 
     */
    public StudentMovieProject() {
        //We call this method and save the results in movieToSearch.
        String movieToSearch = getUserMovie();
        /*
        The line of code below. I wrote for you is a method call returing
        the title which is the result of the user's se
        */
        String title = getTitle(getJsonResponseSearch(movieToSearch));
        //use the verify title method in an if statement. 
        if(verifyTitle(title)){
            getJsonResponseRatings(getIMDbId());
            //If the title is correct print the results.
            printResults();
        }else{
            System.out.println("Sorry, try again.");
        }
    }

    /*
    In this method you will put the code to get the user's movie of choice.
    You may assume there is a Scanner called input. 
    input.nextLine() will get you the next line of input.
    It is like input() in python.
     */
    static String getUserMovie() {
        System.out.print("Enter a movie to search for: ");
        return input.nextLine();
    }
    /*
    In this method the user enters 1 if the title is correct.
    0 otherwise. Again use input as your scanner. 
    */
    static boolean verifyTitle(String title){
        System.out.println("Is this title correct? " + title);
        System.out.println("Enter 1 if correct. 0 if incorrect");
        if(input.nextInt() == 1){
            return true;
        }else{
            return false;
        }
    }
    /*
    Here call String getImDbRating(), String getMetcritic(),String getRottenTomatoes().
    Methods which RETURN STRING. and print results to user
    */
    void printResults(){
        System.out.println(getImDbRating());
        System.out.println(getMetcritic());
        System.out.println(getRottenTomatoes());
    }
    
    String getJsonResponseSearch(String movieToSearch) {
        try {
            URL url = new URL(serverPath + movieToSearch);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            jsonResponseSearch = content.toString();
            return jsonResponseSearch;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    String getTitle(String jsonData){
        return jsonData.split(",")[5];
    }
    String getIMDbId(){
       return  jsonResponseSearch.split(",")[2].substring(18, 27);
    }
    void getJsonResponseRatings(String imdb){
         try {
            URL url = new URL("https://imdb-api.com/en/API/Ratings/" + apiKey +"/"+imdb);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            jsonResponseRatings = content.toString();
            rgRatings= jsonResponseRatings.split(",");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    String getImDbRating(){
        return rgRatings[5];
    }
    String getMetcritic(){
        return rgRatings[6];
    }
    String getRottenTomatoes(){
        return rgRatings[8];
    }
}
