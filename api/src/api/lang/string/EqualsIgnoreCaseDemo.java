package api.lang.string;

public class EqualsIgnoreCaseDemo {
		public static void main(String[] args) {
			System.out.println(
			//비교대상의 대소문자 차이점까지 비교한다.
					"Hello".equals("hello") ? "같습니다" : "다릅니다"
				
					);
			//비교대상의 대소문자 차이를 무시한다.
			//대소문자 구별이 없다.
			System.out.println(
					"Hello".equalsIgnoreCase("hello") ? "같습니다" : "다릅니다"
					);
			
			
			
		}

}
