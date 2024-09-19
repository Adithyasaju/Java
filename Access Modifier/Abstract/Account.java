abstract class Account{
    public void open_Acc(){
        System.out.println("Account Opened");
    }
    public abstract int get_Bal();

}
class SA extends Account{
    public int get_Bal(){
        return 100;
    }
   
    public static void main(String [] args){
        SA obj =new SA();
        obj.open_Acc();
        int bal=obj.get_Bal();
        System.out.println(bal);
    }
} 