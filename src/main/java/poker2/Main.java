package poker2;

import pokerApka.Card;
import pokerApka.Croupier;
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
                Croupier krupier = new Croupier();
                krupier.communityCardsFlop();
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
        Croupier krupier = new Croupier();
        ArrayList<Player> players = new ArrayList<Player>();

        List<Card> testDeck = new ArrayList<Card>();
        testDeck.add(new Card("diamonds", "10", 2, 9));
        testDeck.add(new Card("clubs", "8", 2, 12));
        testDeck.add(new Card("hearts", "King", 3, 4));
        testDeck.add(new Card("diamonds", "Jack", 3, 6));
        testDeck.add(new Card("diamonds", "Ace", 2, 5));
        testDeck.add(new Card("diamonds", "Ace", 1, 3));
        testDeck.add(new Card("diamonds", "Ace", 2, 2));

        Player player = new Player("JanuszKlątwa", 10);
        Player player1 = new Player("Radoslav", 11);
        Player player2 = new Player("Maurycy", 12);

        players.add(player);
        players.add(player1);
        players.add(player2);

        krupier.createDeck();

        krupier.playerIsOwnCards(players);
        System.out.println("Karty pierwszego gracza: " + player.getPlayersDeck());
        System.out.println("Karty drugiego gracza: " + player1.getPlayersDeck());
        System.out.println("Karty trzeciego gracza: " + player2.getPlayersDeck());
        krupier.communityCardsFlop();
        System.out.println("Flop: " + krupier.communityCards());
        krupier.communityCardsTurn();
        System.out.println("Turn: " + krupier.communityCards());
        krupier.communityCardsRiver();
        System.out.println("River: " + krupier.communityCards());

        krupier.showTheDeck();


//        System.out.println(rank.RoyalFlush(testowaTaliaPoker));
        System.out.println(rank.straight(testDeck));
//        System.out.println(rank.Pair(testowaTaliaPoker));
//        System.out.println(rank.IsStraight(testowaTaliaPoker));


        System.out.println(rank.threeOfAKind(testDeck));
        System.out.println(rank.quad(testDeck));
        System.out.println("Flush: " + rank.flush(testDeck));


      

    }
}