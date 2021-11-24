package test;

public class question9 {
    public void startDriving() {
        System.out.println("one");
        try {
            stopDiving();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("two");
        } finally {
            System.out.println("three");
        }
        System.out.println("four");
    }

    public void stopDiving() {
        System.out.println("five");
        throw new RuntimeException("Throwing exception");
//        System.out.println("six");
    }

    public static void main(String[] args) {
        new question9().startDriving();
    }
}
