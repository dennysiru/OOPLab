/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author denny
 */
public class MainBook {
    public static void main(String[] args) {
        Book myObj = new Book();
        myObj.setTitle("The Great Gatsby");
        myObj.setAuthor("F. Scott Fitzgerald");
        myObj.setPrice(10.99);
        char ch = '"';
        
        System.out.println(ch + (myObj.getTitle()) + ch + " by " + (myObj.getAuthor() + " cost " + (myObj.getPrice()) + " USD. "));
    }
}
