package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{


	private Vector<GradeVO> grades = new Vector<GradeVO>();
	
	
	@Override
	public void Input(GradeVO vo) {
		// TODO Auto-generated method stub
		
	}

	/*
	 *성적표를 출력하는 메소드
	 *vo.toString() 으로 처리 예상하고 있음. 
	 * 
	 */
	
	
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * 학번으로 검색하는 기능을 가진 메소드겠구나!
	 * 
	 */
	
	
	
	@Override
	public String searchGradeHak(String hak) {
//		GradeVO vo = new GradeVO();
		String result="";
//	 	확장된 for 문은 조건식 타입이 (타입 참조변수 : 콜렉션)
		for(GradeVO vo : grades)	//벡터는 size() 로 limit 를 표시한다.
			{if(vo.getHak().equalsIgnoreCase(hak)){
				result =  vo.toString();
			}else{
				result = "조회된 학번에 해당하는 학생이 없습니다.";
			}
			
			}
		return result;
	}

	
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 */
	
	
	

	
	/*
	 종합점수 내림차순으로 정렬시키는 메소드
	 
	 */
	
	
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	/*
	 	종합점수 오름차순
	 */
	
	
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vector<String> SearchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		/*
		 * 백터나 기타 컬렉션 출력을 하게 되면..
		 * 이터레이터 아니면 확장 for 문으로 처리한다.
		 * 왜냐면 확장 for 문은 인덱스를 따지지 않기 때문이다.
		 */
		/*
		 * grades 를 쓸 수 있는 이유는 멤버필드에 선언하여 같은 클래스 내부의 메소드들이 값을 공유하기 때문이다.
		 */
		
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 * 파리미터로 넘어온 이름과 동일한 VO 객체를
				 * 찾아서 String 형태로 벡터에 저장한다.
				 * 즉 vc 는 String 타입이란 것 주의하기.
				 */
				vc.add(vo.toString());
			}
		}
		
		
		
		return vc; //리턴값은 성적정보를 저장한 벡터이다.
	}

	

}
