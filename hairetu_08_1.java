class hairetu_08_1 {
	public static void main (String[] args) {
		
		//配列の活用
		
		char[] singou = new char[3] ;     //配列宣言：    型名[]配列名＝new 型名[要素数];
		//char[] singou = new char[]{'赤', '黄','青'} ;  もしくは
		//char[] singou = {'赤','黄','青'}; とすることで一度に配列に値を代入できる
		singou[0] = '赤' ;      //singou配列のindex番号0番目に「赤」を代入
		singou[1] = '黄' ;
		singou[2] = '青' ;
		
		char x = singou[1] ;
		System.out.println("要素の参照：" + x );
		
		int count = singou.length ;     //配列の要素数を数える処理
		System.out.println("要素数：" + count );
		
	}
}
