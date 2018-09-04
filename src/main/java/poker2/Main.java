package poker2;

import pokerApka.Card;
import pokerApka.Krupier;
import pokerApka.Player;
import pokerApka.Rank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Rank rank = new Rank();
        Krupier krupier = new Krupier();
        ArrayList<Player> players = new ArrayList<Player>();

        List<Card> testowaTaliaPoker = new ArrayList<Card>();
        testowaTaliaPoker.add(new Card("diamonds", "10", 2,9));
        testowaTaliaPoker.add(new Card("diamonds", "Jack", 2,10));
        testowaTaliaPoker.add(new Card("diamonds", "Queen", 2,11));
        testowaTaliaPoker.add(new Card("diamonds", "King", 2,12));
        testowaTaliaPoker.add(new Card("diamonds", "Ace", 2,13));

        Player player = new Player("JanuszKlątwa", 10);
        Player player1 = new Player("Radoslav", 11);
        Player player2 = new Player("Maurycy", 12);

        players.add(player);
        players.add(player1);
        players.add(player2);

        krupier.stworzTalie();

        krupier.rozdawanieDwochKartDlaGraczy(players);
        System.out.println("Karty pierwszego gracza: " + player.getPlayersDeck());
        System.out.println("Karty drugiego gracza: " + player1.getPlayersDeck());
        System.out.println("Karty trzeciego gracza: " + player2.getPlayersDeck());
        krupier.kartyWspolneFlop();
        System.out.println("Flop: " + krupier.kartyWspolne());
        krupier.kartyWspolneTurn();
        System.out.println("Turn: " + krupier.kartyWspolne());
        krupier.kartyWspolneRiver();
        System.out.println("River: " + krupier.kartyWspolne());

        krupier.wyswietlTalie();


        System.out.println(rank.RoyalFlush(testowaTaliaPoker));
    }
}