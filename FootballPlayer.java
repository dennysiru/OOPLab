/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author denny
 */
public class FootballPlayer extends Player {
    private int playerNumber;
    private String position;
    
    public FootballPlayer() {
        super();
    }
    
    public void setPlayerNumber(int n) {
        this.playerNumber = n;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public void setPosition(String p) {
        this.position = p;
    }
    public String getPosition() {
        return position;
    }
    public boolean isSamePosition(FootballPlayer p) {
        if (p == null) {
            return false;
        }
        return this.position.equals(p.getPosition());
    }
}
