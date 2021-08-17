package Exercicio_05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean operation = false;
        while (operation == false) {
            try {
                System.out.print("Digite o primeiro valor: ");
                int a = scn.nextInt();

                System.out.print("Digite o segundo valor: ");
                int b = scn.nextInt();

                double div = a / b;

                System.out.println("\n" + a + " / " + b + " = " + div);
                operation = true;
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, digite apenas números inteiros!\n");
                scn.nextLine();
            }  catch (ArithmeticException e) {
                System.out.println("\nErro matemático!\n");
            }
        }

        System.out.println("\nPrograma finalizado!");
    }
}
