package api.util.vector;

import java.util.Vector;

public interface GradeService {
	
	
	
	public void Input(GradeVO vo);
	public void print();
	public String searchGradeHak(String hak);
	public Vector<String> SearchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
		

	

}
