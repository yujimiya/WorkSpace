class sanshougata {
	public static void main (String[] args) {
		
		//多次元配列の活用
		
		int[][] rooms = {{101, 102, 103}, {201, 202, 203}, {301, 302, 303}} ;
		
		System.out.println("rooms[1][2]：" + rooms[1][2] ); //表示は203となる
		
		System.out.println("rooms.length：" + rooms.length );//表示は3となる
		
		System.out.println("rooms[1].length：" + rooms[1].length );//表示は3となる
		
	}
}
