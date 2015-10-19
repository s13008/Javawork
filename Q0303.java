import java.util.Scanner;

class Q0303 {
	public static void main(String []args) {

		Scanner std = new Scanner(System.in);

		boolean handler = false;
		int rate = 0;

		while(!handler){
			System.out.print("\n" + "降水確率を入力してください：");
			rate = std.nextInt();
			if(rate < 0 || rate > 100){
				System.out.println("\n" + "降水確率は0から100の間で指定してください。\n");
			}else{
				handler = true;
			}
		}

		if(rate < 0 || rate < 20){
			System.out.println("\n" + rate + "%: 傘は要りません。\n");
		}else if(rate < 20 || rate < 50){
			System.out.println("\n" + rate + "%: 雨が降るかもしれません。傘を持って行ったほうが良いでしょう。\n");
		}else{
			System.out.println("\n" + rate + "%: 傘を持って行ったほうが良いでしょう。\n");

		}
	}
}
