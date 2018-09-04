package pokerApka;

public class Card {

    private String color, figure;
    private int indexColor, indexFigure;

    public Card(String color, String figure, int indexColor, int indexFigure) {
        this.color = color;
        this.figure = figure;
        this.indexColor = indexColor;
        this.indexFigure = indexFigure;
    }

    public String getColor() {
        return color;
    }

    public String getFigure() {
        return figure;
    }

    public int getIndexColor() {
        return indexColor;
    }

    public int getIndexFigure() {
        return indexFigure;
    }

    @Override

    public String toString() {
        return figure +
                " of " +
                color + " " + indexColor + " " + indexFigure;
    }
}