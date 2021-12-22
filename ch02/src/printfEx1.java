
public class printfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10/3.0); // 정수 / 정수 = 3으로 출력 소수점을 제외함 소수점을 표현하려면 두 정수값중 한값을 실수값으로 바꿔야함
		
//		System.out.printf("%d%n", 15); // 10진수
//		System.out.printf("%o%n", 15); // 8진수
//		System.out.printf("%x%n", 15); // 16진수
//		System.out.printf("%s%n", Integer.toBinaryString(15));
//		
//		
//		float f = 123.456789f; // float 정밀도는 7자리수까지 유효하고 8자리수부터는 오차가 발생할 수 있음 뒤 숫자는 의미없는 값이 되버림
//		double d = 123.456789; // double 정밀도는 15자리수까지 유효하여 기본값으로 사용을 많이한다.
//		System.out.printf("%f%n", f);
//		System.out.printf("%f%n", d);
		
		
		System.out.printf("[%5d]%n", 10); // 오른쪽 정렬 
		System.out.printf("[%-5d]%n", 10); // 왼쪽 정렬 
		System.out.printf("[%010d]%n", 10); // 왼쪽 공백대신 0의값을 넣음  
		
		double d = 1.23456789;
		System.out.printf("%14.6f%n", d); // 14 총 14자리값 중 . 6 자리는 소수점 자리를수를 출력 
		
		System.out.printf("[%s]%n", "www.codepen.com");
		System.out.printf("[%-20s]%n", "www.codepen.com");
	}

}
