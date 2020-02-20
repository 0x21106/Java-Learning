import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer taksim_dayi = new Customer(12, "Taksim", "Dayi");

        customers.add(new Customer(1, "Ayxan", "Abdullayev"));
        customers.add(new Customer(2, "Faiq", "Nebiagayev"));
        customers.add(new Customer(3, "Agadadas", "Qardas"));
        customers.add(taksim_dayi);

        for(Customer customer : customers) {
            System.out.println(customer.firstName);
        }

        System.out.println("-------------");

        customers.remove(taksim_dayi);
        customers.remove(new Customer(1, "Ayxan", "Abdullayev"));

        for(Customer customer : customers) {
            System.out.println(customer.firstName);
        }

    }
}
