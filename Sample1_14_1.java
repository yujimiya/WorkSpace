class Sample1_14_1 {  //クラスブロック（設計図）管理のために一つのファイルに一つのクラス
	
	public static void main(String[] args) {//メソッドはパーツの設計図　メソッド名は、（）の手前
		
		//メソッドのしくみ
		
		int print = sum( 4 , 3 ) ;
		
		System.out.println("print：" + print);
		
	}
	//引数の方と戻り値の方は一致していないとダメ
	static int sum( int num1 , int num2 ) {
		
		int calcResult = num1 + num2 ;
		
		return calcResult ;
		
	}
	
}