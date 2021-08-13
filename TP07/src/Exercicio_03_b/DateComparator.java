package Exercicio_03_b;

import java.util.Comparator;

public class DateComparator implements Comparator<Funcionario> {
    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        if (f1.getDataContratacao().before(f2.getDataContratacao()))
            return -1;
        else if (f1.getDataContratacao().after(f2.getDataContratacao()))
            return 1;
        else
            return 0;
    }
}
