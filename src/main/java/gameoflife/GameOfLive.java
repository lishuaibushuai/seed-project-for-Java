package gameoflife;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/17
 */
public class GameOfLive {

    private static int[][] statusMatrix = {{0, 0, 1, 0, 0, 0, 0, 0}, {0, 1, 1, 0, 0, 0, 0, 0}};

    public static int countLivingCells(int[][] cells, int row, int column) {
        int countLiving = 0;
        for (int i = row - 1; i <= row + 1; i++)
            for (int j = column - 1; j <= column + 1; j++)
                countLiving += cells[i][j];
        countLiving -= cells[row][column];
        return countLiving;
    }

    public static int shouldLive(int[][] cells, int row, int column) {
        int currentStatus = cells[row][column];
        int countLiveCells = countLivingCells(cells, row, column);
        return statusMatrix[currentStatus][countLiveCells];
    }

    public static int[][] cellLiveStatus(int[][] cells) {
        int[][] nextStatus = init();
        for (int i = 1; i < cells.length; i++)
            for (int j = 1; j < cells[i].length; j++)
                nextStatus[i][j] = shouldLive(cells, i, j);
        printCell(nextStatus);
        return nextStatus;
    }

    public static void printCell(int[][] cells) {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }

    public static void game() {

    }

    public static int[][] init() {
        int[][] cellsA = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        return cellsA;
    }
}
