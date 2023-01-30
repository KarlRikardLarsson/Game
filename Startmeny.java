/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spelet1;
import java.util.*;

/**
 *
 * @author rikar
 */
public class Startmeny {

    //Skapar scanner
   Scanner scan = new Scanner(System.in); 


//printar startmenyn. enbart "lore", printas i spelet klassen.
public void printMeny(){ 

 System.out.println( 
"-----------------------------------------------\n"+
"|                 Welcome to                  |\n"+
"|                 DragonTreasure              |\n"+
"-----------------------------------------------\n");

System.out.print("Write your nickname and press enter to [enter] to start a new game(letters and numbers are accepted)...\n");
   String namn = scan.nextLine(); //skapar string med värde som användaren matar in.


System.out.println("");

System.out.printf("You are walking in the forrest, when you suddenly see an exhausted plated guard standing by a cave. You get curious and start talking to him.\n");
System.out.println("");
System.out.printf("Guard: What is your name young traveler?\n");
System.out.printf("My name is " + namn+".\n");

System.out.println("Guard: Do not worry about me, we have bigger problems " + namn + ". The treasure is within our grasp, but I can not do this alone."
 + " please join me in entering the cave and fight along my side to defeat the dragons and claim the biggest treasure the world has ever seen! ");

 System.out.println("Make a choice: Are you willing to risk your life by entering the cave?(1), or are you going to turn around and leave all that wealth behind?(2)."
 + "\n" + "Please choose 1, 2.\n");
}

}

