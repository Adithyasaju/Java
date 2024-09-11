class Test{
    public static void main(String[] args){
        int a[][]=new int[2][2];
        a[0][0]=5;
        a[0][1]=5;
        a[1][0]=5;
        a[1][1]=5;
        int b=0;
      for(int[] a1:a){
        for(int a2:a1){
            b=a2+b;
        }
      }
      System.out.println(b);

    }
}