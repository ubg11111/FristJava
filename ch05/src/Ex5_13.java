import java.util.Scanner;

public class Ex5_13 {

	public static void main(String[] args) {
		// 2차원 배열의 초기화 예제(3) - 퀴즈 문제 작성
		
		String[][] words = {
				{"chair", "의자"}, // words[0][0]행 , words[0][1]열
				{"computer", "컴퓨터"}, // words[1][0]행 , words[1][1]열
				{"integer", "정수"} // words[2][0]행, words[2][1]열
		};
	
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 한글말은?", i+1 , words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) { // tmp == words[i][1] 같은의미
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("정답이 아닙니다. 정답은 %s입니다.%n%n",words[i][1]);
			}
		} // for 반복문 
	}  
}
