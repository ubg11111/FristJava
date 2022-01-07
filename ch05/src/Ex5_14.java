import java.util.Scanner;

public class Ex5_14 {

	public static void main(String[] args) {
		// String 의 주요 메소드
		
		String str = "ABCDE"; // 5개의 문자열  
		
		char ch = str.charAt(2); // 문자로 형변환 문자열 해당위치에 있는 문자반환
		
		String st = str.substring(0,2); // to를 제외 C는 제외함
		
		String st2 = str.substring(1, str.length()); // 1~5 까지
		
		System.out.println(ch);
		System.out.println(st);
		System.out.println(st2);
	
	}  
}
