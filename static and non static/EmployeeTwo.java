class EmployeeTwo{
    int eid=101;
    public void m1(){
        System.out.println("Employee class-m1()");
    }
    public static void main(String[] args){        
        Employee e1=new Employee();     //to access non-static members using object
        System.out.println(e1.eid);
        e1.m1();
    }
}