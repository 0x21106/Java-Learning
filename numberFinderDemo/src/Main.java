public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,9};
        int search = 5;
        for(int number : numbers) {
            if(number == search) {
                log(search + " Sayisi dizi icinde bulunuyor.");
                break;
            } else {
                log(search + " Sayisi dizi icinde bulunmuyor.");
                break;
            }
        }
    }
    public static void log(String message) {
        System.out.println(message);
    }
}
