class Sample1_11_2 {
	public static void main (String[] args) {
		
		//do-while文のしくみ
		//whileとdo-while分の違い  while文については繰り返し処理を行う前にループする前にある前判定
		//do-whileは必ず一回処理される後判定
		/*コマンドライン引数で受け取った数字の累乗の数のうち、100未満のもののみを表示するプログラムを作る。
		**【例】コマンドライン引数での入力：3 → 表示される数：3 , 9 , 27 , 81
		*/
		
		int receiveNumber = Integer.parseInt(args[0]) ;  //ループ毎にcalcNumberに掛ける数（コマンドライン引数で受け取った値）
		int calcNumber    = receiveNumber ;              //表示する数（初期値：コマンドライン引数で受け取った値）
		
		do{
			
			System.out.println("calcNumber：" + calcNumber);
			
			calcNumber *= receiveNumber ;
			
		}while( calcNumber < 100 );
		
	}
}
