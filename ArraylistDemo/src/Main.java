import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(5);
        numbers.add(10);
        numbers.add("Ayxan");
        numbers.remove(0);
        log(numbers.get(0));
    }
    private static void log(Object message) {
        System.out.println(message);
    }
}
