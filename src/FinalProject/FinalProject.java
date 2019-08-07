/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;


/**
 *
 * @author kara.rajchel
 */
public class FinalProject {

    /**
     * @param args the command line arguments
 */

   
    public static void main(String[] args) {
        // TODO code application logic here  
        new myClone().introduction(); //Say introduction
    /** Display canned messages, give user the option to select one of the responses. If user
    doesn't choose one of the responses show a random response
    */

     shoutOutCannedMessages cannedResponses = new shoutOutCannedMessages(); // create a new instance of the shoutbox with canned responses
     new shoutOutCannedMessages().cannedMessages(); // display canned messages and give user the option to select one response
     System.out.println("Now for a random message from me!"); 
            new ShoutBox().shoutOutRandomMessages();// displays a randomly generated message
            } 
    }         



