package poker2;

import pokerApka.Krupier;
import pokerApka.Player;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Krupier krupier = new Krupier();
        ArrayList<Player> players = new ArrayList<Player>();


        Player player = new Player("JanuszKlątwa", 10);
        Player player1 = new Player("Radoslav", 11);
        Player player2 = new Player("Maurycy", 12);

        players.add(player);
        players.add(player1);
        players.add(player2);

        krupier.stworzTalie();
//        krupier.wyswietlTalie();

//        for (int i = 0; i < 52; i++) {
//            System.out.println(i);
//            krupier.losowanieJednejKartyDlaGracza(player);
//        }


//        krupier.losowanieJednejKartyDlaGracza(player);


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


    }
}