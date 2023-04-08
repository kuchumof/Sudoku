import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

public class TableCreator {

    private static long counter;

    private static int[][] data;

    public static int[][] getSuccessRandomTable() {
        LocalDateTime from = LocalDateTime.now();
        boolean isValid;
        int[][] data;
        do {
            data = getRandomTable();
            isValid = TableValidator.check(data);
            TableOut.printTable(data);
        }
        while (!isValid);
        LocalDateTime to = LocalDateTime.now();
        System.out.println("Заняло времени в секундах " + Duration.between(from, to).toSeconds());
        return data;

    }

    private static int[][] getRandomTable() {
        int[][] data = new int[Constants.TABLE_SIZE][Constants.TABLE_SIZE];
        final int min = 1; // Минимальное число для диапазона
        final int max = 9; // Максимальное число для диапазона
        int[] line = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int rnd = rnd(min, max);
                data[i][j] = rnd;
            }

        }
        counter++;
        System.out.println("Игровых досок создано " + counter);
        return data;
    }

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    private static int[][] getSuccessTable() {
        int[][] data = new int[Constants.TABLE_SIZE][Constants.TABLE_SIZE];
        data[0][0] = 2;
        data[0][1] = 1;
        data[0][2] = 9;
        data[0][3] = 5;
        data[0][4] = 4;
        data[0][5] = 3;
        data[0][6] = 6;
        data[0][7] = 7;
        data[0][8] = 8;
        /*===============*/
        data[1][0] = 5;
        data[1][1] = 4;
        data[1][2] = 3;
        data[1][3] = 8;
        data[1][4] = 7;
        data[1][5] = 6;
        data[1][6] = 9;
        data[1][7] = 1;
        data[1][8] = 2;
        /*===============*/
        data[2][0] = 8;
        data[2][1] = 7;
        data[2][2] = 6;
        data[2][3] = 2;
        data[2][4] = 1;
        data[2][5] = 9;
        data[2][6] = 3;
        data[2][7] = 4;
        data[2][8] = 5;
        /*===============*/
        data[3][0] = 4;
        data[3][1] = 3;
        data[3][2] = 2;
        data[3][3] = 7;
        data[3][4] = 6;
        data[3][5] = 5;
        data[3][6] = 8;
        data[3][7] = 9;
        data[3][8] = 1;
        /*===============*/
        data[4][0] = 7;
        data[4][1] = 6;
        data[4][2] = 5;
        data[4][3] = 1;
        data[4][4] = 9;
        data[4][5] = 8;
        data[4][6] = 2;
        data[4][7] = 3;
        data[4][8] = 4;
        /*===============*/
        data[5][0] = 1;
        data[5][1] = 9;
        data[5][2] = 8;
        data[5][3] = 4;
        data[5][4] = 3;
        data[5][5] = 2;
        data[5][6] = 5;
        data[5][7] = 6;
        data[5][8] = 7;
        /*===============*/
        data[6][0] = 3;
        data[6][1] = 2;
        data[6][2] = 1;
        data[6][3] = 6;
        data[6][4] = 5;
        data[6][5] = 4;
        data[6][6] = 7;
        data[6][7] = 8;
        data[6][8] = 9;
        /*===============*/
        data[7][0] = 6;
        data[7][1] = 5;
        data[7][2] = 4;
        data[7][3] = 9;
        data[7][4] = 8;
        data[7][5] = 7;
        data[7][6] = 1;
        data[7][7] = 2;
        data[7][8] = 3;
        /*===============*/
        data[8][0] = 9;
        data[8][1] = 8;
        data[8][2] = 7;
        data[8][3] = 3;
        data[8][4] = 2;
        data[8][5] = 1;
        data[8][6] = 4;
        data[8][7] = 5;
        data[8][8] = 6;
        /*===============*/

        return data;
    }
}
