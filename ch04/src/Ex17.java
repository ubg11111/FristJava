public class Ex17 {

	public static void main(String[] args) {
		// 숫자로 이루어진 문자열 str이 있을 때, 각자리의 합을 더한 결과를 출력하세요.
		
		String str = "12345";
		
		int sum =0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i)-'0'; // = '12345'; 문자로 형변환
		}
		System.out.printf("sum = " + sum);
	}
}
