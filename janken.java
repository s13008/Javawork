import java.util.Scanner;
import java.util.Random;
class janken {
	public static void main(String[] args) {

		Scanner std = new Scanner(System.in);
		Random ran =new Random();	

		int guu = 0;
		int choki = 1;
		int paa = 2;
		int player;
		int x;

		x = ran.nextInt(3);

		System.out.println("最初はグー\nじゃんけん");
		System.out.println("グー:0 チョキ:1 パー:2");
		player = std.nextInt();

		switch(player) {
			case 0:
				System.out.println("グー");
				break;
			case 1:
				System.out.println("チョキ");
				break;
			case 2:
				System.out.println("パー");
				break;
			default:
				break;
		}
		switch(x) {
			case 0:
				System.out.println("グー");
				break;
			case 1:
				System.out.println("チョキ");
				break;
			case 2:
				System.out.println("パー");
				break;
			default:
				break;
		}

		if(x == player){
			System.out.println();
		}else if(x < player){
			System.out.println();
		}else if(x > player){
			System.out.println();
		}		

	}
}



