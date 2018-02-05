package jp.ac.uryukyu.ie.e175719;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Player user1 = new Player("Selena");
        Player user2 = new Player("Lily");



        Card card = new Card();
        card.card();

        System.out.println(user1.name + card.playerCard1);
        System.out.println(user2.name + card.playerCard2);

        Judge judge = new Judge();
        judge.playGame(card,user1,user2);


    }


}