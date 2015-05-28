package api.lang.string;

/*
 * java.lang.String
 * toUpperCase() 는 해당 문자열을 전부 대문자로 변환
 * tolowerCase() 는 해당 문자열을 전부 소문자로 변환
 * valueOf() 는 다른 타입을 모두 문자열로 변환
 * 
 */


public class ValueOf {
	public static void main(String[] args) {
		
		String str = "Hello JaVa";
		String msg;
		System.out.println("테스트용 문장 : " + str);
		msg = str.toUpperCase();
		System.out.println(msg);
		msg = str.toLowerCase();
		System.out.println(msg);
		
		//예제의 valueOf() 의 파라미터 값은 int 형이다.
		//Integer.paraseInt() 를 하지 않고도
		//String 의 스태틱 메소드인 ValueOf()
		//를 호출하면 바로 문자열로 변환된다.
		msg = String.valueOf(str.length());			//DB에 넣을때는 그냥 다 String 값으로 바꿔버리는게 좋음. 안정성을 위해.
		System.out.println("valueOf 의 결과 : " + msg);
	
					
	
	
	
	}
	

}
