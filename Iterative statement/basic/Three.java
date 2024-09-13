//print array value using for loop
class Three {
    public static void main(String[] args) {
        int[] eids={101,102,103,104,105,106,107,108,109,110};
        for(int i=0;i<=9;i=i+1){
            System.out.println(eids[i]);
        }
    }
    
}

//print array value using for each
class Test{
    public static void main(String[] args) {
        int[] eids={101,102,103,104,105,106,107,108,109,110};
        for(int eid: eids){
            System.out.println(eid);
        }
    }
} 


