public class Ex19 {

	public static void main(String[] args) {
		// int 타입의 변수 num 있을 때, 각자리의 합을 더한 결과를 출력하는 코드를 완성.
		// 만일 변수 num의 값이 12345라면, 1+2+3+4+5의 결과인 15를 출력하라
		
		int num = 12345;
		int sum = 0;
		
		while(num!=0) {
			sum += num%10; // sum = sum + num % 10 
			
			num /= 10;
		}
		
		System.out.println("sum = " + sum);
	}
}
