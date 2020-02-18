public class Product {

    public Product(int id, String name, String description, double price, int stockAmount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.modelNumber = name.substring(0, 1) + id;
    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String modelNumber;


//    Getter
    public String getName() {
        return name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStockAmount() {
        return this.stockAmount;
    }

    public String getModelNumber() {
        return this.modelNumber;
    }



}
