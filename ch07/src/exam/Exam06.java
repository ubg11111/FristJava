package exam;


class Outer3{ // 외부 클래스
	Outer3(){} // 외부클래스의 기본생성자 생성
	int value = 10; // 외부클래스의 전역변수
	
	class Inner{ // 내부 클래스
		Inner(){} // 내부클래스 기본생성자 생성
		int value = 20; // 내부클래스의 전역변수
		  
		
		void method1() { // 내부클래스의 메서드
			int value = 30; // 지역변수
	
			
			System.out.println(value);
			System.out.println(this.value); //
			System.out.println(Outer3.this.value); // 내부클래스.this.멤버변수
		}
	}// Inner 클래스의 끝
} /// Outer 클래스의 끝


public class Exam06 {

	public static void main(String[] args) {
		Outer3 out1 = new Outer3();
		Outer3.Inner in1 = out1.new Inner();
		
		in1.method1();
	}
}
