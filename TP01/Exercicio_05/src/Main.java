import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] matrizResultado = new int[3][3];

        preencheMatriz(matriz);

        System.out.println("Matriz original");

        escreveMatriz(matriz);

        matrizResultado = giraMatriz(matriz);

        System.out.println("Matriz resultado");

        escreveMatriz(matrizResultado);

    }

    private static void preencheMatriz (int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }
    }

    private static void escreveMatriz (int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    private static int[][] giraMatriz (int matriz[][]) {
        int[][] matrizResultado = new int[matriz.length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int x  = matriz.length-1;
            for (int j = 0; j < matriz.length; j++) {
                matrizResultado[i][x] = matriz[j][i];
                x--;
            }
        }

        return matrizResultado;
    }
}
