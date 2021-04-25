
public class Program {

    public static void main(String[] args) {

        MagicSquareFactory msFactory = new MagicSquareFactory();
        // System.out.println(msFactory.createMagicSquare(5));

        MagicSquare square = new MagicSquare(3);
        square.placeValue(0, 0, 8);
        square.placeValue(0, 1, 1);
        square.placeValue(0, 2, 6);
        square.placeValue(1, 0, 3);
        square.placeValue(1, 1, 5);
        square.placeValue(1, 2, 7);
        square.placeValue(2, 0, 4);
        square.placeValue(2, 1, 9);
        square.placeValue(2, 2, 2);

        MagicSquare badSquare = new MagicSquare(3);
        badSquare.placeValue(0, 0, 1);
        badSquare.placeValue(0, 1, 2);
        badSquare.placeValue(0, 2, 3);
        badSquare.placeValue(1, 0, 4);
        badSquare.placeValue(1, 1, 5);
        badSquare.placeValue(1, 2, 6);
        badSquare.placeValue(2, 0, 7);
        badSquare.placeValue(2, 1, 8);
        badSquare.placeValue(2, 2, 9);

        System.out.println(square.toString());
        System.out.println("sum of rows: " + square.sumsOfRows());
        System.out.println("sum of columns: " + square.sumsOfColumns());
        System.out.println("sum of diagonals: " + square.sumsOfDiagonals());
        
        System.out.println("");
        System.out.println("--------");
        System.out.println("");

        System.out.println(badSquare.toString());
        System.out.println("sum of rows: " + badSquare.sumsOfRows());
        System.out.println("sum of columns: " + badSquare.sumsOfColumns());
        System.out.println("sum of diagonals: " + badSquare.sumsOfDiagonals());
    }
}
