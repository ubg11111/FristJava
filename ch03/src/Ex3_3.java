
public class Ex3_3 {

	public static void main(String[] args) {
		int a = 1_000_000; // 1,000,000 1백만 = 10의 6제곱
		int b = 2_000_000; // 2,000,000 2백만 = 10의 6제곱
		
		// 10의 12제곱, int 범위는 10의 9제곱 즉 int범위를 넘어선다 
		
		long c = a * b; // a * b = 2,000,000,000,000 ? 
		// 이런 경우엔 a나 b를 수동형변화 (long)a 또는 (long)b 로 형변환하여 실행하면 정상적인 값을 실행할 수 있음. 
		
		System.out.println(c);
	}

}
