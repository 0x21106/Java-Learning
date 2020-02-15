public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,9};
        int search = 5;
        for(int number : numbers) {
            if(number == search) {
                System.out.println(search + " Sayisi dizi icinde bulunuyor.");
                break;
            } else {
                System.out.println(search + " Sayisi dizi icinde bulunmuyor.");
                break;
            }
        }
    }
}
