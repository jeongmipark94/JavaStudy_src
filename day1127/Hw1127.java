package day1127;

public class Hw1127 {
	private String ssn;
	
	//1-1 생성자는 주민번호를 받아 instance 변수에 할당한다. 
    	public Hw1127(String ssn) {
    		this.ssn = ssn;
    	}//주민번호
	
	//1-2 주민번호의 길이 체크 14자
	public boolean chklength() {
		boolean flag = false;
		if( ssn.length() == 14 ) {
			flag = true;
			return flag;
		}else {
			flag=false;
			return flag;
		}//end if
	}//end chklength
	
	//1-3 주민번호의 6번째 자리가 "-"이 아니면 false 반환
	public boolean hipen() {
		if( ssn.charAt(6)!='-') {
			return false;
		}else {
			return  true;			
		}
		//end if
	}//end hipen
	
//	1-4주민번호의 유효성 검증하여 유효하면 true(아니면 false) 반환
//	각 자리에 2 3 4 5 6 7 8 9 2 3 4 5를 곱한 값을
//	더하여  11로 나눈 나머지 값을 얻고 11 에서 그 값을 빼고
//	10으로 나눈 나머지가 주민번호의 끝자리와 같다면 true / false
	
	public boolean exist() {
		int checkNum = 0;
		
		int j = 2;
		//앞 6자리
		
		
		for(int i=0; i<6; i++) {
			checkNum +=Integer.parseInt(ssn.substring(i,i+1))*j;
			j++;
		}//end for

		
		for(int i=7; i<ssn.length()-1; i++) {
			checkNum +=Integer.parseInt(ssn.substring(i,i+1))*j;
			j++;
			if(j>9) j=2;
		}//end for
		
		checkNum %= 11;
		checkNum = 11-checkNum;
		checkNum %= 10;
		
		if (Integer.parseInt(ssn.substring(13)) == checkNum) {
			return true;
		}else {
			return false;
		}
		
		
	}//end exist
		public String getBirth() {
			int flag = Integer.parseInt(ssn.substring(7,8));
			String birth;
			if( flag == 1 || flag ==2 || flag ==5 || flag==6) {
				birth = 19+ssn.substring(0,2)+"-"+ssn.substring(2,4)+"-"+ssn.substring(4,6);
			}else {
				birth = 20+ssn.substring(0,2)+"-"+ssn.substring(2,4)+"-"+ssn.substring(4,6);
				
			}
			return birth;
		}
		
		// 1-6 나이를 반환하는 일        31
		public int getAge() {
			int flag = Integer.parseInt(ssn.substring(7,8));
			String birth;
			int age;
			if( flag ==1 || flag==2||flag==5||flag==6) {
				birth = 19+ssn.substring(0,2);
				 age  = 2018- Integer.parseInt(birth)+1;
			}else {
				birth = 20+ssn.substring(0,2);
				age = 2018- Integer.parseInt(birth)+1;
			}
							return age;
		}//end age
		
		//1-7 성별을 반환 (남/여)
		private char getGender() {
			int flag = Integer.parseInt(ssn.substring(7,8));
			
			if (flag == 1 || flag ==3 || flag ==5||flag ==7) {
					return '남';
			} else {
					return '여';
			}
		}
		
		//1-8 내 외국인 반환
		private String nation() {
			
			int flag = Integer.parseInt(ssn.substring(7,8));
			
			if(flag == 0 ||flag ==1|| flag ==2|| flag == 3|| flag==4|| flag==9) {
				return "내국인";
			}else {
				return "외국인";
			}
		}
		
		//1-9 띠를 반환
		public String getCz() {
			int flag = Integer.parseInt(ssn.substring(7,8));
			String birthYear;
			
			if(flag ==1 || flag ==2 || flag ==5||flag ==6) {
				birthYear = 19+ssn.substring(0,2);
			}else {
				birthYear = 20+ssn.substring(0,2);
			}
			
			int i = Integer.parseInt(birthYear);
			
			if (i%12 == 11) {
				return "양";
			}else if (i%12 == 10) {
				return "말";
			}else if (i%12 == 9) {
				return "뱀";
			}else if (i%12 == 8) {
				return "용";
			}else if (i%12 == 7) {
				return "토끼";
			}else if (i%12 == 6) {
				return "호랑이";
			}else if (i%12 == 5) {
				return "소";
			}else if (i%12 == 4) {
				return "쥐";
			}else if (i%12 == 3) {
				return "돼지";
			}else if (i%12 == 2) {
				return "개";
			}else if (i%12 == 1) {
				return "닭";
			}else {
				return "원숭이";
			}
		}
		
		
	public static void main(String[] args) {
		String ssn = "940101-2123456";
		Hw1127 hw = new Hw1127(ssn);
		System.out.println(ssn);
		System.out.println(hw.chklength());
		System.out.println(hw.hipen());
		System.out.println(hw.exist());
		System.out.println(hw.exist());
		System.out.println(hw.getBirth());
		System.out.println(hw.getAge());
		System.out.println(hw.getGender());
		System.out.println(hw.nation());
		System.out.println(hw.getCz());
		System.out.println("-----------------------------");
		
		if (hw.chklength()) {
			if(hw.hipen()) {
				if(hw.exist()) {
					System.out.println("생년월일 : " + hw.getBirth());
					System.out.println("나이 : " + hw.getAge());
					System.out.println("성별 : " + hw.getGender());
					System.out.println("국적 : " + hw.nation());
					System.out.println("띠 : " + hw.getCz());
				} else {
					System.out.println("검증이 안되는 주민번호입니다.");					
				}
			}else {
				System.out.println("6번째 자리에 '-'이 없습니다..");
			}
		}else {
			System.out.println("주민번호 길이가 14자가 아닙니다..");
		}
	}

}
