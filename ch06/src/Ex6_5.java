

// 클래스를 생성
class Data{
	// 기본적으로 기본생성자가 내장이 되어있다. (객체 생성을 위해서)
	// Data(){}; // 기본생성자는 원래 클래스안에서 생성을 해줘야한다 (표시)
	int x;
	int y;
	
	Data(){}; // 기본형 생성자
	
	Data(int x, int y){ // 매개변수 생성자
		this.x = x; // 지역변수를 전역변수에 전달하는과정
		this.y = y;
	};
}

// 메인
class Ex6_5 {
	public static void main(String[] args) {
		Data d = new Data(); // Data클래스의 객체 생성
		
		Data d2 = new Data(10,20); // 참조형 매개변수 생성자 객체 생성
		
		d.x = 10; // Data int x의 값을 10을 d로 초기화
		
		System.out.println("main() : x = " + d.x);
		
		change(d.x); // 호출스택 2번째 읽기
		
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); // 메인 읽기
		
		// d2 참조형 매개변수에 접근하기.
		System.out.println("참조형 매개변수의 x + y값은 = "  + (d2.x + d2.y) );
	}
	
	static void change(int x) { // 기본형 매게변수  static 클래스변수(공통변수)
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}