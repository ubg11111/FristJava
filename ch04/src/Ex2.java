import java.util.*;


public class Ex2 {

	public static void main(String[] args) {
		// 중첩조건문 예제
		
		int score = 0;  // 점수를 확인하기 위한 변수
		char grade = ' ', opt = ' '; // 학점을 저장하기 위한 변수 공백으로 초기화 한다 
		
		System.out.print("점수를 입력하세요. => ");;
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score 에 저장함.
		
		System.out.printf("당신의 점수는 %d입니다%n", score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}
			else if (score < 94) {
				opt = '-';
			}
		}
		else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			}
			else if(score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}
