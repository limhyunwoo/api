package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {

	
	GradeVO grade = new GradeVO();
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	
	/*
	 * 메소드마다 공유하는 다수의 값(학생이 여러명이니) 이 필요한데,
	 * 한군데에 저장할 컬렉션을 필드에 선언해야겠다.
	 * 필드에 선언해야 메소드들이 값을 공유할 수 있으니까...
	 * 
	 */
	
	
	
	
	
	
	/*1.-input 	 학생별로 성적을 입력받는 것인가. 그럼 입력받아서
	 * 저장할 공간이 필요하겠는데, 배열이 다중 변수를 저장하는 공간인데 한번 생성
	 * 하면 추가로 늘릴 수 없으니 동적으로 확장하는 컬렉션을 선택해야겠군.
	 * 그런데 지금 내가 아는 건 벡터뿐이니 벡터에 넣어야지.
	 * 
	 */
	@Override
	public void Input(GradeVO vo) {
		vc.add(vo);
		
	}
	
	/*
	 2.-	print  출력하는 것인가? 그럼 vo 객체의 tostring () 가져와야징
	 */

	@Override
	public void print() {
		System.out.println(vc.toString());
	
		
	}
	
	/*
	 * 3.searchGradeHak 학번으로 성적을 조회하는 기능이군. 학번은 오직 한 학생에게만 존재하므로
	 * 리턴같이 string 할테니 벡터의 for loop 내부에 if 를 해봐야겠다.
	 */

	@Override
	public String searchGradeHak(String hak) {
		
		String msg = ""; //지역변수니까 초기화
		
		for(int i = 0; i < vc.size(); i++){
		
			/*
			 * myhak은 벡터에서 i번째 요소에서 학번을 리턴하여 닮은 변수... 타입은 String
			 */
			
			String myhak =vc.elementAt(i).getHak(); 
			
			/*
			 * 파라미터로 받아온 hak과 벡터에 담겨있는
			 * myhak이 일치하는지 여부를 체크하는 로직
			 */
			System.out.println("파라미터 학점 ; " + hak);
			System.out.println("마이학점 ; " + myhak);
			
			/*
			 * 디버깅해서 보니까
			 * 파라미터 학점 : 1111
			 * 마이학점 : 김길동 됨
			 * 
			 */
			
			if(hak.equalsIgnoreCase(myhak)){
				msg = hak;
				break;
			}else{msg = "조회하는 학번이 없습니다.";
				
			}}
	
			return msg;
	}
	
	
	/*
	 4. searchGradeName ()
	 * 이름으로 성적조회인데 리턴값이 벡터인 것을 보니
	 * 복수개의 String  을 처리하게끔 설계되었군
	 * 리턴값이 하나든 여러개든 for loop if 구성밖에는
	 * 벡터요소 출력로직이 없으니 그걸 써야겠다.
	 */

		@Override
		public Vector<String> SearchGradeByName(String name) {
			Vector<String> local = new Vector<String>();
	

			String msg = ""; //지역변수니까 초기화
			
			for(int i = 0; i < vc.size(); i++){
				/*
				 * myhak은 벡터에서 i번째 요소에서 학번을 리턴하여 닮은 변수... 타입은 String
				 */
				String myhak =vc.elementAt(i).getHak(); 
			/*
				 * 파라미터로 받아온 hak과 벡터에 담겨있는
				 * myhak이 일치하는지 여부를 체크하는 로직
				 */

				if(name.equalsIgnoreCase(vc.elementAt(i).getHak())){
					local.add(name);
					
				}else{local.add("");
					
				}
		
			
			
			
			}
			return null;
		}
	
	/*
	 * 
	 * 			5.descGradeTotal
	 * 	내림차순인가보당
	 * Collections.sort 를 쓰면 된다는데 배우면 그때 처리해야겠다.
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 *  6.ascGradeTotal
	 * 오름차순이면 Arrays.sort 를 쓰면 되겠군.
	 */

	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	

}
