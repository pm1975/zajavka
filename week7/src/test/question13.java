package test;

public class question13 {
    public static void main(String[] args) {
        String a = null;
        try {
            a.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(1);
        } catch (RuntimeException e) {
            System.out.println(0);
        } finally {
            System.out.println(2);
        }
    }
}
