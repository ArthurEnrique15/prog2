package Exercicio_09;

public class Main {
    public static void main(String[] args) {
        try {
            someMethod1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    static void someMethod1() throws ArrayIndexOutOfBoundsException {
        someMethod2();
    }

    static void someMethod2() throws ArrayIndexOutOfBoundsException {
        int vetor[] = new int[3];
        vetor[4] = 5;
    }
}
