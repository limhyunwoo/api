package api.util.vector;

import java.util.Vector;

/*
 * java.util.Vector �� �޼ҵ���
 * addElement() �� �⺻������ add() �� �����ϴ�.
 * 
 */

public class AddElementDemo {
	public static void main(String[] args) {
		String [] heros = {"iron","thor","hulk","hawk"};
		String [][] star = {{"1","2","3"},{"4","5","6"}};
		Vector<String> stars = new Vector<String>();
		Vector<String> avengers = new Vector<String>();
		//���ʹ� �迭�� ��Ҹ� ���� addElements()
		for(int i = 0; i <2; i++){
			avengers.addElement(heros[i]);
//			for (int s = 0; s <3; s++){
//			stars.addElement(star[i][s]);
//			}
		}
	
		//�丣�� �����ϴ� �� üũ contains() �� ����Ѵ�.
		String thor = "thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor)+1;
			System.out.println("�丣�� " + idx + "��°�� �ֽ��ϴ�.");
			
		}else{
			System.out.println("�丣�� �����ϴ�.");
		}
		
		/*
		 * ù��° ���(���) ����
		 * ������ �ε����� 0���� �����Ѵ�. 0�� �� ù��° ���
		 * 
		 */
		avengers.removeElementAt(0);
		System.out.println("���� �� ��� ��ġ �ε��� ��ȭ");
		for(int j = 0; j<avengers.size(); j++){
			System.out.println("Avengers �� " + (j+1) + "��° �����" + avengers.elementAt(j));
		}
		
		
		
	}
}
