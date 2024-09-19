abstract class A {                               //cannot create object
    public abstract void m1();

    }
    class B extends A{                           //can create object in class B and access
       public void m1(){
        System.out.println("Class B");
        } 
    }
        class Test{
        public static void main(String[] args) {
            B b=new B();
            b.m1();
        }
    }

    

