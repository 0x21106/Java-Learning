public class Main {

    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int enbuyuk = 0;
        if(sayi3 > sayi2 && sayi3 > sayi1) {
            enbuyuk = sayi3;
        }
        else if(sayi2 > sayi1 && sayi2 > sayi3) {
            enbuyuk = sayi2;
        }
        else if(sayi1 > sayi2 && sayi1 > sayi3) {
            enbuyuk = sayi1;
        }
        System.out.println(enbuyuk);
    }
}
