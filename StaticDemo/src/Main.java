public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product(1, "Acer Nitro 5", 1480);
        manager.add(product);
    }
}
