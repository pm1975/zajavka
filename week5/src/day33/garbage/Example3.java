package day33.garbage;

public class Example3 {
    public static void main(String[] args) {
        String a = "methodChaning";
        String newA = a
                .replace("th", "ht")
                .replace("Ch", "CY")
                .replace("me", "ng");
        System.out.println(a);
        System.out.println(newA);

        Cat3 cat3 = new Cat3()
                .setName("Robert")
                .setColor("Red")
                .setAga("16")
                .setHoursOfSleeping("76");
        System.out.println(cat3);
    }
}
