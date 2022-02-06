package Exam;

public class Exam6_5 {
	
	
	// 멤버변수(인스턴스변수)
	int kind;
	int num;
	
	// 클래스변수(공통변수)
	static int width;
	static int height;
	
	// 매개변수 생성자 (인자가 있는 생성자)
	Exam6_5(int k, int n){
		this.kind = k; // 멤버변수와(전역변수) 매개변수(지역변수)를 확실하게 구분하기 위해서 정리
		this.num = n;
	}
	
	
	public static void main(String[] args) {
		Exam6_5 exam = new Exam6_5(1, 1);
		
	
		System.out.println("숫자 Num >>>" + exam.num);
		System.out.println("종류 kind >>> " + exam.kind);
	}
}
