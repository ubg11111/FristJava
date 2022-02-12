package Exam;

import java.util.Scanner;

/*
 * Grade 클래스를 작성해보자. 3과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main()으로 출력해보자.
 */

class MyGrade{
	
	// 성적을 초기화할 값을 멤버변수로 지정
	private int math;
	private int science;
	private int english;
	
	
	//메인에서 키보드로 입력한 매개변수를 매개변수생성자로 전달하여 MyGrade 전역변수에 전달.
	MyGrade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public int getEnglish() {
		return english;
	}

	public int average() {
		return (math + science + english) / 3;
	}
	
}


public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수학,과학,영어 순으로 3개의 정수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		MyGrade me = new MyGrade(math,science,english);
		System.out.println("평균은 " + me.average() + "점 입니다.");
	}
}
