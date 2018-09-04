package pokerApka;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> playersDeck = new ArrayList<Card>();

    public String login;
    public int id;

    public Player(String login, int id) {
        this.login = login;
        this.id = id;
    }

    public ArrayList<Card> getPlayersDeck() {
        return playersDeck;
    }

    public void setPlayersDeck(ArrayList<Card> playersDeck) {
        this.playersDeck = playersDeck;
    }

    public void addCardToList(Card card) {
        playersDeck.add(card);
    }




}
