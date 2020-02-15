public class Main {

    public static void main(String[] args) {
        Process process = new Process();
        log("5 ile 10'un toplami : " + process.sum(5, 10));


    }
    public static void log(String message) {
        System.out.println(message);
    }
}
