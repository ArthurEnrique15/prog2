package Exercicio_03_b;

import java.util.Comparator;

public class NameComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return f1.getNome().compareTo(f2.getNome());
    }
}
