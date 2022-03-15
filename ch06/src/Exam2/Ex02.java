package Exam2;

public class Ex02 {

	public static void main(String[] args) {
		
		// A학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.
		
		int[] marks = {70,60,55,75,95,90,80,80,85,100};
		
		int sum = 0;
		
		for(int marks1 : marks) {
			sum += marks1;
		}
		
		double avg = sum / marks.length;
		
		
		
		System.out.println(sum);
		System.out.println(avg);
		
	}
}
