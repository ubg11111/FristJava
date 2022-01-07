
public class Ex5_11 {

	public static void main(String[] args) {
		// 2차원 배열의 초기화 예제 - 점수구하기
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
		}; // int[][] score = new[4][3] score 를 생략한것
		int sum = 0;
		
		for(int i=0; i<score.length; i++) { // new int[4][3] i는 4의 행을 포함
			for(int j=0; j<score[i].length; j++) { // new int[4][3] j는 3의 열을 포함
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
			
				sum += score[i][j]; // sum = sum + score[i][j];
			}
		}
		System.out.println("sum=" + sum);
	} 
}
