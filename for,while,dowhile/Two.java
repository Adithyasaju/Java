//iterating array
class Two {                        //for each
    public static void main(String[] args) {
        int eids[] ={101,102,103,104,105,106,107};
        for(int eid : eids){
            System.out.println(eid);
        }
    }
    
}

class Two1{                    //for
    public static void main(String[] args) {
        int eids[] ={101,102,103,104,105,106,107,108,109,110};
        for(int i=0;i<=eids.length-1;i++){              //use length property instead of hardcoding it
            System.out.println(eids[i]);
        }
    }
}

class Two2{                     //while
    public static void main(String[] args) {
        int eids[] ={101,102,103,104,105,106,107};
        int i=0;
        while(i<=6){
            System.out.println(eids[i]);
            i++;
        }
    }
}

class Two3{                  //dowhile
    public static void main(String[] args) {
        int eids[] ={101,102,103,104,105,106,107};
        int i=0;
        do{
            System.out.println(eids[i]);
            i++;
        }
        while(i<=6);
    }
}