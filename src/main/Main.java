import java.util.Scanner;
//import jp.ac.uryukyu.ie.e175749.*;

public class Main {

    //String[] dataset={"単発\t","10連"};
    public static void main(String[] args){
        String input;
        Scanner in=new Scanner(System.in);
        System.out.println("ポケモンガチャをしよう！");
        System.out.println("単発と10連どっちにする？");
        input=in.nextLine();
        if (input.equals("単発")){
            pokegatya();
        }else if(input.equals("10連")){
            for(int i=0;i<10;i++){
                pokegatya();
            }
        }
        System.out.println("また遊んでくれよな！");
    }

    public static void pokegatya(){
        int val,number;
        String[] ssr={"フリーザー","ファイアー","サンダー","ミュウツー","ミュウ"};
        String[] sr={"リザードン","フシギバナ","カメックス","カイリキー","フーディン","ゴローニャ","ニドクイン","ニドキング","ニョロボン","ゲンガー","カイリュー","ピジョット","バタフリー","スピアー","ラフレシア","ウツボット"};
        String[] r={"リザード","フシギソウ","カメール","ゴーリキー","ユンゲラー","ゴローン","ニドリーナ","ニドリーノ","ニョロゾ","ゴースト","ハクリュー","ピジョン","トランセル","コクーン","クサイハナ","ウツドン"};
        String[] n={"ヒトカゲ","フシギダネ","ゼニガメ","ワンリキー","ケーシィ","イシツブテ","ニドラン♀","ニドラン♂","ニョロモ","ゴース","ミニリュウ","ポッポ","キャタピー","ビードル","ナゾノクサ","マダツボミ"};
        val=(int)(Math.random()*100)+1;
        if(val>=1&&val<=5){
            number=(int)(Math.random()*5);
            System.out.println("ssr:"+ssr[number]);
            System.out.println("いやっほーい！伝説だべ！！");
        }else if(val>=6&&val<=20) {
            number = (int) (Math.random() * 16);
            System.out.println("sr:" + sr[number]);
            System.out.println("まあ、あたりっちゃあたりだべ");
        }else if(val>=21&&val<=60){
            number = (int) (Math.random() * 16);
            System.out.println("r:"+r[number]);
            System.out.println("ハズレだっぺな");
        }else if(val>=61&&val<=100) {
            number = (int) (Math.random() * 16);
            System.out.println("n:"+n[number]);
            System.out.println("クソが！");
        }
    }
}
