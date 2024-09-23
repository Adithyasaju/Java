 class Test {
    Test(){                                                //Constructor 
        System.out.println("Test class-Constructor");
    }
    public void m1(){}                               //normal method
    public void m2(){}                               //normal method
    public static void main(String[] args) {
        new Test();
    }
    
}

//parametrized constructor
class TestOne {
    TestOne(int a,int b){                                                //Constructor 
        System.out.println("Test class-Constructor");
    }
    public void m1(){}                               //normal method
    public void m2(){}                               //normal method
    public static void main(String[] args) {
        new TestOne(100,200);
    }
    
} 
