package api.util.calender;

import java.util.Calendar;

/*
 * java.util.Calender
 * 
 */

public class Calender {
	public static void main(String[] args) {
		String[] months = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
		
		/*
		 * Calendar.getInstance() 는 내부적으로
		 * 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식이다.
		 * 여러개의 인스턴스를 생성하지 않도록 방지하려는
		 * 목적에서 코딩되었다.
		 */
		Calendar date = Calendar.getInstance();
		
		
		System.out.println("첫번째 현재 날짜 : ");
		System.out.print(date.get(Calendar.YEAR)+"년");
		System.out.print((Calendar.MONTH+3)+"월");
		System.out.print(date.get(Calendar.DATE)+"일");
		
		System.out.println();
		
		System.out.println("두번째 현재 날짜 : ");
		System.out.print(date.get(Calendar.YEAR)+"년");
		/*
		 * api 에는 The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0
		 * 으로 되어있으므로 아래 식처럼 월을 구할때만 1을 더해야 한다
		 * 만약 1을 더하지 않으면 현재 월이 5월이면 4월로 출력된다.
		 */
		System.out.print((date.get(Calendar.MONTH)+1)+"월");
		System.out.print(date.get(Calendar.DATE)+"일");
		
		System.out.println();
		
		
		System.out.println("시간 : ");
		System.out.print(date.get(Calendar.HOUR)+"시");
		System.out.print(date.get(Calendar.MINUTE)+"분");
		System.out.print(date.get(Calendar.SECOND)+"초");
		
		System.out.println();
		System.out.println("===계산은 1달후지만 결과값은 현재달===");
		date.add(Calendar.MONTH, 1); //현재날짜에  1일을 더한모습  //**중요
		System.out.println("현재의 달" + toString(date));
		
		/*
		 * 출력된 결과값 : java.util.GregorianCalendar 이 출력되므로
		 * 오버라이딩이 필요하다.
		 */
		
		System.out.println("===7일전===");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		
		/*
		 * 출력된 결과값 : java.util.GregorianCalendar 이 출력되므로
		 * 오버라이딩이 필요하다.
		 */
		
		
		System.out.println("특정날짜로 셋팅");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);
		
		System.out.println("수정된 시간 출력");
		System.out.println(Calendar.HOUR+"시");
		System.out.println(Calendar.MINUTE+"분");
		System.out.println(Calendar.SECOND+"초");
		
		/*
		 * 수정된 시간 출력 결과값이 101213 처럼 되어 오버라이딩이 필요하다.
		 */
		
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "년"
				+ date.get(Calendar.MONTH) + "월"	//월은 0부터 시작하므로 +1을 취해야 한다.
				+ date.get(Calendar.DATE) + "일";}
	
	public static Calendar getNowMonth(Calendar date){
		return null;
		
	}
	
}
