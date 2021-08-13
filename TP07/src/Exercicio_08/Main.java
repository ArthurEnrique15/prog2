package Exercicio_08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(div());
        } catch (InputMismatchException e) {
            System.out.println(e.fillInStackTrace());
        }
        System.out.println("\nPrograma finalizado!");
    }

    static double div() {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro valor: ");
            int a = scn.nextInt();

            System.out.print("Digite o segundo valor: ");
            int b = scn.nextInt();

            return a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.fillInStackTrace());
        }
        return 0;
    }
}
