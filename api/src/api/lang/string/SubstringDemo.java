package api.lang.string;

/*
 * java.lang.String �� �ִ�
 * substring() �޼ҵ��
 * ������ġ(begin) ���� ������(end) ���� ���ڿ� ����
 * begin <= x < end
 */

public class SubstringDemo {
	public static void main(String[] args) {
		//�ε����� 0���� �����ϸ� ���鵵 1�� ó���Ѵ�.
		System.out.println("�Ķ���Ͱ� �Ѱ��϶� : " + "Hello Java".substring(6));
		//6������ 7��° ������ j���� 9��° �̸� ������ a
		//�׷��� ja�� ����
		System.out.println("�Ķ���Ͱ� �ΰ��϶� : " + "Hello Java".substring(6,8));
	}

}
