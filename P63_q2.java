class P63_q2 {
	public static void main(String[] args) {

		int i;
		for(i = 1;i <= 100;i++){
			if(i % 3 == 0 || String.valueOf(i).indexOf("3") != -1){
				System.out.println("THREE");
			}else{
				System.out.println(i);
			}
		}	

	}
}

