package api.util.vector;

import java.util.Stack;
import java.util.Vector;

/*
 * java.util.Vector  �� �޼ҵ���
 * add() �� ���Ϳ� ���� �Ҵ��ϴ� ����� �Ѵ�.
 * 
 */

public class AddDemo {
	public static void main(String[] args) {

		String id = "admin";
		int age = 27;	//����
		Boolean male = true;	//����
		
		Vector<String> vec = new Vector();
		String tom = new String("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		vec.add("���ͷ� ���ڷ� ������ ��ü");
		

		/*
		 * ���ʹ� length() �� ������� �ʰ�
		 * size (0 �� ����� ���ڸ� ǥ���ϴµ� ����մϴ�.
		 * 
		 * �迭������ for loop ��½� get(arr[i]) ������
		 * ���ʹ� elementAt(i)�Դϴ�. ����ϱ�               *************
		 */
		
		for(int i = 0; i < vec.size(); i++){
			System.out.println("������ " + i + "��° ��Ҵ� :  " + vec.elementAt(i));
		}
		
		
		/*
		 	��µ� ����� :
		  	������ 0��° ��Ҵ� :  admin
			������ 1��° ��Ҵ� :  23  ->valueOf�� ��Ʈ������ �ٲ� ���ͷ�
			������ 2��° ��Ҵ� :  false  -> ��������
			������ 3��° ��Ҵ� :  ���ͷ� ���ڷ� ������ ��ü  ->���ͷ� ��ü�� ��밡��

		 */
		
		
	}
	
	
}
