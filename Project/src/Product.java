import java.util.ArrayList;
// @program this class will get the name of the product the cost and also the quanity and also if it is in the in stock too.
public class Product extends id {

    /// fields////
    protected String Productname;
    protected double cost;
    protected int quanity;
    protected String inStock;

    // Constrotor///
    public Product(int id,String name, int cost, int quanity) {
        super(id);
        this.Productname = name;
        this.cost = cost;
        this.quanity = quanity;
    }

    // Get Methods ///
    public String getName() {
        return this.Productname;
    }

    public double getCost() {
        return this.cost;
    }

    public int getQuanity() {
        return this.quanity;
    }

    public String getinStock() {
        return this.inStock;
    }

    //Set methonds//
    public void setName(String name) {
        this.Productname = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public int ProductId() {
        return 0;
    }

    public int Cost() {
        return 0;
    }


}



