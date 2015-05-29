package api.util.stringtokenlizer;

import java.util.StringTokenizer;

public class HasMoreTokensDemo {
	
		public static void main(String[] args) {
			/*
			 * ������ Ȥ�� ���� ��� ������ token �̶�� �ϴµ�
			 * Ư�� �����ڸ� �����ϸ� �װ��� ��������
			 * �߶󳻴� Ŭ���� �� �޼ҵ�
			 */
			String date = "2015/05/24";
			StringTokenizer tok = new StringTokenizer(date,"/");
			
			/*
			 * �� ������ �Ķ���� �� �տ� ���� String ��� ��ü,
			 * ���� ���� ������
			 */
			
			int idx = 0;
			
			/*
			 * whi ģ �� ��Ŭ���� ���� �� with enumeration
			 * ���� ���� �� ����
			 * �׸��� ���� hasMoreElements() ����
			 * hasMoreTokens() �θ� ����
			 * 
			 */
			
			while (tok.hasMoreElements()) {
				String token = tok.nextToken();
				System.out.println("["+idx+"] : " + token);
				idx++;
				
			}
			
			
		}
	

}
