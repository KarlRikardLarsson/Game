/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spelet1;
import java.util.*;

public class Fight {
    private int hp;
    private int playerhp = 10;
    int monsterhp = 8;
    private int playerdmg = 1;
    private int monsterdmg = 1;
    int curranthp = playerhp;
    private int countertest = 0;
    private int countertest1 = 0;
    boolean done = false;

    Fight(int hp, int playerhp, int monsterhp,  int monsterdmg){
            this.hp = hp;
            this.playerhp = playerhp;
            this.monsterhp = monsterhp;
           
            this.monsterdmg = monsterdmg;
    }
    public void setDone( boolean done){
    this.done=done;
}
public boolean getDone(){
    return done;

}



   public void Fight(){


        {


            for(int count = 1; count<= monsterhp; count+=playerdmg)
            countertest++;
        for(int counter = playerhp; counter> monsterdmg; counter--)
            countertest1++;
 
        curranthp -= (monsterdmg*countertest);

        System.out.println("You did "+playerdmg+" dmg to the monster "+ countertest+" times");
        System.out.println("The monster did 1 dmg to you "+countertest+" times");
        }

        if(curranthp<=0){
                System.out.println("You have died against a monster");
        System.out.println("If you want to play again, rerun the program");
        }
        else{
        System.out.println("You have defeted the monster");
        System.out.println("You have "+ curranthp +" health left");


    }
}
}