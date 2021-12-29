import java.util.*;


public class Ex3 {

	public static void main(String[] args) {
		// switch 문의 제약조건 예제.....
		
		System.out.print("현재 월을 입력하세요. =>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
			case 3: case 4: case 5:
				System.out.println("현재 계절은 봄입니다.");
				break;
			
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름입니다.");
				break;
				
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을입니다.");
				break;
			
			case 12: case 1: case 2:
				System.out.println("현재 계절은 겨울입니다.");
				break;
		}
		if(month >= 13) {
			System.out.println("값을 잘못 입력하였습니다. (1 ~ 12중 입력)");
		}
	}
}
