public class ProductManager {
    public void add(Product product) {
        if(ProductValidator.isValid(product)) {
            System.out.println("Eklendi.");
            ProductValidator productValidator = new ProductValidator();
        }
        else {
            System.out.println("Eklenemedi.");
        }
    }
}
