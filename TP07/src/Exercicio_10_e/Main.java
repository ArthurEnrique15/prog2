package Exercicio_10_e;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scn = new Scanner(System.in);

        System.out.println("1. Divisão");
        System.out.println("2. Log");
        System.out.println("Qual operação deseja realizar?");


        int operacao = scn.nextInt();

        while (operacao < 1 || operacao > 2) {
            System.out.print("Valor inválido, digite novamente: ");
            operacao = scn.nextInt();
        }

        if (operacao == 1) {
            System.out.print("Digite o dividendo: ");
            double a = scn.nextDouble();

            System.out.print("Digite o divisor: ");
            double b = scn.nextDouble();

            System.out.println(calculator.div(a, b));
        } else {
            System.out.print("Digite o logaritmando: ");
            double a = scn.nextDouble();

            System.out.println(calculator.log10(a));
        }
    }
}
