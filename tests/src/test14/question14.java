package test14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class question14 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i, ++i);
        }
        System.out.print(map.get(3));
        System.out.print(map.get(4));

        System.out.println();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
        }
    }
}

