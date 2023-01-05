import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private String[][] gameMap;
    private String[][] mineMap;
    private int rowCount;
    private int columnCount;
    private int mineCount;
    private boolean isGame = true;
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    public void setMap() {
        System.out.println("Enter Column Count : ");
        this.columnCount = input.nextInt();
        System.out.println("Enter Row Count : ");
        this.rowCount = input.nextInt();

        gameMap = new String[this.columnCount][this.rowCount];
        mineMap = new String[this.columnCount][this.rowCount];
        prepareMaps(mineMap);
        prepareMaps(gameMap);
        this.mineCount = (rowCount * columnCount) / 4;
        createMines();
    }

    public int indexControl(int row, int column) {
        int count = 0;
        if (this.mineMap[row][column] == "*") {
            isGame = false;
            System.out.println("Game Over!");

        } else {
            if ((column < this.columnCount - 1) && this.mineMap[row][column + 1] == "*") {
                count++;
            }
            if (column > 0 && this.mineMap[row][column - 1] == "*") {
                count++;
            }
            if ((row < this.rowCount - 1) && this.mineMap[row + 1][column] == "*") {
                count++;
            }
            if (row > 0 && this.mineMap[row - 1][column] == "*") {
                count++;
            }
            if ((row > 0 && column > 0) && this.mineMap[row - 1][column - 1] == "*") {
                count++;
            }
            if ((row > 0 && column < this.columnCount - 1) && this.mineMap[row - 1][column + 1] == "*") {
                count++;
            }
            if ((column > 0 && (row < this.rowCount - 1)) && this.mineMap[row + 1][column - 1] == "*") {
                count++;
            }
            if ((row < this.rowCount - 1 && column < this.columnCount - 1) && this.mineMap[row + 1][column + 1] == "*") {
                count++;
            }
        }
        return count;
    }

    public void runGame() {
        //Create Game
        setMap();
        //Game
        System.out.println("----------------------------------");
        while (isGame) {
            printMap(this.gameMap);
            System.out.print("Satır girin : ");
            int row = this.input.nextInt();
            System.out.print("Sütun girin : ");
            int column = this.input.nextInt();
            if (row > this.rowCount - 1 || row < 0 || column > this.columnCount - 1 || column < 0) {
                System.out.println("Geçersiz Koordinat");
            } else {
                this.gameMap[row][column] = String.valueOf(indexControl(row, column));
            }

        }


    }

    public void createMines() {
        while (this.mineCount != 0) {
            int row = random.nextInt(mineMap.length);
            int column = random.nextInt(mineMap[0].length);
            if (this.mineMap[row][column] == "*") {
                continue;
            } else {
                this.mineMap[row][column] = "*";
            }
            mineCount--;
        }


    }

    public void printMap(String[][] arrays) {
        for (String[] i : arrays) {
            for (String k : i) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public void prepareMaps(String[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = "-";
            }
        }
    }
}
