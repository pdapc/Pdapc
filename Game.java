import java.util.Scanner;

public class Game{
    public static void main(String[] args) {
        Character[] characters = new Character[]{new Ch1(), new Ch2(), new Ch3(), new Ch4()};
        int calCharacterVol = characters.length;
        System.out.println("角色"+calCharacterVol+"位");

        //腳色顯示能力顯示
        System.out.printf("%-10s","角色名稱");
        for (Character character : characters ){
            //System.out.print("% 8d%n",character.getName());
            String x = character.getName();
            System.out.printf("%-10s", x );
        }
        System.out.println();

        int[][] getCharactersVol = new int[calCharacterVol][5];

        for ( int i = 0; i < calCharacterVol; i++){
                getCharactersVol[i][0] = characters[i].getAtk();
                getCharactersVol[i][1] = characters[i].getDef();
                getCharactersVol[i][2] = characters[i].getLift();
                getCharactersVol[i][3] = characters[i].getCri();
                getCharactersVol[i][4] = characters[i].grtFlee();          
        }

        String[] prfCharacterVolName = {"攻擊", "防禦", "生命", "爆擊率", "迴避率"};
        for ( int i = 0 ; i < 5 ; i++){
        System.out.printf("%-15s",prfCharacterVolName[i]);
        for ( int j = 0 ; j < calCharacterVol ; j++){
            System.out.printf("%-10s",getCharactersVol[j][i]);
        }
        System.out.println();
        }
        /*
        //生命額外寫
        for ( int i = 2 ; i < 3 ; i++){
        System.out.printf("%-14s",prfCharacterVolName[i]);
            for ( int j = 0 ; j < calCharacterVol ; j++){
                System.out.printf("%-10s",getCharactersVol[j][i]);
            }
        System.out.println();
        }*/

        //選角系統

        System.out.println("請選擇角色1~4");
        System.out.println("第一位對戰角色");
        int selCh1 , selCh2 ;
        Scanner scanner1 = new Scanner(System.in);
        selCh1 = scanner1.nextInt();
        System.out.println("第二位對戰角色");
        Scanner scanner2 = new Scanner(System.in);
        selCh2 = scanner2.nextInt();

        System.out.println("對戰開始");

 
 
        //選好角色顯示系統
        Character character1 = characters[selCh1-1];
        System.out.println("姓名"+character1.getName());
        System.out.println("攻擊力"+character1.getAtk());
        System.out.println("防禦力"+character1.getDef());
        System.out.println("生命"+character1.getLift());
        try {
			for (int i = 0; i < 2; i++) {
				Thread.sleep(250);
				System.out.println("");
			}
		}catch(Exception e) {
			System.out.println(e);
		}

        Character character2 = characters[selCh2-1];
        System.out.println("姓名"+character2.getName());
        System.out.println("攻擊力"+character2.getAtk());
        System.out.println("防禦力"+character2.getDef());
        System.out.println("生命"+character2.getLift());
        
        

        int calLife1 = character1.getLift();
        //System.out.println(calLife1);

        int calLife2 = character2.getLift();
        //System.out.println(calLife2);

        
        //戰鬥系統
        for( int i = 1 ; i < 99 ; i++){
            System.out.println("第"+i+"回合攻擊");

            //腳色1攻擊腳色2
            System.out.println(character1.getName()+"攻擊力"+character1.getAtk()+"攻擊"+character2.getName()+"防禦力"+character2.getDef());
            //爆擊計算
            int judCri;
            if (character1.getCri() < (int)(Math.random()*100)){
                judCri = 1 ;
            }
            else{
                //爆擊成立
                judCri = 2 ;
            }

            //計算閃避
            int judFlee;
            if (character2.grtFlee() < (int)(Math.random()*100)){
                judFlee = 1 ;
            }
            else{
                //閃避成立
                judFlee = 0 ;
            }

            //爆擊閃避文字顯示

            if (judFlee == 0){
                System.out.println(character2.getName()+"幸運閃避");
            }
            else{
                if (judCri == 2 ){
                    System.out.println(character1.getName()+"爆擊");
                }
            }

            //傷害計算
            calLife2 = calLife2 - (character1.getAtk() * judCri * judFlee - character2.getDef() *judFlee);
            System.out.println(character2.getName()+"剩餘血量"+calLife2);
            if (calLife2 < 0 ){
                System.out.println(character2.getName()+"已死亡"+character1.getName()+"勝利");
                break;
            }

            
            //腳色2攻擊腳色1
            System.out.println(character2.getName()+"攻擊力"+character2.getAtk()+"攻擊"+character1.getName()+"防禦力"+character1.getDef());
            if (character2.getCri() < (int)(Math.random()*100)){
                judCri = 1 ;
            }
            else{
                //爆擊成立
                judCri = 2 ;
            }

            //計算閃避
            if (character1.grtFlee() < (int)(Math.random()*100)){
                judFlee = 1 ;
            }
            else{
                //閃避成立
                judFlee = 0 ;
            }

            //爆擊閃避文字顯示

            if (judFlee == 0){
                System.out.println(character1.getName()+"幸運閃避");
            }
            else{
                if (judCri == 2 ){
                    System.out.println(character2.getName()+"爆擊");
                }
            }

            calLife1 = calLife1 - (character2.getAtk()  * judCri * judFlee - character1.getDef() *judFlee);
            System.out.println(character1.getName()+"剩餘血量"+calLife1);
            if (calLife1 < 0 ){
                System.out.println(character1.getName()+"已死亡"+character2.getName()+"勝利");
                break;
            }

            
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
            System.out.println("");           
        }
    }
}

