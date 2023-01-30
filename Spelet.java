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
public class Spelet {

 public static void main(String[] args){      

   Scanner scan = new Scanner(System.in);
    Player player = new Player(false,10,1);
    Startmeny s = new Startmeny();
    Room r = new Room();

//Skapar variabler
int val =0;
int hp = player.getHp(); 
int hpPot =0;

int skada= player.getSkada();
int monsterSkada =1;

boolean key = false;



s.printMeny(); //printar startmenyn som är skapad i en anna klass. (encapsulation)
val = scan.nextInt(); // tar värder som användaren matar in.

if (val== 1){r.getroom();} // Väljer användaren 1 startar spelet

else{ //meddelande om användaren väljer att inte spela.
System.out.println(" You have choosen to go back and leave all that wealth behind\n" +
"You decide to go back to the same place the following day, but this time there was no guard, nor was there any cave left. It has dissapeared!\n" 
 + "Baffeled you go back home an never returned.\n "
 + "Thank you for playing. To play again, please restart.\n");
}



}

} 
