 //print from 1-10 using for,while,dowhile
 class One {                                        //when i=10 and i<=0; there will bw no output
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
    
}

class One1{                                             //when i=10 and i<=0; there will bw no output


    
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

    }
}

class Test{                                              //when i=10 and i<=0; output will be 10
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}