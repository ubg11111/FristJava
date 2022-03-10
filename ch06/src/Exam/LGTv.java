package Exam;

/*
 * 자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV클래스를 작성하라.
 */

class LGTV32{
	
	String name;
	int date;
	int inch;
	
	
	LGTV32(){} // 기본생성자 생성
	
	LGTV32(String name, int date, int inch){ // 매개변수 생성자 생성
		this.name = name;
		this.date = date;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(name + "에서 만든 " + date + "년형 " + inch + "인치 TV");
	}
	
	
}

public class LGTv {
	public static void main(String[] args) {
		LGTV32 tv = new LGTV32("LG", 2017, 32); // 매개변수 생성자 접근
	
		
		tv.show();
	}
}
