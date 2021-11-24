package test14;

import java.util.HashMap;
import java.util.Map;

public class question15 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 1);
        map.put(1, "a");
        System.out.println(map.containsKey("1"));
    }
}
