package Exercicio_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Before Singleton");
        for (int i = 0; i < 10; i++) {
            Incremental incremental = new Incremental();
            System.out.println(incremental);
        }

        System.out.println("\nAfter Singleton");
        for (int i = 0; i < 10; i++) {
            IncrementalSingleton incrementalSingleton = IncrementalSingleton.getInstance();
            System.out.println(incrementalSingleton);
        }
    }
}
