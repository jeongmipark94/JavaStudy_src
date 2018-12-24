package day1221;

import java.io.Serializable;

/**
 * �����͸� ������ �ִ� Ŭ������ ����ȭ��� Ŭ����
 * @author owner
 */
@SuppressWarnings("serial")
public class UserData implements Serializable {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1433112021624942957L;
	private int age;
	private /*transient*/ double weight;
	private  /*transient*/ String name;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserData [age=" + age + ", weight=" + weight + ", name=" + name + "]";
	}

	 //transient : ����ȭ ���� Ű����(����  JVM�ܺη� ���� ���� �ʴ´�.)
	public UserData() {
		
	}

	public UserData(int age, double weight, String name) {
		super();
		this.age = age;
		this.weight = weight;
		this.name = name;
	}

	
	
}//class