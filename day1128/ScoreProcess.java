package day1128;

/**
 * 4강의장 학생들의 성적처리 프로그램
 * @author owner
 */
public class ScoreProcess {
	
	public ScoreProcess() {
		String[] nameArr= {"이재찬","정택성","이재현","김건우","공선의"};
		 int[] scoreArr= {89, 76, 99, 64, 50};
		 int totalScore=0;// 총점을 누적 합
		 int maxScore=0;//최고점수
		 int minScore=101;//최하점수
		 int temp=0;//정렬값을 임시로 저장
		 
		 
		 
		System.out.println("번호\t이름\t점수");
		System.out.println("-----------------------------");
		
		for(int i=0; i<nameArr.length ; i++) {
			System.out.printf("%d\t%s\t%d\n",i+1,nameArr[i],scoreArr[i]);
			totalScore += scoreArr[i];//totalScore = totalScore+scoreArr[i];
			
			//최고점수가 현재 순환중인 방의 값보다 작다면
			if(maxScore<scoreArr[i]) {
				//현재 순환중인 방의 값으로 최고점수를 변경해준다.
				maxScore=scoreArr[i];
			}//end if
			//최하점수가 현재 순환중인 방의 값보다 크다면
			if(minScore>scoreArr[i]) {
				//현재 순환중인 방의 값으로 최하점수를 변경해준다.
				minScore=scoreArr[i];
			}//end if
		}//end for
		System.out.println("-----------------------------");
		System.out.println("응시인원 :"+ nameArr.length+"명");
		System.out.printf("총점 [%-5d] 평균[%.2f]\n:",totalScore, 
				(double)totalScore/nameArr.length); //정수/정수는 정수다. 근데 소수점 %.2f는 불가
		//정수를 실수로 소숫점 2자리까지 표현할 수가 없어서 캐스팅해줘야함.
		System.out.println(totalScore/nameArr.length);
		System.out.printf("최고점 [%3d] 최하점 [%d]\n",maxScore, minScore);
		
		//끝방은 안도니까 -1 해줌
		for(int i=0 ; i< scoreArr.length-1 ; i++) {
			for(int j=i+1; j< scoreArr.length ; j++) {
				if(scoreArr[i] < scoreArr[j]) {//앞방의 값이 뒷방보다 작다면
					temp = scoreArr[i];
					scoreArr[i]=scoreArr[j];
					scoreArr[j]=temp;
				}//end if
			}//end for
		}//end for
		
		for(int i=0 ; i < scoreArr.length ; i++) {
			System.out.printf("%-4d", scoreArr[i]);
		}//end for		
	}//ScoreProcess
	


	public static void main(String[] args) {
		new ScoreProcess();
		System.out.println("------------");
		int birth=1994;
		String[] zodiac= {"원숭이,","닭","개","돼지","쥐",
				"소","호랑이","토끼","용","뱀","말","양"};
		System.out.println(zodiac[birth%12]);
		
	
		
	}//main

}//class
