package api.text.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		//임포트 중에서 util date 쓰기
		Date today = new Date();
		
		SimpleDateFormat date01, date02, date03, date04;
		date01 = new SimpleDateFormat("yyyy-MM-dd");	//월 대문자
		date02 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		date03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //분은 소문자
		date04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a"); //a 오전 오후 표시
		
		System.out.println(date01.format(today));
		System.out.println(date02.format(today));
		System.out.println(date03.format(today));
		System.out.println(date04.format(today));
		
		
		
	}

}
