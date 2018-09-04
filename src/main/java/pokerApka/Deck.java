package pokerApka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {


    private String[] color = {"diamonds", "clubs", "hearts", "spades"};
    private String[] figure = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

//    private String[] indexColor = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
//    private String[] indexFigure = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
    private int[] indexColor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
//    private int[] indexColor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private int[] indexFigure = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
//    private int[] indexFigure = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public List<Card> deckCreator() {
       List<Card> cards = new ArrayList<Card>();
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < figure.length; j++) {
//                for (int k = 0; k < indexColor.length; k++) {
//                    for (int l = 0; l < indexFigure.length; l++) {
//                        cards.add(new Card(color[i], figure[j]), indexColor[k], indexFigure[l]);
                        cards.add(new Card(color[i], figure[j],i,j));
                    }
                }
//            }
//        }
        return cards;
    }


}

