package day1203;

/**
 * 사람의 공통특징은 Person에서 가져다가 사용하고 자신만의 특징을 정의한 클래스
 * 
 * @author owner
 */
public final class Clark extends Person implements Fly {
	public int power;

	/**
	 * 기본 생성자 : 객체가 생성되면 power가 9로 설정된다.
	 */
	public Clark() {
		super(3, 1, 1);
		power = 9;
	}// Clark

	/**
	 * 입력되는 돌의 종류에 따라 힘의 변화가 급격하게 변화한다.
	 * 
	 * @param stone 돌의 종류
	 * @return 힘의 변화
	 */
	public String power(String stone) {
		String result = "";

		if (stone.equals("클립토나이트")) {
			power = 0;
			result = "힘이 방전 ~(_-_)~";
		} else if (stone.equals("다이아몬드")) {
			power = 10;
			result = "감사합니다 ~m(^o^)m~";
		} else {
			power = 12;
			result = "열받음. ㅡㅡ+";

		} // end else

		return result;
	}// power

	@Override
	public String eat() {
		return getName() + "이 집에서 빵을 먹는다. ";
	}

	@Override
	public String eat(String menu, int price) {
		return getName() + "이 레스토랑에서 " + menu + "인 음식을 " + price + "$ 내고 사먹는다.";

	}// eat
	
	@Override
	public String speed(String speed) {
		return getName() +"은 " + speed + "게 난다";
	}//speed
	@Override
	public String height(String height) {
		return getName() +"은 " + height +"이 난다.";
	}//height
	

//	@Override
//	public String[] language(String lang) {
//		String[] tempLang = getLanguage();
//
//		int idx = 0;
//		for (int i = 0; i < tempLang.length; i++) {
//			// 입력된 언어가 이미 습득한 언어라면 다음 방의 인덱스를 가진다
//			if (tempLang[i] != null) { // 습득한 언어가 존재한다면 다음 인덱스를 얻는다.
//				if (lang.equals(tempLang[i])) {
//					// 입력된 언어가 이미 습득한 언어라면 반복문을 빠져나가. 해당 방에 덮어 쓸 수 있는 인덱스를 가진다.
//					break;
//				} // end if
//				idx++;
//			}
//		} // end if
//			// 없으면 추가되고 있다면 덮어쓴다. : upsert
//
//		tempLang[idx] = lang;
//		return tempLang;
//	}// language
}// class
