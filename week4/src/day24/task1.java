package day24;

/**
 * @author piotr
 */
public class task1 {
    public static void main(String[] args) {
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
