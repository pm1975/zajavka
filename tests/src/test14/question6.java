package test14;

import java.util.ArrayList;
import java.util.List;

public class question6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer x : list) {
            System.out.println(x);
            return;
        }
    }
}
