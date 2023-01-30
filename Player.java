/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package spelet1;
import java.util.*;


public class Player {

    boolean have = false;
    private int hp;
    private int skada;

    Player(boolean have, int hp, int skada) {
        this.hp = hp;
        this.skada = skada;
        this.have = have;

    }



public void setHp( int hp){
    this.hp=hp;
}
public int getHp(){
    return hp;
}
public void setSkada( int skada){
    this.skada=skada;
}
public int getSkada(){
    return skada;

}
public void takeHpPot(int hp){
    this.hp=10;
}
public int getHpPot(){
    return hp;

}
   public void setHave( boolean have){
    this.have=have;
}
public boolean getHave(){
    return have;
}
}
