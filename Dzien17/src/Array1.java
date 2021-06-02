

public class Array1 {
    public static void main(String[] args) {
//        int[] array1; //more proferable
//        int array2[]; // also prossible but not perferable

        int[] array1 = new int[10];
        int[] array2 = new int[]{1, 2, 13, 24};
        int[] array3 = {1, 2, 3, 4};

        // elements accessed through the index, indices are 0 based -> lastIndex = size - 1
        System.out.println(array3);
        System.out.println(java.util.Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
