import jp.ac.uryukyu.ie.e175749.PokeGatya;

import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        String input;
        Scanner in=new Scanner(System.in);
        System.out.println("ポケモンガチャをしよう！");
        System.out.println("単発と10連と伝説どっちにする？");
        input=in.nextLine();
        PokeGatya gatya=new PokeGatya();
        if (input.equals("単発")) {
            gatya.rareGatya();
        } else if (input.equals("10連")) {
            for (int i = 0; i < 9; i++) {
                gatya.rareGatya();
            }
            gatya.lastGatya();
        } else if (input.equals("伝説")) {
            gatya.superGatya();
        }else{
            System.out.println("3つの中から選びんさい！");
        }
        System.out.println("また遊んでくれよな！");
    }
}
