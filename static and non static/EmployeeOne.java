class EmployeeOne{
   /* int eid=10;                to resolve error make variable as static
    public void m1(){            to resolve error make method  as static
        System.out.println("Employee class-m1 method");
    }
    public static void main(String[] args){
        m1();
        System.out.println(eid);
    } */
            //to access static members
    static int eid=10;
    public static void m1(){
        System.out.println("Employee class-m1 method");
    }
    public static void main(String[] args){
        m1();
        System.out.println(eid);
    }
}