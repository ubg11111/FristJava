
/*
 * 예외처리 프로그램오류는 보통 3가지로 나눠진다.
 * 컴파일에러 - 컴파일 시에 발생하는 에러
 * 런타임에러 - 실행 시에 발생하는 에러
 * 논리적 에러 - 실행은 되지만, 의도와 다르게 동작하는 것
 * 
 * 자바의 런타임 에러
 * 에러(error) - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 // 처리불가
 * 예외(exception) - 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 // 처리가능
 */

public class ExceptionTest { // 여기서도 extends Object가 생략되어있지만 컴파일러가 자동 생성해줌
	ExceptionTest(){} // 기본생성자가 원래 만들어야하지만 생략이 되어있다. 이걸 컴파일러가 대신해줌
	
	public static void main(String[] args) {
		
		try {
		System.out.println(args[0]); // 컴파일 에러 예시로 System의 S를 s로 바꾸는경우
		}
		catch(Exception e){
			System.out.println("오류가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
