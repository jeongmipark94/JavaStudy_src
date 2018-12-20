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
		Data d= new Data("쌍용유치원");
		
		if(d instanceof Cloneable) {
		
		d.setSchool("쌍용초등학교");
		Data d1 = d.getData();
		histroryStack.push(d1);
				
		 d= new Data("쌍용중학교");
		Data d2 = d.getData();
		histroryStack.push(d2);
		
		d= new Data("쌍용고등학교");
		Data d3 = d.getData();
		histroryStack.push(d3);
		
		d= new Data("쌍용대학교");
		histroryStack.push(d.getData());
		
		getHistoryData();
		}else {
			System.out.println("Cloneable만 처리합니다.");
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
			System.err.println("복제되지 않습니다.");
			e.printStackTrace();
		}//catch
	}//main

}//class
