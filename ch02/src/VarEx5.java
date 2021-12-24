
public class VarEx5 {

	public static void main(String[] args) {
		String str = "3";
		String str2 = "3.14";
		
		System.out.println(str.charAt(0) - '0');
		System.out.println('3' - '0'); // 문자 '3' - '0' 0은 '' 문자삭제 
		System.out.println('3' + '0'); // 0은 숫자로 48 3은 숫자로 51 = 99 
		System.out.println('3' + 1); // 3은 숫자로 51 + 1 = 52 		
		System.out.println('3' - '0' + 1); 
		System.out.println("3" + "1"); // 문자열끼리 더해짐 31  
		System.out.println(Integer.parseInt(str) + 1); // 문자열을 정수로 변환 
		System.out.println(3 + '0'); // 0은 숫자로 48 
		System.out.println(Double.parseDouble(str2)); // 실수문자열을 실수로 변환 
		System.out.println((char)(3 + '0'));
		
	}
}
  