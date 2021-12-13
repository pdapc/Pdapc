public class Study{
    public static void main(String[] args) {
         
        int k = 1 ;
        int l = 5 ;
        for(int i = 1 ; i < 7 ; i++){
                
                for(int j = 1 ; j <= k ; j++){
                    System.out.print("*");
                    l = 11;
                }
                k++;

                           
               for(int j = i ; j + l <= 11 ; j++){
                System.out.print("+");
                k = 0;
                }
                l = 5;
                System.out.println("@");
        }
        
        System.out.println("下一提");
    
    //---------------------------------------------------
    /*    for(int i = 0 ; i < 4 ; i++){
            
            for(int j = 4 ; j - i >0  ; j--){
                System.out.print(" ");
                
            }
            System.out.print("*");
            System.out.println();
        }
            


    for(int i = 4 ; i > 1 ; i--){
        System.out.print("*");
        }
        System.out.println("*");*/



        /*for(int i = 1 ; i < 4 ; i++){
            System.out.print(i);
            for(int j = 4 ; j % i >0  ; j--){
                System.out.print("*");
                
            }
            System.out.print("0");
            System.out.println();
        }*/















    }
}