 class one {
    public static void main(String[] args) {
        int [] prd_price={99,199,299,399,499,599};
        for(int i=0;i<=prd_price.length-1;i++){
            if(prd_price[i]==399){
                break;                     //stops the execution and comes out of loop
            }
            System.out.println(prd_price[i]);
        }
    }
    
}
