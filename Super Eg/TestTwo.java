class Employee{
    String name;

    Employee(String name){
        this.name=name;
    }
}
class Manager extends Employee{
    String department;

    Manager(String name,String department){
        super(name);
        this.department=department;
    }
}
 class TestTwo{
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.name();
        m1.department();

    }
}
