package day1206;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * List : <br>
 * 중복값을 허용하며, 검색의 기능이있고, 순서대로 값을 입력하는 가변길이형.
 * 부모만 쓸 줄 알면 자식은 어떤것이든 쓸 수 있음
 * 
 * @author owner
 */
public class UseList {
	public UseList() {
		// JDK1.4에서는 Generic이 제공되지않고 객체만 저장된다.
//		List  list = new ArrayList();
//		
//		//값추가 : JDK1.5 이하에서는 객체로만 값ㅇ르 넣을 수 있따.
//		list.add(new Integer(10));
//		list.add(new Short((short)(10)));
//		list.add("공선의");
//		System.out.println(list.size());
//		System.out.println(((Integer)list.get(0)).intValue()+10);

		// JDK 1.5 +에서 사용 : Generic, Auto boxing, unboxing
		//Generic을 권장.
		List<Integer> list =new ArrayList<Integer>();
//		List list = new ArrayList<Integer>();
		list.add(10); // autoboxing ==>list.add(new Integer(10));
		list.add(20);
		list.add(new Integer(30));
//		list.add("김건하"); //Generic으로 설정된 형이 아닌 데이터형을 추가할 수 없다.

		System.out.println("크기" + list.size());
		System.out.println( list.get(0) + 10);
		for(int i=0; i< list.size() ; i++){
			System.out.println(list.get(i)+1);			
		}//end for
	}// UseList

	/**
	 * ArrayList 사용 :  Multi Thread 환경에서 동시 접근 가능.(동기화 X)
	 */
	public void useArrayList() {
		//1. 생성
		ArrayList<String> al = new ArrayList<>(); //방 0개
		List<String> al1= new ArrayList<String>(100); //방 100개
		
		System.out.println(al + " / " +al1);
		//값추가 : 순서대로 추가된다.
		al.add("이재현");
		al.add("정택성");
		al.add("김정윤");
		al.add("김건하");
		al.add("김정윤"); //List는 중복값을 저장할 수 있다.
		al.add("노진경");
		al.add("김정윤"); //List는 중복값을 저장할 수 있다.
		al.add("공선의");
		System.out.println(al + " / " +al1);
		//size() : 데이터의 크기
		System.out.println(" al 크기 "+ al.size()+" / al1의 크기 : "+ al.size());
		
		//배열에 복사
		String[] names = new String[ al.size()];
		al.toArray( names );

		//방의 값 삭제
		//인덱스로 삭제 : 특정 인덱스 방의 값이 삭제.
		al.remove(4);
		System.out.println( al.size()+"/" + al );
		//방의 내용으로 삭제 : 
		al.remove("김정윤"); // L-> R으로 진행하면서 일치하는 가장 첫방의 값만 삭제
		System.out.println( al.size()+"/" + al );
		
		for( String name : al) {
			System.out.println(name);
		}//end for
		
		//모든 방의 값 삭제 :
		al.clear();
		System.out.println("전체 삭제 후"+ al.size()+" / "+ al);
		
		//배열의 값
		for(int i=0 ; i < names.length; i++) {
			System.out.printf("%s\t", names[i]);
		}//end for
		System.out.println();
		
		
	}// useArrayList

	public void useVector() {
		//1. 생성
				Vector<String> vec = new Vector<String>(); //방 0개
				List<String> vec1= new Vector<String>(100); //방 100개
				
				System.out.println(vec + " / " +vec1);
				//값추가 : 순서대로 추가된다.
				vec.add("이재현");
				vec.add("정택성");
				vec.add("김정윤");
				vec.add("김건하");
				vec.add("김정윤"); //List는 중복값을 저장할 수 있다.
				vec.add("노진경");
				vec.add("김정윤"); //List는 중복값을 저장할 수 있다.
				vec.add("공선의");
				System.out.println(vec + " / " +vec1);
				//size() : 데이터의 크기
				System.out.println(" vec 크기 "+ vec.size()+" / vec1의 크기 : "+ vec.size());
				
				//배열에 복사
				String[] names = new String[ vec.size()];
				vec.toArray( names );

				//방의 값 삭제
				//인덱스로 삭제 : 특정 인덱스 방의 값이 삭제.
				vec.remove(4);
				System.out.println( vec.size()+"/" + vec );
				//방의 내용으로 삭제 : 
				vec.remove("김정윤"); // L-> R으로 진행하면서 일치하는 가장 첫방의 값만 삭제
				System.out.println( vec.size()+"/" + vec );
				
				for( String name : vec) {
					System.out.println(name);
				}//end for
				
				//모든 방의 값 삭제 :
				vec.clear();
				System.out.println("전체 삭제 후"+ vec.size()+" / "+ vec);
				
				//배열의 값
				for(int i=0 ; i < names.length; i++) {
					System.out.printf("%s\t", names[i]);
				}//end for
				System.out.println();
				
	}// useVector

	public void useLinkedList() {

		//1. 생성
		LinkedList<String> ll = new LinkedList<String>(); //방 0개
		List<String> ll1= new LinkedList<String>(); //방 100개
		
		System.out.println(ll + " / " +ll1);
		//값추가 : 순서대로 추가된다.
		ll.add("이재현");
		ll.add("정택성");
		ll.add("김정윤");
		ll.add("김건하");
		ll.add("김정윤"); //List는 중복값을 저장할 수 있다.
		ll.add("노진경");
		ll.add("김정윤"); //List는 중복값을 저장할 수 있다.
		ll.add("공선의");
		System.out.println(ll + " / " +ll1);
		//size() : 데이터의 크기
		System.out.println(" ll 크기 "+ ll.size()+" / ll1의 크기 : "+ ll.size());
		
		//배열에 복사
		String[] names = new String[ ll.size()];
		ll.toArray( names );

		//방의 값 삭제
		//인덱스로 삭제 : 특정 인덱스 방의 값이 삭제.
		ll.remove(4);
		System.out.println( ll.size()+"/" + ll );
		//방의 내용으로 삭제 : 
		ll.remove("김정윤"); // L-> R으로 진행하면서 일치하는 가장 첫방의 값만 삭제
		System.out.println( ll.size()+"/" + ll );
		
		for( String name : ll) {
			System.out.println(name);
		}//end for
		
		//모든 방의 값 삭제 :
		ll.clear();
		System.out.println("전체 삭제 후"+ ll.size()+" / "+ ll);
		
		//배열의 값
		for(int i=0 ; i < names.length; i++) {
			System.out.printf("%s\t", names[i]);
		}//end for
		System.out.println();
		
		
		
	}//useLinkedList

	public static void main(String[] args) {

		UseList ul = new UseList();
		System.out.println("------------ArrayList----------------");
		ul.useArrayList();
		System.out.println("-----------Vector-----------------");
		ul.useVector();
		System.out.println("-----------LinkedList-----------------");
		ul.useLinkedList();
	}// main

}// class
