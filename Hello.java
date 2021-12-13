public class Hello {
    public static void main(String[] args) {
         
        
        for(int i = 0 ; i < 4 ; i++){
            System.out.println();
                for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
                }
        }
        System.out.println();
        System.out.println("下一提");

        for(int i = 0 ; i < 4 ; i++){
            System.out.println();
                for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
                }
            }
        for(int i = 0 ; i < 4 ; i++){
            System.out.println();
                for(int j = 0 ; j <= 3 - i ; j++){
                System.out.print("*");
                }
        System.out.println();
        }
        String[] str = new String[]{"   *   ","  * *  "," * * * ","* * * *"," * * * ","  * *  ","   *   "};
        for(int i = 0 ; i < str.length ; i++){
            System.out.println(str[i]);
        }
    }
}

public class Test {

    // OOP => 物件導向語言 主要用"物件"為主
    // *** 繼承(extends) 封裝 多型
    // 封裝(Encapsulation)是指類別可以控制其成員被其他類別存取的範圍
    // 多型 Polymorphism 一詞是指生物學中一個生物或物種可以有不同的形式或階段。
    // 在物件導向程式設計的概念中，利用父類別提供的方法呼叫，子類別可以有自己特有的行為。

    // class => 設計圖
    // instance => 用設計圖 做出來的產品

    public static void main(String[] args) {
        System.out.print("choose your character:");
        Scanner scanner = new Scanner(System.in);
        int characterNo = scanner.nextInt();

        Character character = null;
        if(characterNo == 1) {
            character = new Tai();
        } else if(characterNo == 2) {
            character = new Lynn();
        }
        System.out.println("you chose is:" + character.getName());

    }

}

// 腳色 基本動作 ...

interface Action {
    void attack(int oppLife);
}






