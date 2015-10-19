import java.util.Scanner;

class Q0301 {   
	public static void main(String args[]) {

		Scanner std = new Scanner(System.in);

		double  a,b,c,p,s;
		String q = ("A B C の辺の長さを入力してください ");

		System.out.println(q);
		a = std.nextInt();

		b = std.nextInt();

		c = std.nextInt();

		p= (a+b+c)/2;

		s= Math.sqrt(p*(p-a)*(p-b)*(p-c));

		System.out.print("a=" + a + "    b=" + b + "    c=" + c);
		System.out.println("    面積=" + s);
	}
}
