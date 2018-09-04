package pokerApka;

public class Card {

    String color, figure;
    String indexColor, indexFigure;




//    public Card(String color, String figure) {
//        this.color = color;
//        this.figure = figure;
//    }

    public Card(String color, String figure, String indexColor, String indexFigure) {
        this.color = color;
        this.figure = figure;
        this.indexColor = indexColor;
        this.indexFigure = indexFigure;
    }

    public Card(String s, String s1, int i, int j) {
        this.color = color;
        this.figure = figure;
        this.indexColor = indexColor;
        this.indexFigure = indexFigure;
    }


    @Override
    public String toString() {
        return figure +
                " of " +
                color;
    }
}

