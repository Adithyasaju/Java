class Test{                  //For each
    public static void main(String[] args){
        int[] eids={101,102,103,104};
        String[] enames={"Ram","Sonia","Matt"};

        for(int eid : eids){
            System.out.println(eid);
        }

        for(String ename : enames){
            System.out.println(ename);
        }


    }
}