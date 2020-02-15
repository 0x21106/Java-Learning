public class Main {

    public static void main(String[] args) {
        int number = 47;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        
        if(total == number) {
            System.out.println(number + " Mukemmel sayidir.");
        } else {
            System.out.println(number + " Mukemmel sayi degildir.");
        }

    }
}
