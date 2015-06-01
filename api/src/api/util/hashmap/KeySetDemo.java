package api.util.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetDemo {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		/*
		 * Map �� ���� �Է��ϴ� ��� -> 1������ ����.
		 */
		
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�� ����", new Integer(66));
		map.put("��Ʈ�� �ڹ�", new Integer(10));
		
		/*
		 * GoF  �� ������ �����߿���
		 * Iterator  �����̶�� �Ҹ���
		 * Map ���� ���� �����ϴ� ����ȭ �����̴�.
		 */
		
		/*
		 * �ʿ��� Ű���� �������� ���� ��Ȳ�� ���� ����� ���� 
		 * entry set () ���
		 * �ʿ��� Ű���� ����� ����
		 * keySet() ���
		 * �� ��������� Set �̿�
		 * ������ �÷��ǿ��� �������̽��� Set, List, Map
		 * ������ ��ǥ���ε� Set�� Map �� �ε��� ���� ���, 
		 * ��ȣȣȯ�� �ߵǰ�, Set�� �ߺ��� ���ű���� �־
		 * Map ���� Ű������ �ߺ��� ����� �ϴ� �κа��� ��ġ��
		 * Set �� ���� ���, Ȥ�� Ű+���� ���� ����ϴµ� ���δ�.
		 * ����� ���� Iterator �� ���
		 * Set �� Iterator �� ����ϱ� �����̴�.
		 */
		
		/*
		 * Map���� ���� ����ϴ� ���� 3�����ε�...
		 * ù��°�� Ű + Value ���·� �Բ� ����ϴ� ���
		 * entrySet() + Iterator ���� ���
		 */
		
		
		Set set  = map.entrySet();	//��Ʈ������ ����� set���� �Ѱ��ش�. �������̽� Ÿ���� ��ü.
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e= (Map.Entry) it.next(); 
			System.out.println("������ : " + e.getKey() + ", ���� : " + e.getValue());
		}
		

		/*
		 * Map���� ���� ����ϴ� ���� 3�����ε�...
		 * �ι�°�� Ű�� ����ϴ� ���
		 * keySet() ���� ���
		 */
	
			set = map.keySet();
			System.out.println("������ ��� : " + set);
			
			/*
			 * Map���� ���� ����ϴ� ���� 3�����ε�...
			 * ����°�� ������ ����ϴ� ���
			 * Collection ���
		
			 * �ݷ��ǿ��� ��Ŭ���� ���� �� java.util.Collection ����
			 */
			
			Collection values = map.values();			//���� List &Set �� ������ �ٸ��� ������ ĳ���ý� ������ �ս��� �Ͼ �� ����.
														//�׷��� ���� ������ �ݷ������� �ø� �Ŀ� �����͸� �ξ�ִ´�.
			it = values.iterator();
			
			int total = 0;
			
			while (it.hasNext()) {				//hasnext �������� ������ ture ������ false ����
				Integer i = (Integer )it.next();
				total += i.intValue();
				
	
			}
			System.out.println("���� : " + total);
			//set �� List �迭 Ŭ����ó�� ����� ������ size() �� �Ѵ�. 
			
			System.out.println("��� : " + total/set.size());
			
			//Collections.max �� �ִ밪, .min �� �ּҰ��� �����Ѵ�.
			System.out.println("1�� : " + Collections.max(values));
			System.out.println("�õ� : " + Collections.min(values));

			
		}

		
		
		
	}
	


