package api.util.vector.answer;

import java.util.Vector;

import api.util.vector.GradeVO;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		
		//일일이 setter 만들기보단
		//생성자로 한 번에 만들수 있다

		GradeVO g1 = new GradeVO("1111","홍길동",70,54,90);
		GradeVO g2 = new GradeVO("1112","홍길동",32,80,54);
		GradeVO g3 = new GradeVO("1113","르으느",65,80,90);
		GradeVO g4 = new GradeVO("1114","브렁무",70,32,42);
		GradeVO g5 = new GradeVO("1115","어커나",55,80,21);
	
//		service.Input(g1);
		/*
		 * 성적표 [ 학번 = , 이름 = , 국어 = 0, 영어 = 0, 수학 = 0, 총점 = 0]
		 * 이 나오더라..
		 * 결과를 보니까  grade 출력은 하는데, 벡터에 들어있는 녀석이 아니라
		 * 그냥 널 값이더라
		 * 그럼 벡터에 있는 grade  를 가져오는 방법?
		 * grade 대신에 vc.toString 해야겠음
	
		 */
		String dummy = service.searchGradeHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.SearchGradeByName("홍길동");
		System.out.println(temp.toString());
		
		
	}

}
