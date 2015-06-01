package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
	GradeVO g1 = new GradeVO("2011", "홍길동", 90,70,20);
	GradeVO g2 = new GradeVO("2012", "김길동", 90,40,20);
	GradeVO g3 = new GradeVO("2013", "장길동", 90,10,20);
	GradeVO g4 = new GradeVO("2014", "문길동", 90,20,20);
	GradeVO g5 = new GradeVO("2015", "혹길동", 90,30,20);
		
	grades.add(g1);
	grades.add(g2);
	grades.add(g3);
	grades.add(g4);
	grades.add(g5);
	/*
	 * anonymous 생성자 처리 : 단 한번만 쓰고 버리겠다.
	 */
	
	grades.add(new GradeVO("2014","최길동",90,90,90));
	
	
	

	System.out.println("오름차순");
	Collections.sort(grades,new NameAscCompareImpl());
	for(GradeVO grade : grades){
//	System.out.println(grade);
	}
	Collections.sort(grades,new NameDescCompareImpl());
	for(GradeVO grade : grades){
//	System.out.println(grade);
	}
	
	Collections.sort(grades,new TotalAscComparaImpl());
	for(GradeVO grade : grades){
//	System.out.println(grade);
	}
	
	Collections.sort(grades,new TotalDescComparaImpl());
	for(GradeVO grade : grades){
	System.out.println(grade);
	}
	
	
}
	
	
	
	
}


