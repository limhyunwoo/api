package api.util.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ���׸�(generic)
 * - �÷����� ������ ���
 * - ��� ������ ������ Ÿ���� �ٷ� �� �ֵ��� �Ϲ�ȭ�� Ÿ��
 * -	�Ű������� Ŭ������ �޼ҵ带 �ۼ��ϴ� ���
 * 		�÷��� Ŭ�������� Ÿ�� �Ķ���ͷ� ���Ǵ� ���ڴ� �ٸ� ������
 * 		ȥ���� ���ϱ� ���� �Ϲ������� ������ ���� ǥ���Ѵ�.
 * 		E : Element Set<E> set
 * 		T : Type Set<T> set
 * 		K : Key Map<K, V>
 */

/*
 * ���׸��� ���������� Ÿ�Կ� ���ؼ��� ����� �� �ִ�.
 * �⺻ ������ Ÿ�Կ����� ����� �� ����.
 * Ŭ������ ������ ���� ������ Ÿ���� �������� �ʰ�
 * �ν��Ͻ��� ������ �� ������ Ÿ���� �����ϴ� ���
 */

public class GenericSyntax {
	public <E> Object test(Set<E> map){	//�� Ÿ���� ��簣�� �Ķ���� Ÿ�԰� Ÿ���� ���߰ڴ�.
		return null;
	}
	
	public <K, V> void test2(){
		Map<K, V> map = new HashMap<K, V>();
	}
	
	
	
}
