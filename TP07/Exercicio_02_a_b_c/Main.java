package Exercicio_02_a_b_c;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("a1234", "Steve Jobs");
        map.put("a1235", "Scott McNealy");
        map.put("a1236", "Jeff Bezos");
        map.put("a1237", "Larry Ellison");
        map.put("a1238", "Bill Gates");

        System.out.println(map.get("a1234"));
        System.out.println(map.get("a1236"));
        System.out.println(map.get("a1239"));

        System.out.println(searchMap("A1238", map));
    }

    public static String searchMap(String key, Map map) {
        String name = (String) map.get(key.toLowerCase());

        if (name != null) {
            return name;
        } else {
            name = (String) map.get(key.toUpperCase());
        }

        if (name!= null)
            return name;
        else
            return null;
    }
}
