package Exercicio_02;

public class IncrementalSingleton {
    private static IncrementalSingleton instance = null;

    private static int count = 0;
    private int numero;
    
    public IncrementalSingleton() {}

    public static IncrementalSingleton getInstance() {
        if (instance == null) instance = new IncrementalSingleton();
        instance.increment();
        return instance;
    }

    public void increment() {
        this.numero = ++count;
    }

    public String toString() {
        return "Incremental " + this.numero;
    }
}
