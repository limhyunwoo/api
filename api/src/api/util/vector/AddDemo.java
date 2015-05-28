package api.util.vector;

import java.util.Stack;
import java.util.Vector;

/*
 * java.util.Vector  의 메소드인
 * add() 는 벡터에 값을 할당하는 기능을 한다.
 * 
 */

public class AddDemo {
	public static void main(String[] args) {

		String id = "admin";
		int age = 27;	//나이
		Boolean male = true;	//성별
		
		Vector<String> vec = new Vector();
		String tom = new String("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		vec.add("리터럴 문자로 생성된 객체");
		

		/*
		 * 벡터는 length() 를 사용하지 않고
		 * size (0 를 요소의 숫자를 표현하는데 사용합니다.
		 * 
		 * 배열에서는 for loop 출력시 get(arr[i]) 하지만
		 * 벡터는 elementAt(i)입니다. 기억하기               *************
		 */
		
		for(int i = 0; i < vec.size(); i++){
			System.out.println("벡터의 " + i + "번째 요소는 :  " + vec.elementAt(i));
		}
		
		
		/*
		 	출력된 결과물 :
		  	벡터의 0번째 요소는 :  admin
			벡터의 1번째 요소는 :  23  ->valueOf로 스트링으로 바뀜 리터럴
			벡터의 2번째 요소는 :  false  -> 마찬가지
			벡터의 3번째 요소는 :  리터럴 문자로 생성된 객체  ->리터럴 객체도 사용가능

		 */
		
		
	}
	
	
}
