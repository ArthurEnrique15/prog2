import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] vendas = new int[12][4];

        preencheMatriz(vendas);

        System.out.println("Vendas do ano");
        escreveMatriz(vendas);

        totalMes(vendas);

        totalSemana(vendas);

        totalAno(vendas);
    }

    private static void preencheMatriz (int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
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

    private static void totalMes (int matriz[][]) {
        int somaMes = 0;

        System.out.println("\nTotal vendido em cada mês");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaMes += matriz[i][j];
            }
            System.out.println("Mês " + (i+1) + ": " + somaMes);
            somaMes = 0;
        }
    }

    private static void totalSemana (int matriz[][]) {
        int somaSemana = 0, x = 0;

        System.out.println("\nTotal vendido em cada semana");

        for (int i = 0; i < matriz[x].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                somaSemana += matriz[j][i];
            }
            System.out.println("Semana " + (i+1) + ": " + somaSemana);
            somaSemana = 0;
            x++;
        }
    }

    private static void totalAno (int matriz[][]) {
        int somaAno = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaAno += matriz[i][j];
            }
        }

        System.out.println("\nTotal vendido no ano: " + somaAno);
    }
}