/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spelet1;
import java.util.Scanner;
/**
 *
 * @author gustavjonelid
 */
public class Door {
    


     boolean key;
     
     Door(boolean key){
         this.key=false;
     }
 

    public void setKey( boolean key){
    this.key=key;
}
public boolean getkey(){
    return key;

}
public void key(){
         int val;
         int val2 = 0;
        Scanner scan = new Scanner(System.in);

        String []door ={"The door is LOCKED", "The door can be unlocked with a key that can be obtained in the dungeon"};
     for(int d = 0; d < door.length; d++){


        System.out.println(door[d]);
    }
        System.out.println("You have to use a key to open this door.");
        System.out.println("If you have a key press 1 in order to open the door, if you dont press 2.");
        val = scan.nextInt();

                if (val ==2){
                    setKey(false);
                    System.out.println("You need to find a key in one of the rooms in the dungon, come back when you find it!");
                }
                 if(key == false){
                System.out.println("You havent recived the key, you need to have a key to go through this door, therefore, you choose to go back to the center of the dungeon.");
                           }
                 if (key == true){
        if (val == 1){

            System.out.println("The door has been unlocked, are you ready to go through the door? There is no going back after you go through here. ");
        System.out.println("Press 1(yes), or 2(no)");
        val2 = scan.nextInt();
        }
                 }
        if(val2 == 1 ){
            System.out.println("You have decied to go through the door, on the other side of the door a dragon awaits...");
    }
        if(val2 ==2){
            System.out.println("You have decied to wait to go through the door");
        }
    }}
        

