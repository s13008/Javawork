class Q0201 {
	public static void main(String []args) {

		int x = 10;

		for(int i = x; i > 1; i--){
			x *= i - 1;
		}
		System.out.println("10の階乗は:" + x);
	}
}
