package day1123;

/**
 *숙제 1123 너구리, 오징어짬뽕, 신라면으로 클래스 만들기 
 *1. 대상 선정 )  너구리, 오징어짬뽕, 신라면
        2. 객체 모델링 ) 라면 -
명사적 특징 : 면발의 굵기, 매운맛, 선호도
동사적 특징 : 조리됨
 * @author owner
 */
public class Hw_Ramen {
	private String name, thick, chily  ;//라면이름
	private int fan;
	
	public Hw_Ramen() {
		this("너구리", "뚜꺼움", "보통",5);
		System.out.println("기본 생성자로 라면 만듬");
	}// 기본생성자 라면 

	
	public Hw_Ramen(String name,String thick,String chily, int fan) {
		this.name = name;
		this.thick = thick;
		this.chily = chily;
		this.fan = fan;
		System.out.println("매개변수 있는 생성자로 라면 만듬");
	}//인자있는 생성자 라면
	
	
	public void setName(String name) {
		if(!(name.equals("신라면")||name.equals("너구리")||
				name.equals("오징어짬뽕"))) {
			name="신라면";
		}//end if
		this.name=name;
	}//setName
	
	public void setThick(String thick) {
		this.thick=thick;
	}
	public void setFan(int fan) {
		
		this.fan=fan;
	}//setFan
	
	public void setChily(String chily) {
		
		this.chily=chily;
	}//setchily
	
	//--------------------------------------------------------
	public String getName() {
		return name;
	}//getname
	
	public String getThick() {
		return thick;
	}//getThick
	
	public String getChily() {
		return chily;
	}//getChily
	
	public int getFan() {
		return fan;
	}//getFan
	//--------------------------------------------------
	//동사적 특징
	public String cook() {
		return name+"이(가) 끓여졌다.";
	}//cook
	
	public String cook(String inner, int price) {
		return inner+"을(를)넣은 "+name+" 을(를)"+price+"원 주고 사먹었다.";
	}//cook
	
}//class
