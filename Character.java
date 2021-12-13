public class Character {
    private String name;
    private int atk;
    private int def;
    private int lift;
    private int cri;
    private int flee;

    public String getName(){
        return name;
    }

    public int getAtk(){
        return atk;
    }

    public int getDef(){
        return def;
    }

    public int getLift(){
        return lift;
    }

    public int getCri(){
        return cri;
    }

    public int grtFlee(){
        return flee;
    }

    
}

class Ch1 extends Character {
    
    public String getName() {
        return "哈奇老大";
    }
     
    public int getAtk() {
        return 19;
    }
    
    public int getDef() {
        return 10;
    }

    public int getLift(){
        return 151;
    }

    public int getCri(){
        return 5;
    }

    public int grtFlee(){
        return 20;
    }

    
}

class Ch2 extends Character {
    
    public String getName() {
        return "安";
    }
     
    public int getAtk() {
        return 22;
    }
    
    public int getDef() {
        return 6;
    }

    public int getLift(){
        return 160;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }

    
}

class Ch3 extends Character {
    
    public String getName() {
        return "神手";
    }
     
    public int getAtk() {
        return 25;
    }
    
    public int getDef() {
        return 4;
    }

    public int getLift(){
        return 155;
    }

    public int getCri(){
        return 20;
    }

    public int grtFlee(){
        return 5;
    }

    
}

class Ch4 extends Character {
    
    public String getName() {
        return "你麻吉";
    }
     
    public int getAtk() {
        return 14;
    }
    
    public int getDef() {
        return 17;
    }

    public int getLift(){
        return 115;
    }

    public int getCri(){
        return 10;
    }

    public int grtFlee(){
        return 10;
    }

    

}