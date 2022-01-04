
public class Ex5_1 {

	public static void main(String[] args) {
		// 배열 예제
		
//		int[] score; // 1.배열 스코어 선언 (참조변수선언)
//		
//		score = new int[5]; // 2. 배열의 생성(int 저장공간 x 5)
		
		int[] score = new int[5]; // 배열의 선언과 생성을 동시에 진행
	
		score[3] = 100; // 0,1,2,3,4 = 5개의 인덱스에서 3의 인덱스에 100 value를 저장
	
		System.out.println("score[0] = " + score[0]);
		System.out.println("score[1] = " + score[1]);
		System.out.println("score[2] = " + score[2]);
		System.out.println("score[3] = " + score[3]);
		System.out.println("score[4] = " + score[4]);
		
		int value = score[3];
		
		System.out.println("value =" + value);
	}
}
