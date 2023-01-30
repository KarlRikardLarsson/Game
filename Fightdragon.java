/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spelet1;

/**
 *
 */
public class Fightdragon {

        private int hp =10; //sätter hp 10
        private int skada = 1; //sätter karaktärens till 1 om inte man har svärdet
        private int monsterhp = 18; //sätter hp till på Draken till 18
        private int playerdmg = 2; //spelarens skada mot draken med svärd
        private int monsterdmg = 1; //sätter skada som draken gör till 1
        private int countertest = 0; //Variabel för for loop
        private int countertest1 = 0; //Variabel för for loop
         int curHp; //Variabel som visar hp som är för stunden. ex efter fighten med drake


public void setHp( int hp){ //sätter hp
    this.hp=hp;
}
public int getHp(){ //hämtar hp
    return hp;
}
public void setSkada( int skada){ //sätter skada
    this.skada=skada;
}
public int getSkada(){ //hämtar skada
    return skada;

}

public void fightDragon(){

   
        
          System.out.println("You have enganged in combat with the dragon"); //printar text
          System.out.println(        "                                                  .~))>>\n"+        "                                                 .~)>>\n"+        "                                               .~))))>>>\n"+        "                                             .~))>>             ___\n"+        "                                           .~))>>)))>>      .-~))>>\n"+        "                                         .~)))))>>       .-~))>>)>\n"+        "                                       .~)))>>))))>>  .-~)>>)>\n"+        "                   )                 .~))>>))))>>  .-~)))))>>)>\n"+        "                ( )@@*)             //)>))))))  .-~))))>>)>\n"+        "              ).@(@@               //))>>))) .-~))>>)))))>>)>\n"+        "            (( @.@).              //))))) .-~)>>)))))>>)>\n"+        "          ))  )@@*.@@ )          //)>))) //))))))>>))))>>)>\n"+        "       ((  ((@@@.@@             |/))))) //)))))>>)))>>)>\n"+        "      )) @@*. )@@ )   (\\_(\\-\\b  |))>)) //)))>>)))))))>>)>\n"+        "    (( @@@(.@(@ .    _/`-`  ~|b |>))) //)>>)))))))>>)>\n"+        "     )* @@@ )@*     (@)  (@) /\\b|))) //))))))>>))))>>\n"+        "   (( @. )@( @ .   _/  /    /  \\b)) //))>>)))))>>>_._\n"+        "    )@@ (@@*)@@.  (6///6)- / ^  \\b)//))))))>>)))>>   ~~-.\n"+        " ( @jgs@@. @@@.*@_ VvvvvV//  ^  \\b/)>>))))>>      _.     `bb\n"+        " ((@@ @@@*.(@@ . - | o |' \\ (  ^   \\b)))>>        .'       b`,\n"+        "   ((@@).*@@ )@ )   \\^^^/  ((   ^  ~)_        \\  /           b `,\n"+        "     (@@. (@@ ).     `-'   (((   ^    `\\ \\ \\ \\ \\|             b  `.\n"+        "       (*.@*              / ((((        \\| | |  \\       .       b `.\n"+        "                         / / (((((  \\    \\ /  _.-~\\     Y,      b  ;\n"+        "                        / / / (((((( \\    \\.-~   _.`\" _.-~`,    b  ;\n"+        "                       /   /   `(((((()    )    (((((~      `,  b  ;\n"+        "                     _/  _/      `\"\"\"/   /'                  ; b   ;\n"+
        "                 _.-~_.-~           /  /'                _.'~bb _.'\n"+        "               ((((~~              / /'              _.'~bb.--~\n"+        "                                  ((((          __.-~bb.-~\n"+        "                                              .'  b .~~\n"+        "                                              :bb ,' \n"+        "                                              ~~~~\n");  
        {//printar ut draken
            for(int count = 1; count <= monsterhp; count+=skada)
            countertest++; //Räknar skadan på draken
        for(int count = 0; count<= hp; count++)
            countertest1++; //räknar skadan på karaktär


 
        curHp += (hp - countertest); //Skriver ut vilket hp karaktären har för stunden
  
        }
          
        if(curHp <=0)while (countertest1>10){
        countertest1--;}
        { // om hp blir mindre eller lika med 0 så dör karaktären
        System.out.println("You did "+skada+" dmg to the dragon "+ countertest1+" times"); //skriver ut hur mycket skada man gjort på draken
        System.out.println("The dragon did 1 dmg to you "+countertest1+" times");// skriver ut hur mycket skada draken gjort på karaktären
        System.out.println("You have died against the dragon, next time you might be helpful bringin a sword and full start at full health!");//skriver ut att karaktären har dött och ger tips för att kunna vinna
        System.out.println("If you want to play again, restart the program"); // skriver ut text
        }
        if (curHp >= 0){ // om hp är mer än 0 visar att man vunnit med text nedan
        System.out.println("You did "+skada+" dmg to the dragon "+ countertest+" times"); //skriver ut hur mycket skada man gjort på draken
        System.out.println("The dragon did 1 dmg to you "+countertest+" times");// skriver ut hur mycket skada draken gjort på karaktären
        System.out.println("You have defeted the dragon and are able loot the treasure and get out of the cave."); //Skriver ut text att karaktären fått en skatt
        System.out.println("You have "+ curHp +" health left"); // skriver ut hur mycket hp karaktären har kvar
       
}
      }
}
