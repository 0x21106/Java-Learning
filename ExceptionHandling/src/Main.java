public class Main {

    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{1, 3, 6};
            System.out.println(numbers[3]);
        }
        catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            System.out.println("Hata algilandi: " + e);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
