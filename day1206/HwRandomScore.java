package day1206;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HwRandomScore {
		
	
		List<String> name = new ArrayList<>();
		List<Integer> score = new ArrayList<>();
		
		public HwRandomScore(String str) {
			
			String[] name = str.split(",");
			Random r = new Random();
			
			for(int i=0; i<name.length; i++) {
				this.name.add(name[i]);
				score.add(r.nextInt(101));
			
			}
			
		}//생성자 이름 점수 초기화
		
//		List<Integer> score = new ArrayList<Integer>();
		public void printScore(int cnt) {
			int sumOfScore = 0;
			Random r = new Random();
			int[] tmpIdx =new int[name.size()];//?
			
			//같은 사람이 중복 출력됨, 랜덤값을 뽑는데 중복된 idx가 나옴
			for(int i=0; i<tmpIdx.length; i++) {
				tmpIdx[i] = r.nextInt(name.size());
					for(int j=0; j<i; j++) {
						if(tmpIdx[i] == tmpIdx[j]) {
							i--;
							break;
						}
					}
				System.out.println(name.get(tmpIdx[i])+" "+ score.get(tmpIdx[i]));
				sumOfScore += score.get(tmpIdx[i]);
			
			}

				System.out.println(" 총점 " + sumOfScore);
		}
	
		
		public void scoremaker() {
			
			
		}//scoremaker
		
		public void scoreprint() {
			
			
		}//scoreprint
		
		
		 

		/*1. 아래의 데이터를 처리하는 프로그램을 작성하세요.
		  백인재,이봉현,이재찬,정택성,이재현,김정운 의 데이터가 존재하고,
		 점수는 0~100점 사이로 발생할수있습니다.

		 프로그램이 실행되면 위의 사람중에 2명이상 성적처리 대상자 이고 
		 n명의 이름과 점수를 저장하여 출력하는 일을 하는 프로그램 작성.
		 중복이름은 들어갈 수 없다.
		출력 예 )
		 이재찬 89
		 정택성 77
		 김정운 90
		  총점   xx점
		  
		난수와 리스트, 
		성적처리 메소드,
		성적 출력 메소드*/
	
	
	
	

	public static void main(String[] args) {
		HwRandomScore h1 = new HwRandomScore(str);
		
//		String[] names = new String [6];
		String str = "백인재,이봉현,이재찬,정택성,이재현,김정운";
		
		int cnt =0; //출력할 사람 수 (랜덤하게 2~)
		
		while(true) {
			cnt =(int)(Math.random()*h1.name.size())+1;
			if(cnt >1) break;
		}
		h1.printScore(cnt);
		
		

	}//main

}//class
