package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		

		GradeService service= new GradeServiceImpl();
		GradeVO vo1 = new GradeVO();
		vo1.setEng(70);
		vo1.setHak("1501");
		vo1.setKor(83);
		vo1.setMath(50);
		vo1.setName("ㄴㅇㅁ");
		
		GradeVO vo2 = new GradeVO();
		
		vo2.setEng(70);
		vo2.setHak("1502");
		vo2.setKor(83);
		vo2.setMath(50);
		vo2.setName("ggds");
		
		GradeVO vo3 = new GradeVO();
		
		vo2.setEng(77);
		vo2.setHak("1503");
		vo2.setKor(23);
		vo2.setMath(13);
		vo2.setName("ggds");
		
		service.Input(vo1);
		service.Input(vo2);
		service.Input(vo3);
		
		System.out.println(service.SearchGradeByName("1501"));
		
		//컬렉션 내부의 <클래스타입> 을 제네릭이라고 칭함
		//특별한 기능을 말하는 것은 아니고 컬렉션 내부에서
		//타입 캐스팅을 한다라고 간단하게 정리해도 댐.
		Vector<String> vc = service.SearchGradeByName("ggds");
		
		for(int i = 0; i<vc.size();i++ ){
			System.out.println(vc.elementAt(i));
		}
		
		
		
	}

	
		
		
	}


