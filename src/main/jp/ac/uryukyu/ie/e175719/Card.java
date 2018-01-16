package jp.ac.uryukyu.ie.e175719;

import java.util.*;

public class Card {
    public void card(Player user1,Player user2) {

        //ジジ抜きの"A"を先にとっておく。
        String[] cards = {"A", "2", "2", "3", "3", "4", "4", "5", "5", "6", "6", "7", "7", "8", "8", "9", "9", "10", "10", "J", "J", "Q", "Q", "K", "K" };
        List<String> list = Arrays.asList(cards);
        Collections.shuffle(list);
        String[] trump = (String[]) list.toArray(new String[list.size()]);

        List<String> user1Card = new ArrayList<String>();
        List<String> user2Card = new ArrayList<String>();


        for (int i = 0; i < cards.length; i++) {
            if (i % 2 == 0) {
                user1Card.add(trump[i]);
            } else {
                user2Card.add(trump[i]);
            }

            String trumpCard = trump[i];
            int first = user1Card.indexOf(trumpCard);
            if (first == -1) {
                user1Card.add(trump[i]);
            } else {
                user1Card.remove(trump[i]);
            }

            String trumpCard2 = trump[i];
            int next = user2Card.indexOf(trumpCard2);
            if (next == -1) {
                user2Card.add(trump[i]);
            } else {
                user2Card.remove(trump[i]);
            }
        }
    }
}
