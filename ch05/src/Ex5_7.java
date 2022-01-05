import java.util.Arrays;

public class Ex5_7 {

	public static void main(String[] args) {
		// 배열의 활용  예제 (3) - 섞기 (shuffle) 로또번호 만들기
		
		int[] ball = new int[45]; // 45개의 정수값을 저장
		
		//배열의 각 요소에 1~45의 값을 저장 한다.
		for(int i=0; i<ball.length; i++)
			ball[i] = i + 1; // ball[0] 1값으로 저장되서 시작 1~45
			System.out.println(Arrays.toString(ball)); // 1부터 45까지 출력확인하기
			
			int tmp = 0; // 두값을 바꾸는데 사용할 임시변수
			int j = 0; // 임의의 값을 얻어서 저장할 변수 
			
			//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
			// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
			
			for(int i=0; i<6; i++) {
				j = (int)(Math.random() * 45); // 0~44까지의 범위 
				tmp = ball[i];
				ball[i] = ball[j];
				ball[j] = tmp;
			}
			//배열 ball의 앞에서 부터 6개의 요소를 출력한다.
			
			for(int i=0; i<6; i++) {
				System.out.printf("ball[%d]=%d%n", i , ball[i]);
			}
	} 
}
