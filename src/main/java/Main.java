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
        if (input.equals("単発")){
            gatya.pokeGatya();
        }else if(input.equals("10連")) {
            for (int i = 0; i < 9; i++) {
                gatya.pokeGatya();
            }
            gatya.lastGatya();
        }else if(input.equals("伝説")){
            gatya.superGatya();
        }
        System.out.println("また遊んでくれよな！");
    }
}