public class Test {
    public static void main(String[] args) {
       // new Bank();
       //new Account("Rahul","rg@gmail.com","Wayanad");
        SA sa1=new SA(101,"Rahul","rg@gmail.com",5000,"Wayanad");
        CA ca1=new CA(102,"Priya", 6000, "priya@gmail.com");
        sa1.setMin_Bal(600);
        sa1.cal_Bal();
        
    }
    
}
