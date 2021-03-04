package pack2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class prac39 {
    public static void main(String[] args) {
        ArrayList<Card> cardList = initCardList();
//        shuffle(cardList);
        Collections.shuffle(cardList);
        System.out.print("洗牌");
        System.out.println(cardList);
//        Card car1 = new Card(1,"♠");
//        System.out.println(cardList.contains(car1));
//        Card car2 = new Card(11,"♠");
//        System.out.println(cardList.contains(car2));
        ArrayList<Card> playerA = new ArrayList<>();
        ArrayList<Card> playerB = new ArrayList<>();
        ArrayList<Card> playerC = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            Card car1 = cardList.remove(0);
            playerA.add(car1);

            Card car2 = cardList.remove(0);
            playerB.add(car1);

            Card car3 = cardList.remove(0);
            playerC.add(car1);
        }
        System.out.println();
        System.out.println("抓牌后:");
        System.out.println(playerA);
        System.out.println(playerB);
        System.out.println(playerC);
    }

    private static ArrayList initCardList() {
        ArrayList<Card> cardList = new ArrayList<>();
        String[] suits = {"♥", "♣", "♦", "♠"};
        for (String suit : suits) {
            for (int rank = 1; rank < 14; rank++) {
                Card card = new Card(rank, suit);
                cardList.add(card);
            }
        }
        return cardList;
    }

    private static void shuffle(ArrayList<Card> cardList) {
        Random random = new Random();
        for (int i = cardList.size()-1; i > 0; i--) {
            int rand1 = random.nextInt(i);

            Card card1 = cardList.get(i);
            Card card2 = cardList.get(rand1);
            cardList.set(i, card2);
            cardList.set(rand1, card1);
        }
    }


}
