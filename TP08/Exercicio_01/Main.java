package Exercicio_01;

public class Main {
    public static void main(String[] args) {
        PresidentSingleton p1 = PresidentSingleton.getInstance();
        p1.setName("Barack Obama");
        System.out.println("President 1 name: " + p1.getName());

        PresidentSingleton p2 = PresidentSingleton.getInstance();
        System.out.println("President 2 name: " + p2.getName());
    }
}
