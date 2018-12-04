package pokerApka;

import java.util.ArrayList;
import java.util.List;

public class Rank {

    //sprawdzanie czy jest poker królewski
    public int royalFlush(List<Card> talia) {
        boolean isRoyal = true;
        int ColorIndex = talia.get(0).getIndexColor();
        for (Card card : talia) {
            if (card.getIndexColor() != ColorIndex) {
                isRoyal = false;
                return 1;
            }
            if (card.getIndexFigure() < 9) {
                isRoyal = false;
                return 1;
            }
        }
        return 10;
    }


    //sprawdzenie czy jest strit
    public int straight(List<Card> deck) {
        Card min = deck.get(0);
        for (Card card : deck) {
            if (card.getIndexFigure() < min.getIndexFigure()) {
                min = card;
            }
        }
        int counter = 0;
        for (Card card : deck) {
            if (card.getIndexFigure() - min.getIndexFigure() == 1) {
                counter++;
                if (counter > 4) {
                    return 5;
                }
            }
        }
        return 0;
    }


    //sprawdzanie czy jest para
    public int pair(List<Card> deck) {
        for (int i = 0; i < deck.size() - 1; i++) {
            for (int j = i + 1; j < deck.size(); j++) {
                if (deck.get(i).getIndexFigure() == deck.get(j).getIndexFigure()) {
                    return 2;
                }
            }
        }
        return 1;
    }

    //sprawdzenie czy jest trójka
    public int threeOfAKind(List<Card> talia) {
        for (int i = 0; i < talia.size() - 2; i++) {
            for (int j = i + 1; j < talia.size() - 1; j++) {
                for (int k = i + 2; k < talia.size(); k++) {
                    if (talia.get(i).getIndexFigure() == talia.get(j).getIndexFigure() &&
                            talia.get(k).getIndexFigure() == talia.get(j).getIndexFigure()) {
                        return 3;
                    }
                }
            }
        }
        return 1;
    }

    //sprawdzenie czy jest kareta
    public int quad(List<Card> talia) {
        for (int i = 0; i < talia.size() - 3; i++) {
            for (int j = i + 1; j < talia.size() - 2; j++) {
                for (int k = i + 2; k < talia.size() - 1; k++) {
                    for (int l = i + 3; l < talia.size(); l++)
                        if (talia.get(i).getIndexFigure() == talia.get(j).getIndexFigure() &&
                                talia.get(k).getIndexFigure() == talia.get(j).getIndexFigure()
                                && talia.get(l).getIndexFigure() == talia.get(k).getIndexFigure()) {
                            return 6;
                        }
                }
            }
        }
        return 1;
    }

    //sprawdzenie czy jest kolor
    public static int flush(List<Card> deck) {
        int counterSpades = 0; //4
        int counterClubs = 0; //2
        int counterHearts = 0; //3
        int counterDiamonds = 0; //1

        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getIndexColor() == 1) {
                counterDiamonds++;
            }
            if (deck.get(i).getIndexColor() == 2) {
                counterClubs++;
            }
            if (deck.get(i).getIndexColor() == 3) {
                counterHearts++;
            }
            if (deck.get(i).getIndexColor() == 4) {
                counterSpades++;
            }
            if (counterClubs >= 5 || counterDiamonds >= 5 || counterHearts >= 5 || counterSpades >= 5) {
                return 6;
            }
        }
        return 1;
    }

    public List<Card> figureFinal = new ArrayList<Card>();



}