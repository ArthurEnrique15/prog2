package Exercicio_03_b;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            funcionarios.add(new Funcionario(1, "José", 2000, dateFormat.parse("6/02/2021")));
            funcionarios.add(new Funcionario(2, "Arthur", 10000, dateFormat.parse("01/02/2021")));
            funcionarios.add(new Funcionario(3, "Mario", 4000, dateFormat.parse("10/01/2021")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Funcionários");
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }

        System.out.println("\nOrdenando os funcionários por salário");

        Collections.sort(funcionarios);

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }

        System.out.println("\nFuncionário com o menor salário");
        System.out.println(Collections.min(funcionarios));

        System.out.println("Funcionário com o maior salário");
        System.out.println(Collections.max(funcionarios));

        DateComparator dateComparator = new DateComparator();

        System.out.println("\nFuncionário mais experiente");
        System.out.println(Collections.min(funcionarios, dateComparator));

        System.out.println("Funcionário menos experiente");
        System.out.println(Collections.max(funcionarios, dateComparator));

        NameComparator nameComparator = new NameComparator();

        System.out.println("\nOrdenando os funcionários em ordem alfabética");
        Collections.sort(funcionarios, nameComparator);

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i));
        }
    }
}