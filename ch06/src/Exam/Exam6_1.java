package Exam;

public class Exam6_1{
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1,1,100,60,76);
		
		String str = s.info();
		System.out.println(str);
		
	}
}

class Student{
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) { // 매개변수 생성자.
		this.name = name; // this 객체를 활용하여 멤버변수와 매개변수를 구분
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int total() {
		return kor + eng + math;
	}
	
	String avg() { // String.format을 통해서 .f
		double su = total() / 3.0;
		return (String.format("%.1f", su));
	}
	
	
	String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + total() + "," + avg(); 
	}
}