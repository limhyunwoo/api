package api.util.vector.answer;

import java.util.Vector;

import api.util.vector.GradeVO;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		
		//������ setter ����⺸��
		//�����ڷ� �� ���� ����� �ִ�

		GradeVO g1 = new GradeVO("1111","ȫ�浿",70,54,90);
		GradeVO g2 = new GradeVO("1112","ȫ�浿",32,80,54);
		GradeVO g3 = new GradeVO("1113","������",65,80,90);
		GradeVO g4 = new GradeVO("1114","�귷��",70,32,42);
		GradeVO g5 = new GradeVO("1115","��Ŀ��",55,80,21);
	
//		service.Input(g1);
		/*
		 * ����ǥ [ �й� = , �̸� = , ���� = 0, ���� = 0, ���� = 0, ���� = 0]
		 * �� ��������..
		 * ����� ���ϱ�  grade ����� �ϴµ�, ���Ϳ� ����ִ� �༮�� �ƴ϶�
		 * �׳� �� ���̴���
		 * �׷� ���Ϳ� �ִ� grade  �� �������� ���?
		 * grade ��ſ� vc.toString �ؾ߰���
	
		 */
		String dummy = service.searchGradeHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.SearchGradeByName("ȫ�浿");
		System.out.println(temp.toString());
		
		
	}

}
