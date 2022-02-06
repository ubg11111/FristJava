package ControlExam;

public class Exam2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0; i<=10; i++) {
			if((i%2 == 1)) {
				System.out.print(i+"\t");
				sum += i;
			}			
		}
		System.out.println("1~10의 홀수의 합 : " + sum);
	}
}
