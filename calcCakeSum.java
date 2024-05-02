class calcCakeSum {
	public static void main (String[] args) {
		
		final String CAKE_NAME_SHT  = "ショートケーキ";//ショートケーキ：320円
		final int    CAKE_PRICE_SHT = 320;
		final String CAKE_NAME_MNB  = "モンブラン";//モンブラン：350円
		final int    CAKE_PRICE_MNB = 350;
		final String CAKE_NAME_CHO  = "チョコレートケーキ";//チョコレートケーキ：370円
		final int    CAKE_PRICE_CHO = 370;
		final String CAKE_NAME_ICH  = "いちごのタルト";//いちごのタルト：400円
		final int    CAKE_PRICE_ICH = 400;
		final String CAKE_NAME_CHZ  = "チーズケーキ";//チーズケーキ：300円
		final int    CAKE_PRICE_CHZ = 300;
		
		final int    DISCOUNT_APPLYING_PRICE = 1000;//割引が適用される金額
		final double DISCOUNT_RATE  = 0.8;//割引率
		final double TAX            = 1.08;//消費税
		
		String checkCakeName  = "";//処理対象のケーキ名
		int    checkCakeCount = 0 ;//処理対象のケーキの個数
		int    totalPrice     = 0 ;//合計額
		int    payment        = 0 ;//支払額
		
		for(int i = 0; i < args.length ; i += 2) {  //コマンドライン引数からケーキ名と個数をセットで取得
			
			//ケーキ名と個数を取得
			checkCakeName =  args[i];
			checkCakeCount = Integer.parseInt(args[i + 1]);
			
			switch (checkCakeName) {
				case CAKE_NAME_SHT://ショートケーキだった場合
					totalPrice += CAKE_PRICE_SHT * checkCakeCount;
					break;
					
				case CAKE_NAME_MNB ://モンブランだった場合
					totalPrice += CAKE_PRICE_MNB * checkCakeCount;
					break;
					
				case CAKE_NAME_CHO ://チョコレートケーキだった場合
					totalPrice += CAKE_PRICE_CHO * checkCakeCount;
					break;
				
				case CAKE_NAME_ICH ://いちごのタルトだった場合
					totalPrice += CAKE_PRICE_ICH * checkCakeCount;
					break;	
					
				case CAKE_NAME_CHZ ://チーズケーキだった場合
					totalPrice += CAKE_PRICE_CHZ  * checkCakeCount;
					break;
			}
		}
		//支払額を計算する
		if (totalPrice > DISCOUNT_APPLYING_PRICE) { //合計金額が割引対象の場合
			
			payment = (int)(totalPrice * DISCOUNT_RATE * TAX );//(int)でキャストすることで整数になる
		}else {                                    //合計金額が割引対象でない場合
			payment = (int)(totalPrice * TAX);
		}
		System.out.println("合計金額は" + payment + "円です。");
	}
}

