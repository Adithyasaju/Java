 class parent {
   public final void m1(){
        System.out.println("Parent class m1 method");
    }
    class child extends parent{
        public void m1(){                                  //overriding is not possible
            System.out.println("Child class m1 method");
        }
    }
}
