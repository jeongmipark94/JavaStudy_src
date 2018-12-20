package day1218;

import java.util.Stack;

/**
 *
 * @author owner
 */
public class DataClone extends Data {
	private Stack<Data> histroryStack;
	
	public DataClone() {
		histroryStack = new Stack<Data>();
	}//DataClone
	
	public void useData() throws CloneNotSupportedException {
		Data d= new Data("�ֿ���ġ��");
		
		if(d instanceof Cloneable) {
		
		d.setSchool("�ֿ��ʵ��б�");
		Data d1 = d.getData();
		histroryStack.push(d1);
				
		 d= new Data("�ֿ����б�");
		Data d2 = d.getData();
		histroryStack.push(d2);
		
		d= new Data("�ֿ����б�");
		Data d3 = d.getData();
		histroryStack.push(d3);
		
		d= new Data("�ֿ���б�");
		histroryStack.push(d.getData());
		
		getHistoryData();
		}else {
			System.out.println("Cloneable�� ó���մϴ�.");
		}//end else
	}//useData
	
	public void getHistoryData() {
		
		Data temp = null;
		while(!histroryStack.empty()) {
			temp=histroryStack.pop();
			System.out.println(temp);
			System.out.println(temp.getSchool());
		}//end while
		
	}//getData
	
	public static void main(String[] args) {
//		Data data = new Data();
//		Data temp = (Data)data.clone();
		try {
			new DataClone().useData();
		} catch (CloneNotSupportedException e) {
			System.err.println("�������� �ʽ��ϴ�.");
			e.printStackTrace();
		}//catch
	}//main

}//class
