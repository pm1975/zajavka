package test14;

import java.util.ArrayList;
import java.util.List;

public class question4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(0);
        list.set(0, 3);
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
