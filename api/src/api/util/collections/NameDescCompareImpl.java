package api.util.collections;

import java.util.Comparator;

public class NameDescCompareImpl implements Comparator<GradeVO>{
	/*
	 * 이름으로 내림차순
	 */
	
	
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		
		return first.getName().compareTo(second.getName());
	}

}
