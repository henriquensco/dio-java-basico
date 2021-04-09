package POO.Arrays;

//Arrays multidimensionais : bidimensional

public class Exemplo002 {
    public static void main(String[] args) {
        int[][] meuArrayMulti = { {5, 7, 8, 10}, {6, 9, 11, 12} };

        for (int i = 0; i < meuArrayMulti.length; i++) {
            for (int j = 0; j < meuArrayMulti[i].length; j++) {
                System.out.println(meuArrayMulti[i][j]);
            }
        }

    }
}
