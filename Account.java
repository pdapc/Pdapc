public class Account {
    private int money = 10000;

    public int getMoney(){
        System.out.println("getMoney");
        return money;
    }

    public void setMoney(int money){
        this.money = money ;
        System.out.println("setMoney");

    }
   
}

