
public class Ex3_2 {

	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d; // 8byte의 double -> int 4byte 정수값으로 형변환 시키는 작업
		
		int i = 65;
		char a = (char)i; // 유니코드 문자표에 의한 A는 65로 65를 문자로 변환시 문자 A를 출력 (소문자 a = 97)
		
		float f = 3.14f;
		int fi = (int)f; // 3.14실수값을 정수값으로 전환하여 실수값을 제외 3으로 출력 
		
		int it = 5;
		float itf = (float)it; // int 정수값을 실수값으로 전환하여 5.0을 출력 
		
		System.out.println(score);
		System.out.println(a);
		System.out.println(fi);
		System.out.println(itf);
		
//		자동 형변환의 예외 상황.
		
//		byte b = 100; // Ok byte타입 범위는 -128 ~ 127 리터럴값이 100이여서 큰byte가 작은 byte에 컴파일러가 읽어서 자동형변환 가능 (생략)
//		byte b = (byte)100;  
//		
//		int i = 100;
//		byte b = i; // 에러발생 이유는 상수와 변수의 차이 현재 i는 변수를 선언 따라서 컴파일러가 변수값을 읽지 못함. 위 상수100은 읽음 
//		byte b = (byte)i; // OK 그래서 에러와같이 수동변환을 해줘야 컴파일러가 제대로 인식을 하게 된다.
//		
//		byte b = 1000; // 에러 byte 타입 범위를 초과 (-128~127) 를 벗어난 값을 대입  리터럴은 1000(상수) 넣는 byte 범위는 -128~127 
//		byte b = (byte)1000; //  OK 그러나 값 손실이 발생함 변수 b값에는 -24라는 값이 저장됨.
	}

}
