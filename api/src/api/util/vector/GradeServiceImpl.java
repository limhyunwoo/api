package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{


	private Vector<GradeVO> grades = new Vector<GradeVO>();
	
	
	@Override
	public void Input(GradeVO vo) {
		// TODO Auto-generated method stub
		
	}

	/*
	 *����ǥ�� ����ϴ� �޼ҵ�
	 *vo.toString() ���� ó�� �����ϰ� ����. 
	 * 
	 */
	
	
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * �й����� �˻��ϴ� ����� ���� �޼ҵ�ڱ���!
	 * 
	 */
	
	
	
	@Override
	public String searchGradeHak(String hak) {
//		GradeVO vo = new GradeVO();
		String result="";
//	 	Ȯ��� for ���� ���ǽ� Ÿ���� (Ÿ�� �������� : �ݷ���)
		for(GradeVO vo : grades)	//���ʹ� size() �� limit �� ǥ���Ѵ�.
			{if(vo.getHak().equalsIgnoreCase(hak)){
				result =  vo.toString();
			}else{
				result = "��ȸ�� �й��� �ش��ϴ� �л��� �����ϴ�.";
			}
			
			}
		return result;
	}

	
	/*
	 * �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	 */
	
	
	

	
	/*
	 �������� ������������ ���Ľ�Ű�� �޼ҵ�
	 
	 */
	
	
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	/*
	 	�������� ��������
	 */
	
	
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vector<String> SearchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		/*
		 * ���ͳ� ��Ÿ �÷��� ����� �ϰ� �Ǹ�..
		 * ���ͷ����� �ƴϸ� Ȯ�� for ������ ó���Ѵ�.
		 * �ֳĸ� Ȯ�� for ���� �ε����� ������ �ʱ� �����̴�.
		 */
		/*
		 * grades �� �� �� �ִ� ������ ����ʵ忡 �����Ͽ� ���� Ŭ���� ������ �޼ҵ���� ���� �����ϱ� �����̴�.
		 */
		
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 * �ĸ����ͷ� �Ѿ�� �̸��� ������ VO ��ü��
				 * ã�Ƽ� String ���·� ���Ϳ� �����Ѵ�.
				 * �� vc �� String Ÿ���̶� �� �����ϱ�.
				 */
				vc.add(vo.toString());
			}
		}
		
		
		
		return vc; //���ϰ��� ���������� ������ �����̴�.
	}

	

}
