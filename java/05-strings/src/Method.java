import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name = "shubh yadav Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     shubh   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
