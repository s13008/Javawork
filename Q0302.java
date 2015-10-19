import java.util.Scanner;

class Q0302 {
	public static void main(String []args) {
	Scanner std = new Scanner(System.in);

	int a,b,c;
	
	System.out.println("値を３つ入力して下さい");
	a = std.nextInt();
	b = std.nextInt();
	c = std.nextInt();
	
	int d = Math.max(a,b);
	int max = Math.max(d,c);	
	
	System.out.print("値の最大値 :" + max);
	}
}
