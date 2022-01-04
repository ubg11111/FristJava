
public class Ex5_5 {

	public static void main(String[] args) {
		// 배열의 활용  예제 (2) 최댓값과 최소값
		
		
		int[] score = {79,88,100,33,55,95}; // int 배열 6개 저장
		
		int max = score[0]; // 첫번째 인덱스 79값을 저장
		int min = score[0]; // 첫번째 인덱스 79값을 저장
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) { // score[i] 는 첫번째 인덱스 79부터 반복문 시작 
				max = score[i];
			} else if(score[i] < min) { // 88(score[i]) < 79(score[0]) 
				min = score[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	} 
}
