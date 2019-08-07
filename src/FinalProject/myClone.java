/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;
import java.util.*;


/**
 *
 * @author kara.rajchel
 */

public class myClone { // instance variables

    private String fName;
    private String mName;
    private String lName;
    private String favColor;
    
    
    public myClone (String n, String m, String l, String f){ //myClone constructor
        fName = n;
        mName = m;
        lName = l;
        favColor = f;
        
           }
    
   
    public myClone (){
        fName = " ";
        mName = " ";
        lName = " ";
        favColor = " ";
    } // initiate my clone
    
    public String getName(){
        return fName + "" + mName + "" + lName; //accessor
    }
    public String getFavColor(){
        return favColor; //accessor for favorite color
    }
    public void setName(String name){
        this.fName = name; //mutator
    }
    
    public void setNameMiddle(String middlename) {
        this.mName = middlename;
    }
    public void setNameLast(String lastname) {
        this.lName = lastname;
    }
    public void setFavColor(String favColor){
        this.favColor = favColor;
    }
       public static void main(String[] args){

       }

    public void introduction() { //create new method named introduction. Say hello to visitor and ask visitor name. 
         Scanner input = new Scanner(System.in);
         myClone kara = new myClone("Kara ", "Lynn ", "Rajchel "," "); // Construct new myClone object named me
    kara.setFavColor("Purple");
         System.out.println("Hi, my name is " + kara.getName() + "My favorite color is " + kara.getFavColor());
         System.out.println( "What's your first name?");
         String visitorfName = input.next();
         String reply = "Hi " + visitorfName + ". Nice to meet you! Here are some messages from me. You can select them using numbers 0 - 9. ";
         System.out.println(reply);
     }
}