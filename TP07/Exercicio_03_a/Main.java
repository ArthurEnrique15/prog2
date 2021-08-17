package Exercicio_03_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random generator = new Random();

        System.out.println("Lista de numeros");
        for (int i = 0; i < 50; i++) {
            list.add(generator.nextInt(99));

            System.out.print(list.get(i) + " ");
            if (i > 0 && (i+1) % 10 == 0)
                System.out.println();
            if (list.get(i) < 10)
                System.out.print(" ");
        }

        System.out.println();

        System.out.println("Maior elemento: " + Collections.max(list));
        System.out.println("Menor elemento: " + Collections.min(list));

        System.out.println("\nQuantas vezes o menor apareceu: " + Collections.frequency(list, Collections.min(list)));

        System.out.println("\nLista ordenada em ordem crescente");
        Collections.sort(list);
        for (int i = 0; i < 50; i++) {
            System.out.print(list.get(i) + " ");
            if (i > 0 && (i+1) % 10 == 0)
                System.out.println();
            if (list.get(i) < 10)
                System.out.print(" ");
        }
    }
}
