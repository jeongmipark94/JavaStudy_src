package day1205;

public class HwLotto {
	/*
	 * 숙제1 1. 1~45 까지의 사이의 수중에서 무작위로 하나를 뽑아 6개의 세트를 만들어 배열로 반환하는 method를 만들고 호출하여
	 * 출력할 것. 단, 중복된 수는 배열에 입력되지 않아야한다.
	 */



	public void pick() {
		int result[] = new int[6];

//		int i = 0;
//		int r = 0;
		for (int i = 0; i < 6; i++) {
//			r = (int) (Math.random() * 45) + 1;

			result[i] =  (int) (Math.random() * 45) + 1;
			for(int j=1; j<=i;j++) {
				if(result[i]==result[j]) {
					i--;
					break;//break타면 다시 맨위의 for로 돌아가는데
					//break에서 i--해줬으니까 값을 다시 넣어주는 효과가 생김.
				}
			}//for
			System.out.println(result[i]);

		} // for
//		return ;
	}// pick

	public static void main(String[] args) {
		HwLotto hl = new HwLotto();
		hl.pick();
	}// main

}// main
