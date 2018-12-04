package pokerApka;

import java.util.List;

public class Rank {

    //sprawdzanie czy jest poker królewski
    public boolean RoyalFlush(List<Card> talia) {
        boolean isRoyal = true;
        int ColorIndex = talia.get(0).getIndexColor();
        for (Card card : talia) {
            if (card.getIndexColor() != ColorIndex) {
                isRoyal = false;
                break;
            }
            if (card.getIndexFigure() < 9) {
                isRoyal = false;
                break;
            }
        }
        return isRoyal;
    }


    public Boolean IsStraight(List<Card> talia) {
        Card min = talia.get(0);
        for (Card card : talia) {
            if (card.getIndexFigure() < min.getIndexFigure()) {
                min = card;
            }
        }
        int counter = 0;
        for (Card card : talia) {
            if (card.getIndexFigure() - min.getIndexFigure() == 1) {
                counter++;
                if (counter > 4) {
                    return true;
                }

            }

        }
        return false;
    }


    //sprawdzanie czy jest para
    public Boolean Pair(List<Card> talia) {
        for (int i = 0; i < talia.size() - 1; i++) {
            for (int j = i + 1; j < talia.size(); j++) {
                if (talia.get(i).getIndexFigure() == talia.get(j).getIndexFigure()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Boolean ThreeOfAKind(List<Card> talia) {
        for (int i = 0; i < talia.size() - 2; i++) {
            for (int j = i + 1; j < talia.size() - 1; j++) {
                for (int k = i + 2; k < talia.size(); k++) {
                    if (talia.get(i).getIndexFigure() == talia.get(j).getIndexFigure() &&
                            talia.get(k).getIndexFigure() == talia.get(j).getIndexFigure()) {
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public Boolean Quad(List<Card> talia) {
        for (int i = 0; i < talia.size() - 3; i++) {
            for (int j = i + 1; j < talia.size() - 2; j++) {
                for (int k = i + 2; k < talia.size() - 1; k++) {
                    for (int l = i + 3; l < talia.size(); l++)
                        if (talia.get(i).getIndexFigure() == talia.get(j).getIndexFigure() &&
                                talia.get(k).getIndexFigure() == talia.get(j).getIndexFigure()
                                && talia.get(l).getIndexFigure() == talia.get(k).getIndexFigure()) {
                            return true;
                        }
                }
            }
        }
        return false;
    }

}