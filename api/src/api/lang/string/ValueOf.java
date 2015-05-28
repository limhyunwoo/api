package api.lang.string;

/*
 * java.lang.String
 * toUpperCase() �� �ش� ���ڿ��� ���� �빮�ڷ� ��ȯ
 * tolowerCase() �� �ش� ���ڿ��� ���� �ҹ��ڷ� ��ȯ
 * valueOf() �� �ٸ� Ÿ���� ��� ���ڿ��� ��ȯ
 * 
 */


public class ValueOf {
	public static void main(String[] args) {
		
		String str = "Hello JaVa";
		String msg;
		System.out.println("�׽�Ʈ�� ���� : " + str);
		msg = str.toUpperCase();
		System.out.println(msg);
		msg = str.toLowerCase();
		System.out.println(msg);
		
		//������ valueOf() �� �Ķ���� ���� int ���̴�.
		//Integer.paraseInt() �� ���� �ʰ�
		//String �� ����ƽ �޼ҵ��� ValueOf()
		//�� ȣ���ϸ� �ٷ� ���ڿ��� ��ȯ�ȴ�.
		msg = String.valueOf(str.length());			//DB�� �������� �׳� �� String ������ �ٲ�����°� ����. �������� ����.
		System.out.println("valueOf �� ��� : " + msg);
	
					
	
	
	
	}
	

}
