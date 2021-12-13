import javax.sql.rowset.spi.SyncResolver;
import java.lang.Thread;

/*public class Delay250ms {
    public static void main(String[] args) {
        System.out.println("2");
        Thread.sleep(250);
        System.out.println("3");
    }
}*/


public class Delay250ms {
  
    /*public static void main(String[] args) throws InterruptedException {
            
      for (int i = 0;i < 3 ;i++) {
        //System.out.println("5");
        Thread.sleep(300); // 暫停3秒
      }
      
    }*/
    
    public static void delay25(int times) throws InstantiationException{
        
        
        for (int i = 0;i < times ;i++) {
            System.out.println("5");
            Thread.sleep(300); // 暫停3秒
          }
    }
    }


  