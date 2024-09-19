interface A{
    void m1();                                //by default it is public and abstract
}

interface B{
    void m2();
}

class Test implements A,B{
    public void m1(){
        System.out.println("m1 interface");
    }
    public void m2(){
        System.out.println("m2 interface");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.m1();
        t.m2();
    }
}