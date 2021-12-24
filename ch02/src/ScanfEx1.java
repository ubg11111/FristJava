import java.util.Scanner; // * 모든 자바의 util을 사용 . Scanner 만사용시 지정가능. 


public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Scanner 객채를 생성 
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);

		System.out.println(num);
		
	
	}
}
