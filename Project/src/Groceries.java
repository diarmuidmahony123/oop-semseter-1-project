public class Groceries extends OrderItem{
    private String name;
    private double price;

    public Groceries(){
        this("",0);
    }

    public Groceries(String prodName, int prodPrice) {
        super();
        name = prodName;
        price = prodPrice;
    }
    public  String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String displayMenu(){
        return String.format("%-25s %-11.2f ", name,price);
    }
}



