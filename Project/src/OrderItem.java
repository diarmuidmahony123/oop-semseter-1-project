public class OrderItem {
    private Groceries groceries;
    private int quantity;
    private static int prodCount = 1;

    public OrderItem(Groceries groceries, int quantity){
        this.groceries = groceries;
        this.quantity = quantity;
    }

    public OrderItem() {

    }

    public double getUnitPrice(){
        return groceries.getPrice();
    }

    public double getSubTotalPrice(){
        return getUnitPrice() * quantity;
    }

    public String displayOrder(){
        return String.format("%-10d %-20s %9.2f %13d %19.2f",prodCount++, groceries.getName(),
                getUnitPrice(),quantity,getSubTotalPrice());
    }
}
