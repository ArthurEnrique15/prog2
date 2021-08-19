package Exercicio_01;

public class PresidentSingleton {
    private static PresidentSingleton instance = null;

    private String name;

    private PresidentSingleton() {}

    public static PresidentSingleton getInstance() {
        if (instance == null) instance = new PresidentSingleton();
        return instance;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}