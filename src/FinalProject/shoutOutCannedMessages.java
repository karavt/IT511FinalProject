/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author kara.rajchel
 */
public class shoutOutCannedMessages {
public int i;
public int numberOfResponses;
    Scanner in = new Scanner(System.in);
    public void cannedMessages(){
        ArrayList<String> responses = new ArrayList<String>(); // create new string array list with messages
            responses.add("I live in Seoul."); 
            responses.add("I have 2 cats.");
            responses.add("I like to watch hockey.");
            responses.add("I have a horse.");
            responses.add("I'm learning Java.");
            responses.add("My favorite color is purple.");
            responses.add("Kimchi is good!");
            responses.add("Programming is fun.");
            responses.add("My horse's name is Calvin.");
            responses.add("I love Vermont.");
            for (String response : responses){
                System.out.println(response);
            }
            System.out.println("Select a message using numbers 0 through 9."); // User selects a message they want to get

            int userInput = in.nextInt(); //User enters their choice and gets respective message
            int i = userInput;
            String responsechoice = responses.get(i);
            System.out.println(responsechoice);
            
            int numberOfResponses = responses.size();        
    }
}