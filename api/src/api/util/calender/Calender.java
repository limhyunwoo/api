package api.util.calender;

import java.util.Calendar;

/*
 * java.util.Calender
 * 
 */

public class Calender {
	public static void main(String[] args) {
		String[] months = {"1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��"};
		
		/*
		 * Calendar.getInstance() �� ����������
		 * ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		 * �������� �ν��Ͻ��� �������� �ʵ��� �����Ϸ���
		 * �������� �ڵ��Ǿ���.
		 */
		Calendar date = Calendar.getInstance();
		
		
		System.out.println("ù��° ���� ��¥ : ");
		System.out.print(date.get(Calendar.YEAR)+"��");
		System.out.print((Calendar.MONTH+3)+"��");
		System.out.print(date.get(Calendar.DATE)+"��");
		
		System.out.println();
		
		System.out.println("�ι�° ���� ��¥ : ");
		System.out.print(date.get(Calendar.YEAR)+"��");
		/*
		 * api ���� The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0
		 * ���� �Ǿ������Ƿ� �Ʒ� ��ó�� ���� ���Ҷ��� 1�� ���ؾ� �Ѵ�
		 * ���� 1�� ������ ������ ���� ���� 5���̸� 4���� ��µȴ�.
		 */
		System.out.print((date.get(Calendar.MONTH)+1)+"��");
		System.out.print(date.get(Calendar.DATE)+"��");
		
		System.out.println();
		
		
		System.out.println("�ð� : ");
		System.out.print(date.get(Calendar.HOUR)+"��");
		System.out.print(date.get(Calendar.MINUTE)+"��");
		System.out.print(date.get(Calendar.SECOND)+"��");
		
		System.out.println();
		System.out.println("===����� 1�������� ������� �����===");
		date.add(Calendar.MONTH, 1); //���糯¥��  1���� ���Ѹ��  //**�߿�
		System.out.println("������ ��" + toString(date));
		
		/*
		 * ��µ� ����� : java.util.GregorianCalendar �� ��µǹǷ�
		 * �������̵��� �ʿ��ϴ�.
		 */
		
		System.out.println("===7����===");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		
		/*
		 * ��µ� ����� : java.util.GregorianCalendar �� ��µǹǷ�
		 * �������̵��� �ʿ��ϴ�.
		 */
		
		
		System.out.println("Ư����¥�� ����");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);
		
		System.out.println("������ �ð� ���");
		System.out.println(Calendar.HOUR+"��");
		System.out.println(Calendar.MINUTE+"��");
		System.out.println(Calendar.SECOND+"��");
		
		/*
		 * ������ �ð� ��� ������� 101213 ó�� �Ǿ� �������̵��� �ʿ��ϴ�.
		 */
		
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR) + "��"
				+ date.get(Calendar.MONTH) + "��"	//���� 0���� �����ϹǷ� +1�� ���ؾ� �Ѵ�.
				+ date.get(Calendar.DATE) + "��";}
	
	public static Calendar getNowMonth(Calendar date){
		return null;
		
	}
	
}
