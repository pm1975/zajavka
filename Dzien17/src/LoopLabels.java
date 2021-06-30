/**
 * @author piotr
 */
public class LoopLabels {
    public static void main(String[] args) {
        first_loop_label:
        for (int i = 0; i < 10; i++) {
            second_loop_label:
            for (int j = 0; j < 10; j++) {
                third_loop_label:
                for (int k = 0; k < 10; k++) {
                    if (j == 3) {
                        System.out.println("continue second_loop_label");
                        continue second_loop_label;
                    }
                    if (i == 1) {
                        System.out.println("break first_loop_label");
                        break first_loop_label;
                    }
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
                System.out.println("i = " + i + ", j = " + j);
            }
            System.out.println("i = " + i);
        }
    }
}
