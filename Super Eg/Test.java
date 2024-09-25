 class Account {
    String acc_Name;
    String acc_Email;
    Account(String name,String email){
        this.acc_Name=name;
        this.acc_Email=email;


    }
}
class SA extends Account {
    int acc_Id;
    double acc_Bal;
    static double min_bal=500;
    SA(int id,String name,double bal,String email){
        super(name,email);                                           //super-->Invoking parent class constructor
        this.acc_Id=id;
        this.acc_Bal=bal;
    }

}
public class Test{
    public static void main(String[] args) {
        new SA(101,"Rahul",5000,"rg@gmail.com");
    }
}