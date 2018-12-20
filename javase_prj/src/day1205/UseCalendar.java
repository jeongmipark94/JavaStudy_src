package day1205;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Calendar : 단일 날짜 정보를 얻을 때.
 * 
 * @author owner
 */
public class UseCalendar {

	public UseCalendar() {
		//Calendar 클래스의 인스턴스 얻기
		//1. getInstance사용
//	Calendar cal= new Calenda();//추상 클래스여서 인스턴스 화 할 수 없다.
	Calendar cal = Calendar.getInstance();
	//2. is a 관계
	Calendar cal1 = new GregorianCalendar();
	//3. 자식 만으로 객체
	GregorianCalendar gc= new GregorianCalendar();
	System.out.println(cal);
	System.out.println(cal1);
	System.out.println(gc);
	
	//상수를 사용하면 가독성 향상.
	int year= cal.get(Calendar.YEAR);
	System.out.println( year );
//	자바에서는 월의 시작이 0월
	int month=cal.get(Calendar.MONTH)+1;
//	int day=cal.get(Calendar.DATE);
	int day=cal.get(Calendar.DAY_OF_MONTH);
	int day_of_year =cal.get( Calendar.DAY_OF_YEAR);
	//요일 : 일-1,월-2,화-3,수-4,목-5,금-6,토-7
	int day_of_week =cal.get( Calendar.DAY_OF_WEEK);
	
	
	System.out.printf("%d-%d-%d 오늘은 올해에 %d번쨰 날\n",year,month,day, 
			day_of_year);
	String week= "";
//	switch(day_of_week) {
//	case Calendar.SUNDAY :		
//			week="일요일";break;
//	case Calendar.MONDAY	:
//		week="월요일";		break;	
//	case Calendar.TUESDAY:
//		week="화요일";	break;	
//	case Calendar.WEDNESDAY:
//		week="수요일";		break	;
//	case	Calendar.THURSDAY:
//		week="목요일";	break;
//	case Calendar.FRIDAY:
//	week="금요일";
//		break;
//	case Calendar.SATURDAY:		
//		week ="토요일";
//		break;	
	
	
	String[] weekTitle= {"일","월","화","수","목","금","토"};
////	}//ene swith
	System.out.printf("%d요일 %s\n",day_of_week, weekTitle[day_of_week-1]);
	int am_pm=cal.get(Calendar.AM_PM);
	switch(am_pm){
		case Calendar.AM://0을 의미
			
			break;
			
		case Calendar.PM:
			
			break	;
	}
	System.out.printf("%d, %s\n",am_pm, am_pm ==Calendar.AM?"오전":"오후");
	
	int hour =cal.get(Calendar.HOUR);
	int hour24=cal.get(Calendar.HOUR_OF_DAY);
	int minute =cal.get(Calendar.MINUTE);
	int  second=cal.get(Calendar.SECOND);
	System.out.printf("%d(%d):%d:%d시\n", hour, hour24, minute,second);
	
	System.out.println("-------------------------------------------------");
	System.out.printf("설정 전 %d-%d-%d %s요일\n",
			cal1.get(Calendar.YEAR),cal1.get(Calendar.MONTH)+1,
			cal1.get(Calendar.DAY_OF_MONTH),
			"일,월,화,수,목,금,토".split(",")[cal1.get(Calendar.DAY_OF_WEEK)-1]);	
			
	//년
	cal1.set(Calendar.YEAR, 2019);//2019-12-06
	//월 : 사람이 생각하는 월보다 1적게 설정
	cal1.set(Calendar.MONTH, 4);//2019-05-06
	//일 : 해당월에 존재하지않는 다음 일자가 설정되면 다음달 1일로 설정
	cal1.set(Calendar.DAY_OF_MONTH, 15);//2019-05-15
	
			System.out.printf("설정 후 %d-%d-%d %s요일",
					cal1.get(Calendar.YEAR),cal1.get(Calendar.MONTH)+1,
					cal1.get(Calendar.DAY_OF_MONTH),
					"일,월,화,수,목,금,토".split(",")[cal1.get(Calendar.DAY_OF_WEEK)-1]);	
	
		System.out.println("이번달의 마지막 날:" + cal.getActualMaximum(Calendar.DATE));
			
	}// UseCalendar

	public static void main(String[] args) {
		new UseCalendar();

	}// main

}// class
