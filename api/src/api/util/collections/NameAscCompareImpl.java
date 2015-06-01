package api.util.collections;

import java.util.Comparator;

public class NameAscCompareImpl implements Comparator<GradeVO> {

	/*
	 * 이름으로 오름차순
	 * ㄱ,ㄴ,ㄷ
	 * a,b,c,
	 */
	
	@Override
	public int compare(GradeVO first, GradeVO second) {
	
		return first.getName().compareTo(second.getName());
	}
	/*
	 * 뒤의 파라미터에 있는 앞글자와 비교해서 
	 * 앞글자가 순서가 빠르다면 그 글자부터 리턴해라.
	 */
	
	

}
