package api.util.hashmap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("���̵� �Է��� �ּ���.");
//		String id = scanner.next();
//		System.out.println("�н����带 �Է��� �ּ���.");
//		String password = scanner.next();
//		System.out.println("�̸��� �Է��� �ּ���.");
//		String name = scanner.next();
//		System.out.println("���̸� �Է��� �ּ���.");
//		int age = scanner.nextInt();
//		System.out.println("�ּҸ� �Է��� �ּ���.");
//		String addr = scanner.next();
//		
		
		/*
		 * ��ü�� �����ؼ� �ϼ����� �ּ���.
		 * ��ü�� �����ϴ� ������ �� �Ѱ���... ��ü�� �ҷ����� �޼ҵ带 Ȱ���ϱ� ���ؼ�
		 * 
		 * 
		 */
		MemberService service = new MemberServiceImpl();
String		id = "hong";
String		password = "pass";
String		name = "ȫ�浿";
int			age = 20;
String		addr = "�����";
		
				
		service.join(id, password, name, age, addr);
		
		System.out.println("ȸ�������� �Ǿ����ϴ�.");
		System.out.println("�α����� ���ּ���.");
		
		System.out.println("ID�� �Է��� �ּ���");
//		id = scanner.next();
		id ="hong";
		System.out.println("password�� �Է��� �ּ���");
//		password = scanner.next();
		password ="pass";
		
		/*
		 * ��ü�� ȣ���ϴ� �޼ҵ�� �ϼ������ּ���.
		 */
		
		service.login(id, password);
		
	
		
		
	}
	

}
