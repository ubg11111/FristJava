import java.util.*;

public class Ex20 {

	public static void main(String[] args) {
		// 1~100임의의 정수 구하기 숫자 맞추기게임
		int input = 0;
		int count = 0;
		int com = (int)(Math.random() * 100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100의 사이의 값을 입력하세요");
			input = scanner.nextInt();
			
			if(0 >= input || input > 100) {
				System.out.println("숫자를 잘못 입력 하셨습니다.");
			} else if(input == com){
				System.out.println("정답입니다.");
				System.out.printf("시도횟수는 %d번 입니다.", count);
				break;
			} else if(input > com) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if(input < com) {
				System.out.println("더 큰 수를 입력하세요.");
			}
		} while(true);
	}
}
