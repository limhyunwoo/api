package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.lang.system �� ����
 * CurruntTime
 */

public class CurruntTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("cutTime �� " + curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 * new Date() �ÿ� import ������ �ΰ����ε�
		 * ���� java.util.Date�� �����Ѵ�.
		 */
		
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("����ð� : " + nowTime);
		
		
	}

}
