
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final 상수 선언 상수 선언 후 초기화 가능하지만 상수 선언 + 초기화 이후 초기화 재선언이 불가함 리터럴 값이 바뀌지않음  
		final int read = 200;
//		score = 200;
		
//		\n 개행 문자로 문자열 앞에 사용하게 되면 기준으로 줄바꿈을 시행함 
		String name = "Java \nRun";
		
		char ch = 'A';
		int i = 'A';
		
		String str = ""; // 빈 문자열 (empty string)
		String str2 = "ABCD";
		String str3 = "123";
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2+str3);
	  
	}

}
