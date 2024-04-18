/* 
※変数
整数
・byte　およそ±128
・short　およそ±32000
・int　およそ±21億(基本はこれ)
・long　およそ±900京

少数点数
・float 小数
・double　小数(基本はこれ)

文字
・char　1文字
・string 文字列

論理値
・boolean trueかfalse

※リテラル
具体的な値のこと
整数リテラルはint型

Char型の場合はシングルクオーテーション;
String型の場合はダブルクオーテーション;

※エスケープシーケンス;

※関係演算子;
boolean型に限る;
--------------------
データの型変換;

代入における自動型変換
以下の条件では自動で行われる;
1,代入元と代入先が共に整数型(byte, short, int, long)(double, float);
2,変数の大きさ(許容メモリサイズ)が以下を満たすとき;
  代入先の方(左辺) > 代入元の方(右辺); //左辺の方が小さかった場合 オーバーフローとなってしまう
算術演算子の自動変換型;
1,整数型同士は一番大きな方に揃えて演算される;
2,double を含む小数点の演算はdoubleに揃えて演算整数型が混じっていてもdoubleに揃えられる;

キャスト;
一時的な型変換を行うこと;
使用例;
long x = 10;
int y = (int)x;  //数値同士のみ使用可

文字列と整数の型変換;
使用例ー文字列から整数;
String x = "10";
int y = Integer.parseInt(x);
整数から文字列;
int x = 10;
String y = String.valueOf(x);
-----------------------
配列と参照型;
配列宣言;

String型の比較;
参照型であるString型同士を「==」で比較しようとすると場所情報の比較となってしまうため比較できない;
じゃあ、どうやって比較するの？;
例：
name1.equals(name2);








	*/