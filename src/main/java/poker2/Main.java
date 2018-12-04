package poker2;

import pokerApka.Card;
import pokerApka.Krupier;
import pokerApka.Player;
import pokerApka.Rank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Main extends JFrame {
    public Main() {
        initComponents();
    }

    private void initComponents() {
        this.setTitle("Poker application");
        this.setBounds(300, 300, 300, 300);
        panel.add(label);
        panel.add(fold);
        panel.add(check);
        panel.add(raise);
        fold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Krupier krupier = new Krupier();
                krupier.kartyWspolneFlop();
            }
        });
        setDefaultCloseOperation(3);
    }

    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JButton fold = new JButton("Fold");
    JButton check = new JButton("Check");
    JButton raise = new JButton("Raise");


    public static void main(String[] args) {

        Rank rank = new Rank();
        Krupier krupier = new Krupier();
        ArrayList<Player> players = new ArrayList<Player>();

        List<Card> testowaTaliaPoker = new ArrayList<Card>();
        testowaTaliaPoker.add(new Card("diamonds", "10", 2, 9));
        testowaTaliaPoker.add(new Card("clubs", "8", 2, 12));
        testowaTaliaPoker.add(new Card("hearts", "King", 2, 4));
        testowaTaliaPoker.add(new Card("diamonds", "Jack", 2, 3));
        testowaTaliaPoker.add(new Card("diamonds", "Ace", 2, 3));
        testowaTaliaPoker.add(new Card("diamonds", "Ace", 2, 3));
        testowaTaliaPoker.add(new Card("diamonds", "Ace", 2, 3));

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

//        krupier.wyswietlTalie();

//        testowaTaliaPoker.stream().filter(g->g.getIndexFigure()-g.getIndexFigure()=5)


//        System.out.println(rank.RoyalFlush(testowaTaliaPoker));
//        System.out.println(rank.IsStraightt(testowaTaliaPoker));
//        System.out.println(rank.Pair(testowaTaliaPoker));
//        System.out.println(rank.IsStraight(testowaTaliaPoker));

//        switch () {
//
//        }

        System.out.println(rank.ThreeOfAKind(testowaTaliaPoker));
        System.out.println(rank.Quad(testowaTaliaPoker));


        new Main().setVisible(false);

    }
}