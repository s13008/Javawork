import java.util.Scanner;
import java.util.Random;
class janken {
	public static void main(String[] args) {

		Scanner std = new Scanner(System.in);
		Random ran =new Random();	

		int player;
		int x;

		x = ran.nextInt(3);

		System.out.println("最初はグー\nじゃんけん");
		System.out.println("グー:0 チョキ:1 パー:2");
		player = std.nextInt();

		switch(player) {
			case 0:
				System.out.println("あなたはグー");
				break;
			case 1:
				System.out.println("あなたはチョキ");
				break;
			case 2:
				System.out.println("あなたはパー");
				break;
			default:
				break;
		}
		switch(x) {
			case 0:
				System.out.println("CPはグー");
				break;
			case 1:
				System.out.println("CPはチョキ");
				break;
			case 2:
				System.out.println("CPはパー");
				break;
			default:
				break;
		}

		if(x == player){
			System.out.println("あいこ");
		}else if(x < player){
			System.out.println("負け");
		}else if(x > player){
			System.out.println("勝ち");
		}		

	}
}



