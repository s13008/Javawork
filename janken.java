import java.util.Scanner;
import java.util.Random;

class janken {
	public static void main(String[] args) {

		Scanner std = new Scanner(System.in);
		Random ran =new Random();	

		boolean handler = false;

		String myHandG = "自分 : グー";
		String myHandT = "自分 : チョキ";
		String myHandP = "自分 : パー";

		String xHandG = "相手 : グー";
		String xHandT = "相手 : チョキ";
		String xHandP = "相手 : パー";

		String win = "結果 : 勝利！！";
		String lose = "結果 : 敗北！！";
		String draw = "結果 : あいこ！！";

		int player = 0;
		int x = 0;;

		x = ran.nextInt(3);

		System.out.println("最初はグー\nじゃんけん...");

		while(!handler){
			System.out.println("グー : 0 チョキ : 1 パー : 2");
			player = std.nextInt();
			if(player < 0 || player > 2){
				System.out.println("0か1か2を入力してください。");
			}else{
				handler = true;
			}
		}	

		switch(player) {
			case 0:
				switch(x){
					case 0:
						System.out.println(myHandG + xHandG + draw);
						break;
					case 1:
						System.out.println(myHandG + xHandT + win);
						break;
					case 2:
						System.out.println(myHandG + xHandP + lose);
						break;
				}
				break;
			case 1:
				switch(x){
					case 0:
						System.out.println(myHandT + xHandG + lose);
						break;
					case 1:
						System.out.println(myHandT + xHandT + draw);
						break;
					case 2:
						System.out.println(myHandT + xHandP + win);
						break;
				}
				break;
			case 2:
				switch(x){
					case 0:
						System.out.println(myHandP + xHandG + win);
						break;
					case 1:
						System.out.println(myHandP + xHandT + lose);
						break;
					case 2:
						System.out.println(myHandP + xHandP + draw);
						break;
				}
				break;
		}
	}
}
