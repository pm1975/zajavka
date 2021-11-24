package test14;

import java.util.ArrayList;
import java.util.List;

public class question9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt("1"));
        list.add(2);
        list.add(null);
        list.add(Integer.parseInt("3"));
        list.add(Integer.parseInt("4"));
        list.add(5);
        for (Integer element : list) {
            System.out.print(element);
        }
    }
}
