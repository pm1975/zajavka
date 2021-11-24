package test14;

import java.util.ArrayList;
import java.util.List;

public class question3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
//        list.add(3);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
