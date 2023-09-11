import java.util.Scanner;
public class Customer extends person {
    protected boolean ACustomer;

    public Customer(String name, String Email, int dateofBirth, String password, int id,boolean Acustomer) {
        super(name, Email, dateofBirth, password, id);

        this.ACustomer = false;
    }
    public boolean getACustomer(){
        this.ACustomer = false;
        return ACustomer;
    }



}
