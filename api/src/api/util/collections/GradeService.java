package api.util.collections;

import java.util.Vector;





public interface GradeService {
	
	
	//vo ��ü�� ���Ϳ� �����ϴ� ���

	
	public void Input(GradeVO vo);
	public void print();
	public String searchGradeHak(String hak);
	//�̸��� �̿��� ��������ε� �������� ���̽����� Ŀ���ϱ� ����
	//���ϰ��� ���ͷ� �޾ƾ��Ѵ�.
	
	
	public Vector<String> SearchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();


		

	

}
