package jp.ac.uryukyu.ie.e175719;

import java.util.*;

public class Judge {
    public void playGame(Card game , Player user1, Player user2){
        ArrayList<String> handCard1 = game.playerCard1;
        ArrayList<String> handCard2 = game.playerCard2;

         String card;

        while(true){
            if(handCard1.size() == 0){
                System.out.println("勝者:" + user1.name);
                System.out.println("敗者:" + user2.name);
                break;
            }

            if(handCard2.size() == 0){
                System.out.println("勝者:" + user2.name);
                System.out.println("敗者:" + user1.name);
                break;
            }

            card = handCard2.get((int)(Math.random()* handCard2.size()));
            if (handCard1.indexOf(card) == -1) {
                handCard1.add(card);
            } else {
                handCard1.remove(card);
            }


            if(handCard1.size() == 0){
                System.out.println("勝者:" + user1.name);
                System.out.println("敗者:" + user2.name);
                break;
            }
            if(handCard2.size() == 0){
                System.out.println("勝者:" + user2.name);
                System.out.println("敗者:" + user1.name);
                break;
            }


            card = handCard1.get((int)(Math.random()* handCard1.size()));
            if (handCard2.indexOf(card) == -1) {
                handCard2.add(card);
            } else {
                handCard2.remove(card);
            }

        }


    }

}




