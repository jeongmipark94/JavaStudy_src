package day1129;

public class Hw22classArray {

//	int inSeoul = 0;
//	int sumage =0;
//	int oldestage =0;
//	String oldestname = "";
//	String oldestgender= "";
//	
//	
//	
//	
//	//2-1 서울시 인원출력
//	public int seoul() {
//		
//		
//	}
//	//2-2 나이의 합 출력
//	public int sum() {
//		
//	}
//	//2-3 나이 많은 사람 이름 출력
//	public String maxage() {
//		
//	}

	public static void main(String[] args) {
		int inSeoul = 0;
		int sumage = 0;
		int oldestage = 0;
		String oldestName = "";
		String oldestGender = "";
		
		Hw22personclass[] personArr = new Hw22personclass[7];

		personArr[0] = new Hw22personclass(1, "이재찬", "서울시 강남구 역삼동", 28, "남자");
		personArr[1] = new Hw22personclass(2, "이재현", "서울시 동대문구 답십리동", 27, "남자");
		personArr[2] = new Hw22personclass(3, "김정운", "수원시 영통구 영통동", 26, "남자");
		personArr[3] = new Hw22personclass(4, "정택성", "서울시 구로구 구로동", 27, "남자");
		personArr[4] = new Hw22personclass(5, "정택순", "서울시 동작구 상도동", 29, "여자");
		personArr[5] = new Hw22personclass(6, "김건하", "경기도 부천시 부천동", 26, "남자");
		personArr[6] = new Hw22personclass(7, "이재순", "서울시 광진구 광나루동", 27, "여자");

		for (int i = 0; i < personArr.length; i++) {
			personArr[i].hw22personclass();
			sumage += personArr[i].age;
			if (personArr[i].addr.contains("서울시")) {
				inSeoul += 1;
			}
			if (oldestage < personArr[i].age) {
				oldestage = personArr[i].age;
				oldestName = personArr[i].name;
				oldestGender = personArr[i].gender;
				
			}

			System.out.println();
		} // end for
		System.out.println("서울시 거주자 : " + inSeoul + " 나이의 합" + sumage + "나이 많은 사람 이름 출력" + oldestName
				+"["+oldestGender+"]");
		// System.out.println("서울시 거주자" + );
	}// main

}// class
