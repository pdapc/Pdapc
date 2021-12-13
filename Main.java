import java.util.jar.Attributes.Name;

public class Main{
    public static void main(String[] argv){
        Animal[] animals = new Animal[]{new Cat("1")};
        
        for(Animal animal : animals)
        {
            System.out.print(animal.getName()+"+");
            animal.talk();
        }
        //System.out.println(animal.getName());
        
    }
    /*Animal animals = new Animal{new Cat} ;
        animals.talk();
    
}*/
}




/*
//以下錢包
public class Main {
    public static void main(String[] args){
    Account account = new Account();
    account.setMoney(account.getMoney()+200);
    System.out.println(account.getMoney());
    
    }
        
 }*/
