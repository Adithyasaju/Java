class p1 extends Object {}               //Every java class parent class is object directly or indirectly
class p2 extends Object{}
class child extends p1,p2{}                //Does not support multiple inhheritance,can be solved using interface

public class TestTwo{  }



interface A1{
    public abstract void m1();
}
interface A2{
    public abstract void m2();
}
class childs implements A1,A2{
    public void m1(){
        System.out.println("Child m1 method");
    }
    public void m2(){
        System.out.println("Child m2 methoc");
    }

}
public class Test{
    public static void main(String[] args) {
        childs c1=new childs();
        c1.m1();
        c1.m2(); 
    }
}