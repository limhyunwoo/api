package api.lang.object;

/*
 * java.lang.Object 의 메소드
 *	equals() : 값이 같은지 여부를 체크
 */

/* 인스턴스 변수의 해시코드 값(힙주소값)을 비교하는 메소드
 * 
 */

public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		//result 가 지역변수이기 때문에
		//반드시 초기화를 해야한다. - 지역변수는 주소값이 없기 때문에 초기화를 해주지 않으면  stack 안에 들어갈수가 읍당
		String result;
		//if(){}else{} 이 형태는 하드코딩으로 익숙해지셔야 합니다.
//		if(t1.equals(t2)
//				){
//			System.out.println("t1과 t2의 값이 같다.");
//			
//		}else{	System.out.println("t1과 t2의 값이 다르다.");}
//		
		/*
		 * 삼항연산자는 if else를 대체하는 구문이다.
		 * 구성은 (조건식) ? "참인경우" : "거짓인경우" ;
		 */
		
		result = t1.equals(t2) ? "t1과 t2의 값이 같다." : "t1과 t2의 값이 다르다." ;
		System.out.println("생성자를 통해 생성된 참조변수 값의 비교 : " + result);
	
		t2 = t1;
		result = t1.equals(t2) ? "t1과 t2의 값이 같다." : "t1과 t2의 값이 다르다." ;
		System.out.println("참조변수 사이의 할당된 연산 이후 값의 비교 : " + result);
	
	}
	
}

class Temp{
	int num;
	public Temp(int num) {
		this.num = num;
		
		/*
		 * 상기형태는 힙에 저장된 인스턴스 변수에 
		 * 콜 스택에 있는 num 지역변수에 할당된 값을 인스턴스 변수에 넘겨주고 로컬 변수 자신은 사라지는
		 * 시나리오로 진행된다.
		 */
		
	}
}

