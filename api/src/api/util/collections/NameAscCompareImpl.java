package api.util.collections;

import java.util.Comparator;

public class NameAscCompareImpl implements Comparator<GradeVO> {

	/*
	 * �̸����� ��������
	 * ��,��,��
	 * a,b,c,
	 */
	
	@Override
	public int compare(GradeVO first, GradeVO second) {
	
		return first.getName().compareTo(second.getName());
	}
	/*
	 * ���� �Ķ���Ϳ� �ִ� �ձ��ڿ� ���ؼ� 
	 * �ձ��ڰ� ������ �����ٸ� �� ���ں��� �����ض�.
	 */
	
	

}
