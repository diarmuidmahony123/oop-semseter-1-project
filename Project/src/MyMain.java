import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MyMain {


    // This is a class that is tesing the class product so that i have it were i am asking the user for there input so that i can add it to an array
    // List and they will print them in an array way but for some reason i was not able to get it were it will add to the array
    // I also have it where it is getting static data so that i can test my program.
    public static void testProduct() {
        Scanner si = new Scanner(System.in);

        List<Double> Cost = new ArrayList<>();
        List<String> Name = new ArrayList<>();

        System.out.println("Enter the name of the account user");
        Name.add(si.nextLine());
        System.out.println("Enter the amount you want to deposit in your account");
        Cost.add(si.nextDouble());
        si.nextLine();
        System.out.println(Cost);
        System.out.println(Name);

        Product p1 = new Product(22, "CARRORT", 22, 1);
        int id = p1.getId();
        System.out.println(id);

        String name = p1.getName();
        System.out.println(name);

        double cost = p1.getCost();
        System.out.println(cost);

        int quanity = p1.getQuanity();
        System.out.println(quanity);

        p1.setName("Pumkin");
        p1.setCost(22);
        p1.setQuanity(33);
        p1.setInStock("False");

        System.out.println(id);
        System.out.println(name);
        System.out.println(cost);
        System.out.println(quanity);
    }
// The testperson is testing the class person were it is getting the information from the user but i set it were it is static data too
    // to test if this class is working.
    public static void testperson() {
        System.out.println("This will test the fuction of the person class");
        person v2 = new person("Jeff", "bobm@mycit.ie", 123455, "jeff123", 11);

        String s = v2.getEmail();
        System.out.println(s);

        String n = v2.getName();
        System.out.print(n);

        int dob = v2.getDateofBirth();
        System.out.println(dob);

        String pass = v2.getPassword();
        System.out.println(pass);


        v2.setName("bob");
        v2.setEmail("bob@mycit.ie");
        v2.setDateofBirth(123445);
        v2.setPassword("jeff12233");

        System.out.println(s);
        System.out.println(n);
        System.out.println(dob);
        System.out.println(pass);

    }


    // @program testbuying will get the cost of the class called bying and it will get the informaing and keep all the data as
    // static data as i will be testing if this class is working
    public static void testbuying() {
        System.out.println("This is to test the buying class");
        buying b2 = new buying(2.22, 14, 50.0);

        double c = b2.getCostOfitem();
        System.out.println(c);

        int q = b2.getQuaity();
        System.out.println(q);

        double t = b2.getTotalcost();
        System.out.println(t);

        b2.setQuaity(17);
        b2.setTotalcost(24.00);
        b2.setCostOfitem(6.00);

        System.out.println(c);
        System.out.println(q);
        System.out.println(t);

        System.out.println("write numbers, if you write zero, program ends");
        System.out.println("Totamto €20");
        System.out.println("orange €1");
        System.out.println("apple €5");
        System.out.println("onion €10");
        String id = "one";
        System.out.println("pumkin €32" + id);

        // What i am doing is geting the users input and then i will be adding it to a value called number and also im setting the sum to a value of 0
        // then what i'm doing is geting the input from the user and then adding it to the sum and once the user enters a vaule of 0 it will end the program.
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            number = input.nextInt(); //this reads number from input and store its value in variable number
            sum += number; //here you add number to the total sum
            System.out.println(number);
        } while (number != 0);
        System.out.println("The total cost is for the items is" + sum);//just repeat cycle as long as number is not zero

    }


    public static void testid() {
        System.out.println("This will test the id class");
        int id = 0;
        id i = new id(id);

        int e = i.getId();
        System.out.println(e);


    }
// This is were i am adding a new user to an array list
    public static void testAddUser() {
        String user;
        Scanner input = new Scanner(System.in);
        System.out.println("Add user");
        user = input.nextLine();
        System.out.println("You where added \t" + user);


    }
    public static void testGroceries(){
        System.out.println("This is testing the groceries class\n");
        Groceries G1 = new Groceries("carrot",25);
        String t1 = G1.getName();
        System.out.println(t1);

        double c1 = G1.getPrice();
        System.out.println(c1);


    }
    public static void testCustomer(){
        System.out.println("This will test the customer and see if the inherentnce works");
        Customer C4 = new Customer("diarmauid","diarmuid@mycit.ie",2323,"password", 22, false);

        String name = C4.getName();
        System.out.println(name);
        String Email = C4.getEmail();
        System.out.println(Email);
        int DOB = C4.getDateofBirth();
        System.out.println(DOB);
        String password = C4.getPassword();
        System.out.println(password);
        int id = C4.getId();
        System.out.println(id);
        boolean IsAcustomer = C4.getACustomer();
        System.out.println(IsAcustomer);

        C4.setEmail("bob@mycit.ie");
        C4.setDateofBirth(23/24/45);
        C4.setName("Jeff");
        C4.setPassword("34354657");

        System.out.println(name);
        System.out.println(DOB);
        System.out.println(password);
        System.out.println(IsAcustomer);
        System.out.println(id);
        System.out.println(Email);
    }

    




    public static void main(String[] args) {

        // 1. We parse any input arguments
        int option = 6;
        switch (option) {
            case 1 -> {
                testProduct();
            }
            case 2 -> {

                testperson();
            }
            case 3 -> {
                testbuying();

            }
            case 4 -> {
                testid();
            }
            case 5 -> {
                testAddUser();
            }
            case 6 -> {
                testGroceries();
            }
            case 7 -> {
                testCustomer();
            }
        }

    }
}

