class Sample1_13_4 {
	public static void main (String[] args) {
		
		//switch文のしくみ
		
		int num = Integer.parseInt(args[0]) ;  //コマンドライン引数で受け取った値
		
		switch (num){
			
			case 1:  //num == 1がtrueの場合
				System.out.println("非常に不満");
				break; //breakを記述することでcase1の表示で処理が止まる
			
			case 2:  //num == 2がtrueの場合
				System.out.println("少し不満");
				break;
			
			case 3:  //num == 3がtrueの場合
				System.out.println("どちらとも言えない");
				break;
			
			case 4:  //num == 4がtrueの場合
				System.out.println("少し満足");
				break;
			
			case 5:  //num == 5がtrueの場合
				System.out.println("大変満足");
				break;
			
			default:  //どのcaseにも当てはまらない場合
				System.out.println("満足度は1～5で答えて下さい");
				break;
		}
	}
}  //switch文の変数で使用できる方は byte,short,int,charのいずれか。なおJavaのバージョン７以降ではStringも使用可能
