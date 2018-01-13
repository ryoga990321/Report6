package jp.ac.uryukyu.ie.e175749;

public class PokeGatya {
    int val,number;
    String[] ssr = {"フリーザー", "ファイアー", "サンダー", "ミュウツー", "ミュウ", "エンテイ", "ライコウ", "スイクン", "ホウオウ", "ルギア", "セレビィ", "レジロック", "レジアイス", "レジスチル", "グラードン", "カイオーガ", "レックウザ", "ラティアス", "ラティアス", "デオキシス", "ジラーチ",};
    String[] sr = {"リザードン", "フシギバナ", "カメックス", "カイリキー", "フーディン", "ゴローニャ", "ニドクイン", "ニドキング", "ニョロボン", "ゲンガー", "カイリュー", "ピジョット", "バタフリー", "スピアー", "ラフレシア", "ウツボット", "ワタッコ", "プクリン", "デンリュウ", "メガニウム", "バクフーン", "バシャーモ", "アゲハント", "ドクケイル", "ライチュウ", "ダーテング", "ケッキング", "ジュカイン", "ハスブレロ", "マリルリ", "オーダイル", "ラグラージ", "トドゼルガ", "キングドラ", "クロバット", "バクオング", "ピクシー", "ボスゴドラ", "バンギラス", "サーナイト", "フライゴン", "ボーマンダ", "メタグロス", "ニョロトノ", "キレイハナ"};
    String[] r = {"リザード", "フシギソウ", "カメール", "ゴーリキー", "ユンゲラー", "ゴローン", "ニドリーナ", "ニドリーノ", "ニョロゾ", "ゴースト", "ハクリュー", "ピジョン", "トランセル", "コクーン", "クサイハナ", "ウツドン", "ポポッコ", "プリン", "モココ", "ベイリーフ", "マグマラシ", "ワカシャモ", "カラサリス", "マユルド", "ピカチュウ", "コノハナ", "ヤルキモノ", "ジュプトル", "ハスブレロ", "マリル", "アリゲイツ", "ヌマクロー", "トドグラー", "シードラ", "ゴルバット", "ドゴーム", "ピッピ", "コドラ", "サナギラス", "キルリア", "ビブラーバ", "コモルー", "メタング"};
    String[] n = {"ヒトカゲ", "フシギダネ", "ゼニガメ", "ワンリキー", "ケーシィ", "イシツブテ", "ニドラン♀", "ニドラン♂", "ニョロモ", "ゴース", "ミニリュウ", "ポッポ", "キャタピー", "ビードル", "ナゾノクサ", "マダツボミ", "ハネッコ", "ププリン", "メリープ", "チコリータ", "ヒノアラシ", "アチャモ", "ケムッソ", "ピチュー", "タネボー", "ナマケロ", "キモリ", "ハスボー", "ルリリ", "ワニノコ", "ミズゴロウ", "タマザラシ", "タッツー", "ズバット", "ゴニョニョ", "ピィ", "ココドラ", "ヨーギラス", "ラルトス", "ナックラー", "タツベイ", "ダンバル"};
    String name1="ssr";
    String name2="sr";
    String name3="r";
    String name4="n";
    String monster;

    public void rareGatya() {
        sulot();
        if (val >= 1 && val <= 5) {
            poket(ssr);
            celect(name1);
        } else if (val >= 6 && val <= 20) {
            poket(sr);
            celect(name2);
        } else if (val >= 21 && val <= 60) {
            poket(r);
            celect(name3);
        } else if (val >= 61 && val <= 100) {
            poket(n);
            celect(name4);
        }
    }

    public void lastGatya() {
        sulot();
        if (val >= 1 && val <= 25) {
            poket(ssr);
            celect(name1);
        } else if (val >= 26 && val <= 100) {
            poket(sr);
            celect(name2);
        }
    }

    public void superGatya() {
        sulot();
        if (val >= 1 && val <= 10) {
            poket(ssr);
            celect(name1);
        } else if (val >= 11 && val <= 30) {
            poket(sr);
            celect(name2);
        } else if (val >= 31 && val <= 65) {
            poket(r);
            celect(name3);
        } else if (val >= 65 && val <= 100) {
            poket(n);
            celect(name4);
        }
    }

    public void celect(String name){
        System.out.println(name+":"+monster);
        if (name==name1){
            System.out.println("いやっほーい！伝説だべ！！");
        }else if(name==name2){
            System.out.println("まあ、あたりっちゃあたりだべ");
        }else if(name==name3){
            System.out.println("ハズレだっぺな");
        }else if(name==name4){
            System.out.println("クソが！");
        }
    }

    public void poket(String[] rare){
        if(rare==ssr){
            number=(int) (Math.random() * 21);
        }else if(rare==sr){
            number=(int) (Math.random() * 45);
        }else if(rare==r){
            number=(int) (Math.random() * 43);
        }else if(rare==n){
            number=(int) (Math.random() * 42);
        }
        monster=rare[number];
    }

    public void sulot(){
        val = (int) (Math.random() * 100) + 1;
    }

    public void choice(int number,String[] rare){
        this.number=number;
        monster=rare[number];
    }

}

