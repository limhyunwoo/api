package api.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorDemo {
	
		public static void main(String[] args) {
			/*
			 * Arraylist list = new ArrayList();
			 * �� ������ Ʋ���� ������ �÷��� Ÿ�Ե���
			 * �������̽� Ÿ������ �����Ѵ�.
			 * List�� import �� �� ��������
			 * ��Ŭ���� ���ȵ� �� ���� �ִ� java.awt.list �� �����ϸ� �ȵ�.
			 * �ι�° util ��Ű�� ���ùٶ�.
			 * ���׸� Ÿ���� ���� ������ Ÿ�԰���� ����� �޽����� ���.
			 */
			
			List <String> list = new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
	
			
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				System.out.println(it.next()+"\t");
				
			}
				
			
		}

}
