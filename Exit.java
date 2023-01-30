/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spelet1;
import java.util.*;

/**
 *
 * @author gustavjonelid
 */
public class Exit {
      Scanner scan = new Scanner(System.in);
        Fightsword swordfight = new Fightsword(10, 8, 2, 1);

            private int val =0;

Exit(int val){
    this.val = val;
    
}

    public void getExit(){

               System.out.println("");
    System.out.println("You feel very exhausted after the fight with the dragon, luckely you see a health potion in the treasure. \n"
            + "Would you like to pick it up? It's quit heavy, so you won't be able to carry as much treasure loot. yes[1], no[2]");
    val = scan.nextInt();

    if (val == 1){
        swordfight.setHp(10);
        System.out.println("You are now back att full health and ready to leave the dungeon, "
                + "You see a tiny hole, it might be an exit! You can even see some light at the end, you decide to crawl through it");
               System.out.println("");

               
               System.out.println("");
        System.out.println("Oh no, youv'e been attacked!");
         swordfight.swordfight();
                     System.out.println("Luckily you survived the attack. Now you are exhauseted, but you keep crawling and finally you manage to find the exit.");
                     System.out.println("You see trees, you are finally free with gold enough to feed you for a life time!");
                     System.out.println("Thank you for playing!");





    }
    if (val == 2){
        swordfight.setHp(1);
        swordfight.swordfight();
        System.out.println("");
        System.out.println("Oh no, youv'e been attacked from the back! Unfortunately, you did not pick up the healing potion, therefore you did not have enough health to fight with the monster.");
        System.out.println("Please re-run the program if you want to play again!");


 }
    }

}

