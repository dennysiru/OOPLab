/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author denny
 */
public class Vehicle {
    private int fuel;
    private String topSpeed;
    
    protected void setfuel(int i){
        this.fuel = i;
    }
    
    protected int getfuel() {
        return fuel;
    }
    
    protected void settopSpeed(String n) {
        this.topSpeed = n;
    }
    
    protected String gettopSpeed(){
        return topSpeed;
    }
    
    public void showInfo() {
        Vehicle v1 = new Vehicle();
        System.out.println("Fuel is "+ (v1.getfuel()) + " litre and Top Speed is " + (v1.gettopSpeed()) + " m/s.");
    }
}
