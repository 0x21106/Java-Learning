public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;


    public void add(int _id, String _name, String _description, double _price, int _stockAmount) {
        id = _id;
        name = _name;
        description = _description;
        price = _price;
        stockAmount = _stockAmount;
        System.out.println(_name + " : " + _id + " id numarası ile kayıt edildi.");
    }



}
