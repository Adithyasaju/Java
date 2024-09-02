class One{
    int a=100;         //Instance or object level variable
    static b=200;      //Static or class level variable
    public static void main(String[] args){
        int c=300;     //local variable
        One.t1=new One();           //object created to access instance variable
        System.out.println(t1.a);
        System.out.println(b);      //accessed directly
        System.out.println(t1.b);   //accessed with object
        System.out.println(One.b);  //accessed by class name
    }
}