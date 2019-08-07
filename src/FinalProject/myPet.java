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
public class myPet {
    private String name; // Pet's name
    private String species; // Pet's sepcies
    private String color; // Pet's color
    private int age; // Pet's age in years
    private String nickName; //Pet's nickname

   
   public myPet (String n, String s, String c, int a, String nN){ //pet constructor
        name = n;
        species = s;
        color = c;
        age = a;
        nickName =nN;
           }
 
       
      //accessors for name, species, color and age
       public String getName(){
           return name;
       }
       public String getSpecies(){
           return species;
       }
       public String getColor(){
           return color;
       }
       public int getAge(){
           return age;
       }
       //mutators for name, species, color and age
       public void setName(String name){
           this.name = name;
       }
       public void setSpecies(String species){
           this.species = species;
       }
       public void setColor(String color){
           this.color = color;
       }
       public void setAge(int age){
           this.age = age;
       }
       public void setNickName (String nickName){
        this.nickName = nickName;
    }
       
       public static void main(String[] args){
       myPet kai = new myPet("Kai", "cat", "Orange and white", 10, " "); // Construct new mypet object named Kai
       myPet dini = new myPet ("Dini", "cat", "orange and white", 11, " "); //Construct new mypet object named dini
       myPet calvin = new myPet("Calvin", "horse", "bay", 17, " "); //Construct new mypet object named calvin
      
       kai.setNickName("Snuggins");
       dini.setNickName("Mr.Pants");
       calvin.setNickName("Mud Pony");
       }
   public String petSound (String sound) // return the sound the pet makes based on it's species (Cat or  Horse being the options)
   {
       if (species == "cat"){
           sound = "Meow!";
       }else{
        sound = "Neigh!";
        }
        return sound;
   }

}


