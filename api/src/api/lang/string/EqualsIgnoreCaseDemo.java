package api.lang.string;

public class EqualsIgnoreCaseDemo {
		public static void main(String[] args) {
			System.out.println(
			//�񱳴���� ��ҹ��� ���������� ���Ѵ�.
					"Hello".equals("hello") ? "�����ϴ�" : "�ٸ��ϴ�"
				
					);
			//�񱳴���� ��ҹ��� ���̸� �����Ѵ�.
			//��ҹ��� ������ ����.
			System.out.println(
					"Hello".equalsIgnoreCase("hello") ? "�����ϴ�" : "�ٸ��ϴ�"
					);
			
			
			
		}

}
