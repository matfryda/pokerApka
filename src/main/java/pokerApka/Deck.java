package pokerApka;

import java.util.ArrayList;
import java.util.List;


public class Deck {

    private String[] color = {"diamonds", "clubs", "hearts", "spades"};
    private String[] figure = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};


    public List<Card> deckCreator() {
        List<Card> cards = new ArrayList<Card>();
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < figure.length; j++) {
                cards.add(new Card(color[i], figure[j], i+1, j+1));
            }
        }
        return cards;
    }

}