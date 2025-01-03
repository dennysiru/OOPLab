/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author denny
 */
public class Player {
    private String name;
    private String team;
    
    public Player() {
        this.name = name;
        this.team = team;
    }


    public void setName(String n) {
        this.name = n;
    }
    public void setTeam(String t) {
        this.team = t;
    }
    public String getName(){
        return name;
    }
    public String getTeam(){
        return team;
    }
    public boolean isSameTeam(Player p) {
        if (p == null) {
            return false;
        }
        return this.team.equals(p.getTeam());
    }
}
