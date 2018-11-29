package day1129;

public class Hw22personclass {
	public int num;
	public String name;
	public String addr;
	public int age;
	public String gender;
	
	public Hw22personclass(int num, String name, String addr,int age, String gender) {
		this.num = num;
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.gender = gender;
	}//data
	
	public void setNum(int num) {
		this.num = num;
	}//setNum
	
	public void setName(String name) {
		this.name = name;
	}//setName
	
	public void setAddr(String addr) {
		this.addr = addr;
	}//setAddr
	
	public void setAge(int age) {
		this.age = age;
	}//setAge
	
	public void setGender(String gender) {
		this.gender = gender;
	}//setGender
	
	public int getNum() {
		return  num;
	}//getNum
	
	public String getName( ) {
		return  name;
	}//getName
	
	public String getAddr( ) {
		return addr;
	}//getAddr
	
	public int getAge( ) {
		return age;
	}//getAge
	
	public String getGender( ) {
		return  gender;
	}//getGender

	public void hw22personclass() { 
		  		System.out.printf("%d, %s, %s, %d, %s", 
		  				getNum(), getName(), getAddr(), getAge(), getGender()); 
		  	} 
	  } 

	
	

	
		
		


