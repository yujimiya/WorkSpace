class Jihan2 {

	public static void main(String[] args) {
		int coinNum = args.length - 1;                          //投入されたコインの枚数
		int coinChk = 0 ;                                      //チェック対象のコインの金額
		int coinSum = 0 ;                                      //投入されたコインの合計金額
		int price =  Integer.parseInt(args[ args.length - 1 ]);//購入された商品の金額
		int change = 0 ;                                       //おつり
		
		for(int i = 0; i < coinNum; i++) {
			
			coinChk =  Integer.parseInt(args[i]);
			
			if( coinChk == 10 || coinChk == 50 || coinChk == 100 || coinChk == 500 ) {
					
				coinSum += coinChk;
			}else if( coinChk == 1 || coinChk == 5 ){
				System.out.println("警告" + coinChk + "円玉は使えません");
			}else{
				System.out.println("警告" + coinChk + "は硬貨として適切な値ではありません");
			}
		}
		
		change = coinSum - price;
		
		System.out.println("ただいまの投入金額は" + coinSum + "円です");
		System.out.println("商品の購入金額は" + price + "円です");
		if(change > 0) {
			System.out.println(change + "円のお釣りです");
		}else if(change == 0){
			System.out.println("ちょうどのお預かりです");
		}else {
			System.out.println("投入金額が足りません");
		}
		
	}

}
