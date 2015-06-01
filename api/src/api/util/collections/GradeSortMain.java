package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
	GradeVO g1 = new GradeVO("2011", "ȫ�浿", 90,70,20);
	GradeVO g2 = new GradeVO("2012", "��浿", 90,40,20);
	GradeVO g3 = new GradeVO("2013", "��浿", 90,10,20);
	GradeVO g4 = new GradeVO("2014", "���浿", 90,20,20);
	GradeVO g5 = new GradeVO("2015", "Ȥ�浿", 90,30,20);
		
	grades.add(g1);
	grades.add(g2);
	grades.add(g3);
	grades.add(g4);
	grades.add(g5);
	/*
	 * anonymous ������ ó�� : �� �ѹ��� ���� �����ڴ�.
	 */
	
	grades.add(new GradeVO("2014","�ֱ浿",90,90,90));
	
	
	

	System.out.println("��������");
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


