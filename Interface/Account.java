interface Account{
    public int get_Bal();               //whether declared or not interface methods are public and abstract by default
    public void close_Acc();
}
class SA implements Account{
    public int get_Bal(){
        return 100;
    }
    public void close_Acc(){
        System.out.println("Account Closed Successfully");
    }
    public static void main(String[] args) {
        SA obj =new SA();
        int bal=obj.get_Bal();
        System.out.println(bal);
        obj.close_Acc();
    }
}
