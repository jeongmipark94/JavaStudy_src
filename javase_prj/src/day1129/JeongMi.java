package day1129;

public class JeongMi extends Person{
	public int cash;
	
	public JeongMi() {
		cash = 6;
	}//JeongMi 의 기본생성자
	
	public String cash(String getMoney) {
		String result="";
		
		if(getMoney.equals("용돈")) {
			cash=10;
			result=" 용돈이 생겨 쇼핑을 했습니다";
		}else if(getMoney.equals("지출")) {
			cash=2;
			result="많은 돈을 써버렸습니다";
		}else {
			cash=0;
			result= "변동없음";
			
		}//ens else
		return result;
	}//cash
	
	
}//class
