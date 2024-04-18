class comand_line {
	public static void main (String[] args) {
		
		//コマンドライン引数の活用
		//コマンドライン引数とはコマンドラインを通して人間から受け取れる特殊な配列
		String x = args[1] ;
		System.out.println("コマンドライン引数の要素の参照：" + x );
		
		int count = args.length ;
		System.out.println("コマンドライン引数の要素数：" + count );
		
	}
}
