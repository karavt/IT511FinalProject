/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;
import java.util.ArrayList;
/**
 *
 * @author kara.rajchel
 */
public class ShoutBox {
      
  
   public void shoutOutRandomMessages(){
   ArrayList<String> subjects = new ArrayList<String>(5);//create array list of subjects
   subjects.add("I ");
   subjects.add("You ");
   subjects.add("Kai ");
   subjects.add("Houdini ");
   subjects.add("Calvin ");
    //create array list of objects
   ArrayList<String> objects = new ArrayList<String>(5);
   objects.add("home ");
   objects.add("work ");
   objects.add("bed ");
   objects.add("living room ");
   objects.add("barn ");
    
    //create array list of verbs
   ArrayList<String> verbs = new ArrayList<String>(5);
   verbs.add("sleeping ");
   verbs.add("working ");
   verbs.add("running ");
   verbs.add("eating ");
   verbs.add("walking ");
    
    // create array list of adverbs
   ArrayList<String> adverbs = new ArrayList<String>(5);
   adverbs.add("quickly ");
   adverbs.add("slowly ");
   adverbs.add("quietly ");
   adverbs.add("everywhere ");
   adverbs.add("slopily ");
   
    
    //create array list of adjectives
    ArrayList<String> adjectives = new ArrayList<String>(5);
    adjectives.add("happy ");
    adjectives.add("soft ");
    adjectives.add("red ");
    adjectives.add("hard ");
    adjectives.add("dark ");
    
    int choice; // the number that will be chosen
        choice = (int)(Math.random()*5);// a random # between 0 & 4 (ArrayList options)
                
        String randomSubject = subjects.get(choice); // return the value on the arraylist according to random number
        String randomObject = objects.get(choice);// return value on objects array list according to random number
        String randomVerb = verbs.get(choice); // return value on verbs arraylist according to random number
        String randomAdverb = adverbs.get(choice); // returns a value on adverbs arraylist according to random number
        String randomAdjective = adjectives.get(choice); // returns a value on adjectives arraylist according to random number
    // display random message for user
    System.out.println("Your message is: " + randomSubject + randomVerb + randomAdjective + randomObject + randomAdverb);
    
    
    }
}
