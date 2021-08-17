package Exercicio_10_a_b_c_d;

public class Calculator {
    double div(double a, double b) throws InvalidOperationException {
        if (b == 0) {
            InvalidOperationException invalidOperation = new InvalidOperationException("Não é possível dividir por 0");
            throw invalidOperation;
        }
        return a/b;
    }

    double log10(double a) throws InvalidOperationException {
        if (a <= 0) {
            InvalidOperationException invalidOperation = new InvalidOperationException("O logaritmando deve ser maior que 0");
            throw invalidOperation;
        }
        return Math.log(a) / Math.log(10);
    }
}
