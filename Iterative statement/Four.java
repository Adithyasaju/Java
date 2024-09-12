 //string
class Four {
    public static void main(String[] args) {
        String[] enames={"Rahul","Sonam","Venu"};
        System.out.println(enames.length);
        for(String ename : enames){
            System.out.println(ename);
        }
    }
}

class Four1 {
    public static void main(String[] args) {
        String[] enames={"Rahul","Sonam","Venu"};
        System.out.println(enames.length);
        for(int i=0;i<=2;i++){
            System.out.println(enames[i]);
        }
    }
}

class Test{
    public static void main(String[] args) {
        double[] esalaries={45000.25,40000.25,55000.25};
        for(double esal:esalaries){
            System.out.println(esal);
        }
    }
}
