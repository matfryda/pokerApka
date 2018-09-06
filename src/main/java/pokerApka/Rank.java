package pokerApka;

import java.awt.*;
import java.util.List;

public class Rank {


    public void rank() {
    }

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

    public Boolean IsStraightFlush(List<Card> talia) {
        for (Card card : talia) {
            if (card.getIndexFigure() > 8 && card.getIndexFigure() < 12 ||
                    card.getIndexFigure() >= 7 && card.getIndexFigure() <= 11 ||
                    card.getIndexFigure() >= 6 && card.getIndexFigure() <= 10 ||
                    card.getIndexFigure() >= 5 && card.getIndexFigure() <= 9 ||
                    card.getIndexFigure() >= 4 && card.getIndexFigure() <= 8 ||
                    card.getIndexFigure() >= 3 && card.getIndexFigure() <= 7 ||
                    card.getIndexFigure() >= 2 && card.getIndexFigure() <= 6 ||
                    card.getIndexFigure() >= 1 && card.getIndexFigure() <= 5 ||
                    card.getIndexFigure() >= 0 && card.getIndexFigure() <= 4 ||
                    card.getIndexFigure() == 0 && card.getIndexFigure() == 1 &&
                            card.getIndexFigure() == 2 && card.getIndexFigure() == 3 &&
                            card.getIndexFigure() == 12) ;

        }
        return true;
    }


    public boolean StraightFlush(List<Card> talia) {
        boolean isStraightFlush = true;
        int ColorIndex = talia.get(0).getIndexColor();
        for (Card card : talia) {
            if (card.getIndexColor() != ColorIndex) {
                isStraightFlush = false;
                break;
            }
            if (isStraightFlush == true) {
                break;
            }
            return isStraightFlush;
        }

//        public boolean Flush (List < Card > talia) {
//            boolean isFlush = true;
//            int colorIndex = talia.get(0).getIndexColor();
//            for (Card card : talia) {
//                if (card.getIndexColor() != colorIndex) {
//                    return false;
//                }
//                if (isStraightFlush = false) ;
//                break;
//            }
//            return true;
//        }
//
//    }


        return isStraightFlush;
    }
}
