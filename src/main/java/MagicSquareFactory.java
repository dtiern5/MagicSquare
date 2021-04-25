import java.util.ArrayList;

public class MagicSquareFactory {
    private int[] coordinates;
    
    public MagicSquareFactory() {
        coordinates = new int[2];
        coordinates[0] = 0;
        coordinates[1] = 0; // remove these?
    }
    
    public MagicSquare createMagicSquare(int size) {
        coordinates[1] = size / 2;
        MagicSquare square = new MagicSquare(size);
        
        int value = 1;
        while (value <= square.getHeight() * square.getWidth()) {
            square.placeValue(coordinates[0], coordinates[1], value);
            move(coordinates[0], coordinates[1], square);
            square.placeValue(coordinates[0], coordinates[1], value);
            value++;
        }
        return square;
    }
    
    public void move(int row, int col, MagicSquare square) {
        int newRow = row - 1;
        int newCol = col + 1;
        
        if (newRow < 0) {
            newRow = square.getHeight() - 1;
        }
        if (newCol > square.getWidth() - 1) {
            newCol = 0;
        }
        if (square.readValue(newRow, newCol) > 0) {
            newRow = row + 1;
            newCol = col;
        }
        this.coordinates[0] = newRow;
        this.coordinates[1] = newCol;

    }

}
