class five{
    //Reference Datatype
    public static void main(String[] args){
        int sizes[]={25,16,20,37};
        String[] enames={"Ram","Sona"};
        System.out.println(sizes);
        System.out.println(enames);

        for(int size : sizes){
            System.out.println(size);
        }
        for(String ename:enames){
            System.out.println(ename);
        }
    }
}