/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author denny
 */
public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.setName("John Doe");
        myObj.setAge(25);
        System.out.println("This person's name is " + (myObj.getName()) + " and they are " + (myObj.getAge())+ " years old." );
    }
}
