public class ProductValidator {
    static {
        System.out.println("assad");
    }
//    public ProductValidator() {
//        System.out.println("Yapici blok calisti.");
//    }
    public static boolean isValid(Product product) {
        if(product.id > 0 && !product.name.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void bisey() {

    }
}
