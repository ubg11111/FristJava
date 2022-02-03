package Exam;

public class Exam6_3 {

	public static void main(String[] args) {
		
		Student2 s = new Student2();
		
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("이름 : " + s.getAverage());
		
	}
}


class Student2{
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math; 
	
	Student2(){}; // 기본생성자
	
	int getTotal() {
		int total = kor + eng + math;
		return total;
	}
	
	float getAverage() {
		float avg = (int)(getTotal() / 3f * 10 + 0.5f) / 10.0f;
		return avg;
	}
	
}