public class TableOut {
    public static void printTable (int [][] table) {// метод выводит игровое поле
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
