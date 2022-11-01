/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15;

import java.io.File;
import java.util.Random;

/**
 *
 * @author josep
 */
public class BasketBallTeam {
    private String name;
    private String city;
    private File logo;
    private String [] players;
    private String coach;
    private int wins;
    private int losses;

    public BasketBallTeam(String name, String city, String[] players, String coach) {
        this.name = name;
        this.city = city;
        this.players = players;
        this.coach = coach;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public BasketBallTeam() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public File getLogo() {
        return logo;
    }

    public void setLogo(File logo) {
        this.logo = logo;
    }

    public String[] getPlayers() {
        return players;
    }

    public void setPlayers(String[] players) {
        this.players = players;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
    public void playGame(BasketBallTeam opponnet){
        Random r = new Random();
        if(r.nextInt(2) == 1){
            System.out.println(this.name + " won the game!!!");
            this.wins++;
            opponnet.losses++;
        }else{
            System.out.println(opponnet.name + " won the game.");
            opponnet.wins++;
            this.losses++;
        }
    }
    
}
