package jp.ac.uryukyu.ie.e175719;

import java.util.*;

public class Card {
    ArrayList<String> playerCard1;
    ArrayList<String> playerCard2;

    public void card() {


        String[] cards = {"A", "2", "2", "3", "3", "4", "4", "5", "5", "6", "6", "7", "7", "8", "8", "9", "9", "10", "10", "J", "J", "Q", "Q", "K", "K" };
        List<String> list = Arrays.asList(cards);
        Collections.shuffle(list);//カードをシャッフルする。
        String[] trump = (String[]) list.toArray(new String[list.size()]);

        ArrayList<String> user1Card = new ArrayList<String>();
        ArrayList<String> user2Card = new ArrayList<String>();

        //トランプカードをcardsのリスト分だけ奇数、偶数で２人のプレイヤーに配布する。
        for (int i = 0; i < cards.length; i++) {
            if (i % 2 == 0) {
                user1Card.add(trump[i]);
            } else {
                user2Card.add(trump[i]);
            }

            int first = user1Card.indexOf(trump[i]);
            //プレイヤーそれぞれの手札に同じカードがある場合除去する。
            if (first == -1) {
                user1Card.add(trump[i]);
            } else {
                user1Card.remove(trump[i]);
            }

            int next = user2Card.indexOf(trump[i]);
            if (next == -1) {
                user2Card.add(trump[i]);
            } else {
                user2Card.remove(trump[i]);
            }

        }
        this.playerCard1=user1Card;
        this.playerCard2=user2Card;



    }
}
