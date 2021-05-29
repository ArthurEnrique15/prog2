import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, resultado;

        Scanner scn = new Scanner(System.in);

        System.out.print("Digite o número: ");

        n = scn.nextInt();

        resultado = funcao(n);

        System.out.println("F(" + n + ") = " + resultado);
    }

    public static int funcao (int n) {
        if (n == 1)
            return 1;

        if (n == 2)
            return 2;

        int resultado = (2 * funcao(n-1)) + (3 * funcao(n-2));
        return resultado;
    }
}
