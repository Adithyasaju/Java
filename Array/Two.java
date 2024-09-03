class Test{                  //Array Index Out Of Bound Exception
    public static void main(String[] args){
        int[] eids={101,102,103,104};
        String[] enames={"Ram","Sonia","Matt"};

        System.out.println(eids[0]);
        System.out.println(eids[1]);
        System.out.println(eids[2]);
       // System.out.println(eids[10]);
        System.out.println(enames[0]);
        System.out.println(enames[1]);
        System.out.println(enames[8]);
    }
}