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

		String win = "結果 : Player  WIN";
		String lose = "結果 : Player  LOSE";
		String draw = "結果 : Player  DRAW";


		int player = 0;
		int x = 0;;


		x = ran.nextInt(3);

		System.out.println("\n最初はグー\nじゃんけん...\n");


		while(!handler){
			System.out.println("グー : 0 チョキ : 1 パー : 2\n");
			player = std.nextInt();
			if(player < 0 || player > 2){
				System.out.println("\n0 か 1 か 2 を入力してください。\n");
			}else{
				handler = true;
			}
		}	


		switch(player) {
			case 0:
				switch(x){
					case 0:
						System.out.print("\n"+myHandG+"\n" + xHandG+"\n" + draw+"\n");
						break;
					case 1:
						System.out.print("\n"+myHandG+"\n" + xHandT+"\n" + win+"\n");
						break;
					case 2:
						System.out.print("\n"+myHandG+"\n" + xHandP+"\n" + lose+"\n");
						break;
				}
				break;
			case 1:
				switch(x){
					case 0:
						System.out.print("\n"+myHandT+"\n" + xHandG+"\n" + lose+"\n");
						break;
					case 1:
						System.out.print("\n"+myHandT+"\n" + xHandT+"\n" + draw+"\n");
						break;
					case 2:
						System.out.print("\n"+myHandT+"\n" + xHandP+"\n" + win+"\n");
						break;
				}
				break;
			case 2:
				switch(x){
					case 0:
						System.out.print("\n"+myHandP+"\n" + xHandG+"\n" + win+"\n");
						break;
					case 1:
						System.out.print("\n"+myHandP+"\n" + xHandT+"\n" + lose+"\n");
						break;
					case 2:
						System.out.print("\n"+myHandP+"\n" + xHandP+"\n" + draw+"\n");
						break;
				}
				break;
		}
	}
}
