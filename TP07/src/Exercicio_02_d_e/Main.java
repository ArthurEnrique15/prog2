package Exercicio_02_d_e;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Funcionario> map = new HashMap<>();

        map.put("a1234", new Funcionario("Steve Jobs", "Gerente", 50000));
        map.put("a1235", new Funcionario("Scott McNealy", "Funcionário", 2000));
        map.put("a1236", new Funcionario("Jeff Bezos", "CTO", 70000));
        map.put("a1237", new Funcionario("Larry Ellison", "CFO", 80000));
        map.put("a1238", new Funcionario("Bill Gates", "CEO", 100000));

        System.out.println(map.get("a1234"));
        System.out.println(map.get("a1236"));
        System.out.println(map.get("a1239"));

        System.out.println("\nFuncionários cadastrados\n");

        Set<String> keys = map.keySet();
        for (String key : keys)
            System.out.println("Key: " + key + "\n" +
                               "Funcionario:\n" + map.get(key));

    }
}
