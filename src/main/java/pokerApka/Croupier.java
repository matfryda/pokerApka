package pokerApka;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class Croupier {

    Random random = new Random();

    ArrayList<Card> deck2 = new ArrayList<Card>();

    ArrayList<Card> commonCards = new ArrayList<Card>();

    ArrayList<Card> allPlayerCards = new ArrayList<Card>();

    public ArrayList<Card> communityCards() {
        return commonCards;
    }

    Deck deck = new Deck();

    public void createDeck() {
        deck2 = (ArrayList<Card>) deck.deckCreator();
    }

    public void drawOneCard(Player player) {

        int variable = random.nextInt(deck2.size());
        Card card1 = deck2.get(variable);
        player.addCardToList(card1);
        deck2.remove(card1);
    }

    public void playerIsOwnCards(ArrayList<Player> players) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < players.size(); j++) {
                drawOneCard(players.get(j));
            }
        }
    }

    public void flop(ArrayList<Player> flop) {
        for (int i = 0; i < 3; i++) {
            drawOneCard(flop.get(i));
        }
    }

    public void communityCardsFlop() {
        for (int i = 0; i < 3; i++) {
            int variable = random.nextInt(deck2.size());
            Card card1 = deck2.get(variable);
            commonCards.add(card1);
            deck2.remove(card1);
        }
    }

    public void communityCardsTurn() {
        int variable = random.nextInt(deck2.size());
        Card card1 = deck2.get(variable);
        commonCards.add(card1);
        deck2.remove(card1);
    }

    public void communityCardsRiver() {
        int variable = random.nextInt(deck2.size());
        Card card1 = deck2.get(variable);
        commonCards.add(card1);
        deck2.remove(card1);
    }

    public void showTheDeck() {
        System.out.println(deck2);
    }

    public List<Card> allPlayerCards(Player player) {

        List<Card> flop = new ArrayList<Card>();

        for (int i = 0; i < player.getPlayersDeck().size(); i++) {

            flop.add(player.getPlayersDeck().get(i));
        }
        for (int i = 0; i < commonCards.size(); i++) {

            flop.add(commonCards.get(i));
        }
        return flop;
    }

}