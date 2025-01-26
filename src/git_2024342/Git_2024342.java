/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024342;

import java.util.Scanner;

/**
 *
 * @author ROG STRIX
 */
public class Git_2024342 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Gabriel - 2024342");
        
        // create a scanner that uses your keyboard
        Scanner myKB = new Scanner(System.in);
        
        //initialize a string to holde the users answer
        String userName;
        
        //prompt the user to enter their name for the first time
        System.out.println("Please enter your name");
        
        //allows the user to input an answer
        userName = myKB.nextLine().trim();
        
        /*
        If the answer given contains any character not allowed
        enters the user into a loop that repeatedly asks
        for a new answer until the users answer only has letters
        */
        while (!userName.matches("[a-zA-Z!.?', ]+")){
            System.out.println("No numbers please");
            System.out.println("Now try entering your name again");
            
            userName = myKB.nextLine().trim();
        }
        
        //checks the lenght of the answer given
        int nameLenght = userName.length();
        
        //creates to strings with both halves of the answer given
        String halfNameOne = userName.substring(0, nameLenght/2);
        String halfNameTwo = userName.substring(nameLenght/2);
        
        //outputs the users answer turned around
        System.out.println(halfNameTwo + halfNameOne);
        
  
    }
    
}
