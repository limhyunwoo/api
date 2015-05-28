package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.lang.system 에 속한
 * CurruntTime
 */

public class CurruntTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("cutTime 은 " + curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 * new Date() 시에 import 제안이 두가지인데
		 * 그중 java.util.Date를 선택한다.
		 */
		
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("현재시간 : " + nowTime);
		
		
	}

}
