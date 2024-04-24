/*-< 演習：Ex1_11_1 >---------------------------------
while文を使用して、6の目がでるまでサイコロを降り続けるプログラムを作成してください。
※1～6までのランダムなint型の値を取得する方法 ： 1 + (int)(Math.random() * 6.0)
※6の目が出たら「6が出たのでを終了します」と表示してください
----------------------------------------------------*/
class Ex1_11_1 {
	public static void main (String[] args) {
		
		int dice = 0;
		
		dice = 1 + (int)(Math.random() * 6.0); //先にサイコロを振ってサイコロの目を表示する
		System.out.println(dice);
		//サイコロの目が出てから下の繰り返し処理に移る。
		while( dice != 6 ){  //サイコロの目が6かどうかを判断し6出なければ繰り返し処理をする
			
			dice = 1 + (int)(Math.random() * 6.0);
			System.out.println(dice);
			
			
		}
		System.out.println("6が出たので終了します");
		
		
	}
}
