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
//        System.out.println("Royal flush!");
        return isRoyal;
    }
}
