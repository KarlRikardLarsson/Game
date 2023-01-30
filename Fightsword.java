
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package spelet1;
import java.util.*;

public class Fightsword {

        private int hp;
        private int monsterhp = 8;
        private int playerdmg = 2;
        private int monsterdmg = 1;
        private int countertest = 0;
        private int countertest1 = 0;


        Fightsword(int hp, int monsterhp, int playerdmg, int monsterdmg){
            this.hp = hp;
            this.monsterhp = monsterhp;
            this.playerdmg = playerdmg;
            this.monsterdmg = monsterdmg;
    }
    public void setHp( int hp){
    this.hp=hp;
}
public int getHp(){
    return hp;
}
    public void swordfight(){


        {
            for(int count = 1; count<= monsterhp; count+=playerdmg)
            countertest++;

        for(int counter = hp; counter> monsterdmg; counter--)
            countertest1++;
        System.out.println("You did "+playerdmg+" dmg to the monster "+ countertest+" times");
        System.out.println("The monster did 1 dmg to you "+countertest+" times");
        hp -= (monsterdmg*countertest);


        }

        if(hp<=0){
                System.out.println("You have died against a monster");
        System.out.println("If you want to play again, rerun the program");
        }
        else{
        System.out.println("You have defeted the monster");
        System.out.println("You have "+ hp +" health left");
        }
    }

}