package jp.ac.uryukyu.ie.e175749;

public class PokeGatya {
    int number, val;
    String[] ssr = {"フリーザー", "ファイアー", "サンダー", "ミュウツー", "ミュウ", "エンテイ", "ライコウ", "スイクン", "ホウオウ", "ルギア", "セレビィ", "レジロック", "レジアイス", "レジスチル", "グラードン", "カイオーガ", "レックウザ", "ラティアス", "ラティアス", "デオキシス", "ジラーチ",};
    String[] sr = {"リザードン", "フシギバナ", "カメックス", "カイリキー", "フーディン", "ゴローニャ", "ニドクイン", "ニドキング", "ニョロボン", "ゲンガー", "カイリュー", "ピジョット", "バタフリー", "スピアー", "ラフレシア", "ウツボット", "ワタッコ", "プクリン", "デンリュウ", "メガニウム", "バクフーン", "バシャーモ", "アゲハント", "ドクケイル", "ライチュウ", "ダーテング", "ケッキング", "ジュカイン", "ハスブレロ", "マリルリ", "オーダイル", "ラグラージ", "トドゼルガ", "キングドラ", "クロバット", "バクオング", "ピクシー", "ボスゴドラ", "バンギラス", "サーナイト", "フライゴン", "ボーマンダ", "メタグロス", "ニョロトノ", "キレイハナ"};
    String[] r = {"リザード", "フシギソウ", "カメール", "ゴーリキー", "ユンゲラー", "ゴローン", "ニドリーナ", "ニドリーノ", "ニョロゾ", "ゴースト", "ハクリュー", "ピジョン", "トランセル", "コクーン", "クサイハナ", "ウツドン", "ポポッコ", "プリン", "モココ", "ベイリーフ", "マグマラシ", "ワカシャモ", "カラサリス", "マユルド", "ピカチュウ", "コノハナ", "ヤルキモノ", "ジュプトル", "ハスブレロ", "マリル", "アリゲイツ", "ヌマクロー", "トドグラー", "シードラ", "ゴルバット", "ドゴーム", "ピッピ", "コドラ", "サナギラス", "キルリア", "ビブラーバ", "コモルー", "メタング"};
    String[] n = {"ヒトカゲ", "フシギダネ", "ゼニガメ", "ワンリキー", "ケーシィ", "イシツブテ", "ニドラン♀", "ニドラン♂", "ニョロモ", "ゴース", "ミニリュウ", "ポッポ", "キャタピー", "ビードル", "ナゾノクサ", "マダツボミ", "ハネッコ", "ププリン", "メリープ", "チコリータ", "ヒノアラシ", "アチャモ", "ケムッソ", "ピチュー", "タネボー", "ナマケロ", "キモリ", "ハスボー", "ルリリ", "ワニノコ", "ミズゴロウ", "タマザラシ", "タッツー", "ズバット", "ゴニョニョ", "ピィ", "ココドラ", "ヨーギラス", "ラルトス", "ナックラー", "タツベイ", "ダンバル"};

    public void pokeGatya() {
        sulot();
        if (val >= 1 && val <= 5) {
            number = (int) (Math.random() * 21);
            System.out.println("ssr:" + ssr[number]);
            System.out.println("いやっほーい！伝説だべ！！");
        } else if (val >= 6 && val <= 20) {
            number = (int) (Math.random() * 45);
            System.out.println("sr:" + sr[number]);
            System.out.println("まあ、あたりっちゃあたりだべ");
        } else if (val >= 21 && val <= 60) {
            number = (int) (Math.random() * 43);
            System.out.println("r:" + r[number]);
            System.out.println("ハズレだっぺな");
        } else if (val >= 61 && val <= 100) {
            number = (int) (Math.random() * 42);
            System.out.println("n:" + n[number]);
            System.out.println("クソが！");
        }
    }

    public void lastGatya() {
        sulot();
        if (val >= 1 && val <= 25) {
            number = (int) (Math.random() * 21);
            System.out.println("ssr:" + ssr[number]);
            System.out.println("いやっほーい！伝説だべ！！");
        } else if (val >= 26 && val <= 100) {
            number = (int) (Math.random() * 45);
            System.out.println("sr:" + sr[number]);
            System.out.println("まあ、あたりっちゃあたりだべ");
        }
    }

    public void superGatya() {
        sulot();
        if (val >= 1 && val <= 10) {
            number = (int) (Math.random() * 21);
            System.out.println("ssr:" + ssr[number]);
            System.out.println("いやっほーい！伝説だべ！！");
        } else if (val >= 11 && val <= 30) {
            number = (int) (Math.random() * 45);
            System.out.println("sr:" + sr[number]);
            System.out.println("まあ、あたりっちゃあたりだべ");
        } else if (val >= 31 && val <= 65) {
            number = (int) (Math.random() * 43);
            System.out.println("r:" + r[number]);
            System.out.println("ハズレだっぺな");
        } else if (val >= 65 && val <= 100) {
            number = (int) (Math.random() * 42);
            System.out.println("n:" + n[number]);
            System.out.println("クソが！");
        }
    }

    public void sulot(){
        val = (int) (Math.random() * 100) + 1;
    }

}

