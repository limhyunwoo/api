package api.util.collections;

import java.util.Vector;





public interface GradeService {
	
	
	//vo 객체를 벡터에 저장하는 기능

	
	public void Input(GradeVO vo);
	public void print();
	public String searchGradeHak(String hak);
	//이름을 이용한 성적출력인데 동명이인 케이스까지 커버하기 위해
	//리턴값을 벡터로 받아야한다.
	
	
	public Vector<String> SearchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();


		

	

}
