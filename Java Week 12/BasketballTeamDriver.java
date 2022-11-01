/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15;
/**
 *
 * @author josep
 */
public class BasketballTeamDriver {
    public static void main(String[] args) {
        String [] players = {"Jason Tatum","Jaylen Brown","Marcus Smart"};
        BasketBallTeam celtics = new BasketBallTeam("Celtics", "Bostpn",players ,"Ime Udoka");
        
        String [] players2 = {"Kyrie Irving","Kevin Durant"};
        BasketBallTeam nets = new BasketBallTeam("Nets","Brooklyn",players2,"Steve Nash");
        for(int i = 0; i < 10; i++){
            celtics.playGame(nets);
        }
        System.out.println(nets.getWins());
    }
}
