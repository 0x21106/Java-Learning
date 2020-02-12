public class Main {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: " + grade + " ile geçtin");
                break;
            case 'B':
                System.out.println("Çok iyi: " + grade + " ile geçtin");
                break;
            case 'C':
                System.out.println("İyi: " + grade + " ile geçtin");
                break;
            case 'D':
                System.out.println("Fena değil: " + grade + " ile geçtin");
                break;
            case 'F':
                System.out.println("Naptin ya: " + grade + " ile kaldın");
                break;
            default:
                System.out.println("Geçersiz not girdin.");
        }
    }
}
