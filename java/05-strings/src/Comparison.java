public class Comparison {
    private static String shubh;

    public static void main(String[] args) {
        String a = "shubh";
        String b = "shubh";
        String c = a;
//        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("shubh");
        String name2 = new String("shubh");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));
    }
}
