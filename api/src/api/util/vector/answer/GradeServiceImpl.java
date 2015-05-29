package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {

	
	GradeVO grade = new GradeVO();
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	
	/*
	 * �޼ҵ帶�� �����ϴ� �ټ��� ��(�л��� �������̴�) �� �ʿ��ѵ�,
	 * �ѱ����� ������ �÷����� �ʵ忡 �����ؾ߰ڴ�.
	 * �ʵ忡 �����ؾ� �޼ҵ���� ���� ������ �� �����ϱ�...
	 * 
	 */
	
	
	
	
	
	
	/*1.-input 	 �л����� ������ �Է¹޴� ���ΰ�. �׷� �Է¹޾Ƽ�
	 * ������ ������ �ʿ��ϰڴµ�, �迭�� ���� ������ �����ϴ� �����ε� �ѹ� ����
	 * �ϸ� �߰��� �ø� �� ������ �������� Ȯ���ϴ� �÷����� �����ؾ߰ڱ�.
	 * �׷��� ���� ���� �ƴ� �� ���ͻ��̴� ���Ϳ� �־����.
	 * 
	 */
	@Override
	public void Input(GradeVO vo) {
		vc.add(vo);
		
	}
	
	/*
	 2.-	print  ����ϴ� ���ΰ�? �׷� vo ��ü�� tostring () �����;�¡
	 */

	@Override
	public void print() {
		System.out.println(vc.toString());
	
		
	}
	
	/*
	 * 3.searchGradeHak �й����� ������ ��ȸ�ϴ� ����̱�. �й��� ���� �� �л����Ը� �����ϹǷ�
	 * ���ϰ��� string ���״� ������ for loop ���ο� if �� �غ��߰ڴ�.
	 */

	@Override
	public String searchGradeHak(String hak) {
		
		String msg = ""; //���������ϱ� �ʱ�ȭ
		
		for(int i = 0; i < vc.size(); i++){
		
			/*
			 * myhak�� ���Ϳ��� i��° ��ҿ��� �й��� �����Ͽ� ���� ����... Ÿ���� String
			 */
			
			String myhak =vc.elementAt(i).getHak(); 
			
			/*
			 * �Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ�
			 * myhak�� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
			 */
			System.out.println("�Ķ���� ���� ; " + hak);
			System.out.println("�������� ; " + myhak);
			
			/*
			 * ������ؼ� ���ϱ�
			 * �Ķ���� ���� : 1111
			 * �������� : ��浿 ��
			 * 
			 */
			
			if(hak.equalsIgnoreCase(myhak)){
				msg = hak;
				break;
			}else{msg = "��ȸ�ϴ� �й��� �����ϴ�.";
				
			}}
	
			return msg;
	}
	
	
	/*
	 4. searchGradeName ()
	 * �̸����� ������ȸ�ε� ���ϰ��� ������ ���� ����
	 * �������� String  �� ó���ϰԲ� ����Ǿ���
	 * ���ϰ��� �ϳ��� �������� for loop if �����ۿ���
	 * ���Ϳ�� ��·����� ������ �װ� ��߰ڴ�.
	 */

		@Override
		public Vector<String> SearchGradeByName(String name) {
			Vector<String> local = new Vector<String>();
	

			String msg = ""; //���������ϱ� �ʱ�ȭ
			
			for(int i = 0; i < vc.size(); i++){
				/*
				 * myhak�� ���Ϳ��� i��° ��ҿ��� �й��� �����Ͽ� ���� ����... Ÿ���� String
				 */
				String myhak =vc.elementAt(i).getHak(); 
			/*
				 * �Ķ���ͷ� �޾ƿ� hak�� ���Ϳ� ����ִ�
				 * myhak�� ��ġ�ϴ��� ���θ� üũ�ϴ� ����
				 */

				if(name.equalsIgnoreCase(vc.elementAt(i).getHak())){
					local.add(name);
					
				}else{local.add("");
					
				}
		
			
			
			
			}
			return null;
		}
	
	/*
	 * 
	 * 			5.descGradeTotal
	 * 	���������ΰ�����
	 * Collections.sort �� ���� �ȴٴµ� ���� �׶� ó���ؾ߰ڴ�.
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 *  6.ascGradeTotal
	 * ���������̸� Arrays.sort �� ���� �ǰڱ�.
	 */

	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	

}
