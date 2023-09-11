import java.util.ArrayList;

public class person extends id {

    protected String name;
    protected String Email;
    protected int dateofBirth;
    protected String password;

    protected final ArrayList<buying> ItemsBuyed;


    public person(String name, String Email, int dateofBirth, String password, int id) {
        super(id);

        this.name = name;
        this.Email = Email;
        this.dateofBirth = dateofBirth;
        this.password = password;
        this.ItemsBuyed = new ArrayList<buying>();


    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.Email;
    }

    public int getDateofBirth() {
        return this.dateofBirth;
    }

    public String getPassword() {
        return this.password;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDateofBirth(int dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<buying> getItemsBuyed() {
        return this.ItemsBuyed;
    }

    public String toString() {
        String res;
        res = "" + this.getId() + "\t" + this.name + "\t";

        int size = this.ItemsBuyed.size();
        res = res + size + "\n";
        for (buying ItemsBuyed : this.ItemsBuyed) {
            res = res + ItemsBuyed.toString();
        }
        return res;
    }

//    public static int isIteminList(int id) {
//        int res = -1;

//       id baseline = new id(id);
//
//       int size = myList.size();
//       int index = 0;
//
//       while ((res == -1)&&(index < size)){
//           if(baseline.equals(myList.get(index)))
//               res = index;
//           else
//               index++;
//
//       }
//       return res;
//}

    }


