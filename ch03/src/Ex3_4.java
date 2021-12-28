
public class Ex3_4 {

	public static void main(String[] args) {
		// Math.round() 로 반올림하기 
		
		double pi = 3.142592;

		
		System.out.println(pi);
		System.out.println(pi * 1000);
		System.out.println(Math.round(pi * 1000));
		System.out.println(Math.round(pi * 1000) / 1000); // int 정수값을 반환 3으로 실수를 저장할 수 없으니까.
		System.out.println(Math.round(pi * 1000) / (double)1000); // double 나누기 1000에 형변환을 하여 int / double = double 실수 반환
		System.out.println((int)(pi * 1000) / (double)1000); // 3142.592 = int 변환 3142 = double 실수형변환 나누기 1000 또는 1000.0 나눔 
		
	}

}
 