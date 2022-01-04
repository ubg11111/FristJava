
public class Ex5_4 {

	public static void main(String[] args) {
		// 배열의 활용  예제
		
		int sum = 0; // 총합을 저장하기 위한 변수 
		float average = 0f; // 평균을 저장하기 위한 변수
		
		int[] score = {100, 88 , 100, 100, 90};
		
//		sum += score[0];
//		sum += score[1];
//		sum += score[2];
//		sum += score[3];
//		sum += score[4]; => score.length 와 같음
		
		for(int i=0; i<score.length; i++) {
			sum += score[i]; // sum = sum(0) + score[i] 같음
		}
		
		average = sum / (float)score.length; // 계산결과를 float로 형변환 하여 얻음
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	} 
}
