package pokerApka;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class Krupier {

    Random random = new Random();

    public ArrayList<Card> playersDeck = new ArrayList<Card>(2);

    ArrayList<Card> talia = new ArrayList<Card>();

    ArrayList<Card> kartyWspolne = new ArrayList<Card>();

    ArrayList<Card> wszystkieKartyGracza = new ArrayList<Card>();

    public ArrayList<Card> kartyWspolne() {
        return kartyWspolne;
    }

    Deck deck = new Deck();

    public void stworzTalie() {
        talia = (ArrayList<Card>) deck.deckCreator();
    }

    public void losowanieJednejKartyDlaGracza(Player player) {

        int zmienna = random.nextInt(talia.size());
        Card card1 = talia.get(zmienna);
        player.addCardToList(card1);
        talia.remove(card1);
    }

    public void rozdawanieDwochKartDlaGraczy(ArrayList<Player> players) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < players.size(); j++) {
                losowanieJednejKartyDlaGracza(players.get(j));
            }
        }
    }

    public void flop(ArrayList<Player> flop) {
        for (int i = 0; i < 3; i++) {
            losowanieJednejKartyDlaGracza(flop.get(i));
        }
    }

    public void kartyWspolneFlop() {
        for (int i = 0; i < 3; i++) {
            int zmienna = random.nextInt(talia.size());
            Card card1 = talia.get(zmienna);
            kartyWspolne.add(card1);
            talia.remove(card1);
        }
    }

    public void kartyWspolneTurn() {
        int zmienna = random.nextInt(talia.size());
        Card card1 = talia.get(zmienna);
        kartyWspolne.add(card1);
        talia.remove(card1);
    }

    public void kartyWspolneRiver() {
        int zmienna = random.nextInt(talia.size());
        Card card1 = talia.get(zmienna);
        kartyWspolne.add(card1);
        talia.remove(card1);
    }

    public void wyswietlTalie() {
        System.out.println(talia);
    }

    public void wszystkieKartyGraczaListaFlop(Player player){
        for (int i = 0; i < kartyWspolne.size(); i++) {
            for (int j = 0; j <playersDeck.size() ; j++) {
                int zmienna = random.nextInt(talia.size());
                Card card1 = talia.get(zmienna);
                player.addCardToList(card1);
                talia.remove(card1);
            }
        }
    }

    public void wszystkieKartyGraczaListaTurn(Player player){
        for (int i = 0; i < kartyWspolne.size(); i++) {
            for (int j = 0; j <playersDeck.size() ; j++) {
                int zmienna = random.nextInt(talia.size());
                Card card1 = talia.get(zmienna);
                player.addCardToList(card1);
                talia.remove(card1);
            }
        }
    }public void wszystkieKartyGraczaListaRiver(Player player){
        for (int i = 0; i < kartyWspolne.size(); i++) {
            for (int j = 0; j <playersDeck.size() ; j++) {
                int zmienna = random.nextInt(talia.size());
                Card card1 = talia.get(zmienna);
                player.addCardToList(card1);
                talia.remove(card1);
            }
        }
    }
}