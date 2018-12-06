package day1206;

import day1128.ScoreProcess;

public class RunProcessor {

	public static void main(String[] args) {
		
		
		String str = "������,�̺���,������,���ü�,������,������";
		
		ScoreProcessor sp = new ScoreProcessor(str);
		
			
		int cnt = 0; 
		while(true) {
			cnt = (int)(Math.random()*sp.name.size())+1;
			if(cnt>1) break;
			
		}//while

		sp.printScore(cnt);
		
		
	}//main
	
}//class
