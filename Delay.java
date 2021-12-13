/*public class Delay{
    public static void delayDot25(int times){
        times = 5 ;
        try{
        for(int i = 0 ; i < times ; i++){
        Thread.sleep(250);
        System.out.println("2");
        }
    }catch(Exception e){
        System.out.println(e);
    }
        }
 }*/








public class Delay {
    public static void main(String[] args) {        
    
    for (int del = 0 ; del < 5 ; del++) {
        try {
            for (int j = 0; j < 1; j++) {
                Thread.sleep(250);
                System.out.print(".");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}

    
}