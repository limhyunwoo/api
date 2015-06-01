package api.util.collections;

import java.util.Comparator;

public class TotalDescComparaImpl implements Comparator<GradeVO>{

	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		
		
		


		return (first.getTotal() < second.getTotal()) ? 
				-1 : (first.getTotal() > second.getTotal())?
						1 : 0;
	}

}
