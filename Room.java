/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spelet1;
import java.util.*;

public class Room {



Fightdragon dragonfight = new Fightdragon();
Door door = new Door(false);
Fight fight = new Fight(10, 10, 8, 1);
Player player = new Player(false, 10, 1);
Fightsword swordfight = new Fightsword(10, 8, 2, 1);
Exit exit = new Exit(0);

   Scanner scan = new Scanner(System.in);

int val =0;




public void getroom(){
System.out.println("");
System.out.println("You are in the center of the dungeon. You see a tunel on each side of the room. \n"
 + "You can choose to go north(1), south(2), west(3), east(4)");
val = scan.nextInt(); // tar värder som användaren matar in.


switch (val){
case 1: getroomKey();
break;
case 2: getroomSword();
break;
case 3: getroomPotion();
break;
case 4: getroomDragon();
break;
default: getroom();

}

//varje rum har en återvändsgränd som man sedan måste gå tillbaka till. (SE SPARAD BILD PÅ SKRIVBORD);
//While dragonhp <0 ?


}
public void getroom2(){
System.out.println("");
System.out.println("You are back in the center of the dungeon. You see a tunel on each side of the room. \n"
 + "You can choose to go north(1), south(2), west(3), east(4)");
val = scan.nextInt(); // tar värder som användaren matar in.

switch (val){
case 1: getroomKey();
break;
case 2: getroomSword();
break;
case 3: getroomPotion();
break;
case 4: getroomDragon();
break;
default: getroom();

}




}
public void getroomKey(){

if (door.key ==false){
System.out.println("");
System.out.println("You have entrered  a room full of rusty useless coins! However you see a shiny key on the floor, this one might come in handy!\n" +
"You can go east from the center room towards the dragon, but please be aware that the dragon is a powerful creature and having a sword  and full health will be essential. \n" +
   "Would you like to pick up the key? yes[1], no[2]\n");
val = scan.nextInt();
if (val ==1){
    door.setKey(true);
    System.out.println("You decided to pick up the key. But there is no other way to go but the same way you went in."
            + "Would you like to go back to the center of the room? [1]yes");
    val= scan.nextInt();
}if (val == 2){

 
    door.setKey(false);
        System.out.println("You decied not to pick up the key." 
                + "There is no other way to go but the same way you went in."
            + "Would you like to go back to the center of the room? [1]yes");
        val = scan.nextInt();
        if(val ==1){
    getroom2();}
}

}


else {


System.out.println("");
System.out.println("You have already been here and picked up the key , there is no other way than to go back"
+"Would you like to go back? Press [1} to go back \n");
val = scan.nextInt();
}
if (val == 1){
    getroom2();
}




}

public void getroomSword(){
if (fight.done == true){
System.out.println("");
System.out.println("You have already been here and picked up the sword, There is no other way to than to go back \n"
+ "Would you like to go back? yes[1]");
val = scan.nextInt();
if (val== 1){
getroom2();}  

}else 
{
fight.Fight();
System.out.println("");
System.out.println("Woaw, close one! You were attacked and were able to defeted the monster and se that the monster droped a sword! Would you like to pick up the sword? [1]yes, [2]no \n");
fight.setDone(true);
dragonfight.setHp(2);
val = scan.nextInt();

if (val ==1){
    System.out.println("You have picked up the sword and will do 2 dmg per hit, there is no other way back but the way you came from."
            + "Would you like to go back? yes[1]");
    dragonfight.setSkada(2);
    val = scan.nextInt();
}else 
        System.out.println("You have decied not to pick up the sword, there is no other way back but the way you came from."
                + "Would you like to go back? yes[1]");

val = scan.nextInt();
if(val == 1){
getroom2();}

}


}



public void getroomPotion(){
if (player.have == false){
System.out.println("");
System.out.print("In this damp and stinky room you find a health pot. This one is needed before taking on the dragon!");
    System.out.println("\nYou can pick up the health pot or go back to the center, press [1] to pick up the pot, press [2] to go back to the center.\n ");
    val = scan.nextInt();
    if (val == 1){
        player.setHave(true);
        System.out.print("You picked up the potion.But this room doesn't lead anywhere, do you want to go back? Press [1]\n");
        val = scan.nextInt();
        if (val== 1){
        getroom2();}
    }
    if (val ==2){
        player.setHave(false);
        getroom2();
    }
}
else{
System.out.println("");
System.out.println("You have already been here and picked up the health pot \n"
+"There is no other way than to go back, do you want to go back press [1]\n");
val = scan.nextInt();
if (val== 1){
getroom2();}  
}



}
public void getroomDragon(){
door.key();

if (door.key ==true){


    if (player.have == true){
        System.out.println("You have a health pot available which you picked up earlier, would you like to use it before the fight with the dragon?\n"
 + "yes(1) \nno(2)");
val = scan.nextInt(); // tar värder som användaren matar in.
        if(val == 1){
            dragonfight.setHp(10);
            System.out.println("You have taken the health potion and you are back to full health. You charge on to the dragon and fight!");
            dragonfight.fightDragon(); 
        } 
        if (val == 2) {
dragonfight.fightDragon();

        }
}
    if (player.have == false){
        System.out.println("You didn't pick up the health potion earlier so you go in against the dragon ");
        dragonfight.setHp(2);
        dragonfight.fightDragon();
    }
}
else{
            getroom2();}
if (dragonfight.curHp >= 1){
    System.out.println("After a long fight that you succeded, you try to climb over the gigant dragon. Behind the dragon there are a MASSIVE treasure");
    System.out.println(            "                  _.--.\n"+            "              _.-'_:-'||\n"+            "          _.-'_.-::::'||\n"+            "     _.-:'_.-::::::'  ||\n"+            "   .'`-.-:::::::'     ||\n"+            "  /.'`;|:::::::'      ||_\n"+            " ||   ||::::::'      _.;._'-._\n"+            " ||   ||:::::'   _.-!oo @.!-._'-.\n"+            " \'.  ||:::::.-!() oo @!()@.-'_.||\n"+            "   '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\n"+            "     `>'-.!@%()@'@_%-'_.-o _.|'||\n"+            "      ||-._'-.@.-'_.-' _.-o  |'||\n"+            "      ||=[ '-._.-\\U/.-'    o |'||\n"+            "      || '-.]=|| |'|      o  |'||\n"+            "      ||      || |'|        _| ';\n"+            "      ||      || |'|    _.-'_.-'\n"+            "      |'-._   || |'|_.-'_.-'\n"+            "      '-._'-.|| |' `_.-'\n"+            "           '-.||_/.-'\n");
    System.out.println("You are now able to flee the cave with all it's treasures. "
    +"Do you want to leave the cave?[1]yes, [2]no");
    val = scan.nextInt();
    if (val == 1){
        System.out.println("");
        System.out.println("You decided to try to get out of this cave with all the treasures you have found \n"
                +"However the entrence you came in from is blocked. So you need to find another way out.");
            getroomOut();
    }
if (val == 2){
        System.out.println("");
        System.out.println("You stayed to long in the dungon and you forgot the way back, nor are you able to find any food and you starve to death");
        System.exit(0);
}
}
else{
System.out.println("");
}
 
}
public void getroomOut(){
    exit.getExit();
        
        
    
    }
}



