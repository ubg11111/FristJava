package ch07;

/*
 * 다형성 => 조상 타입 참조변수로 자손 타입 객체를 다루는것.
 * - 본래 참조 변수와 인스턴스의 타입이 일치해야한다.
 * ex) SmartTv s = new SmartTv() 앞에 참조변수s와 생성하는 클래스의 인스턴스타입이 같음.
 * 
 *  하지만 조상타입의 참조변수로 자손 타입의 인스턴스에 참조가 가능하다.
 *  ex) Tv t = new SmartTv(); 조상인 Tv가 자식인 SmartTv의 인스턴스를 참조해서 사용한다.
 * 	- 조상티비의 버튼이 5개여도 스마트티비의 7개 기능을 사용가능 (다만 조상에없는 2개의 기능은 사용불가)
 * 
 * 반대로 자손타입이 조상을 참조하는건 에러가 발생한다.
 * ex) SmartTv st = new Tv(); --> Error 발생
 *  - 스마트티비의 리모컨7개의 기능이 조상의티비인 리모컨5개의 기능을 사용할 수 없기에. 7개를 사용해야하지만 5개를사용하라는건 불가능.
 */

public class Ex7_7 {

	public static void main(String[] args) {
		
		Car car = null; // 참조변수 조상의 Car 를 null로 초기화
		FireEngine fe = new FireEngine(); // 객체생성
		FireEngine fe2 = null; // 실제 인스턴스가 무엇인지가 중요.
		
		//  형변환 에러가 발생하는 경우.
		//  형변환에러 java.lang.ClassCastException 컴파일 에러가아닌 실행시 에러발생 자손객채를 조상객채로 덮으려는경우 5 < 4
		//	FireEngine fe = (FireEngine)car; 
		//	fe.water();
		
		fe.water();
		
		car = /*(Car) 생략가능*/ fe; // car = (Car)fe;에서 형변환이 된다. fe 객체를 조상객채로 형변환하고 Car 조상객체에 넣는다.
		
		
		// car.water(); // 쓸수없다 조상객채가 자식객채를 다룰 수 있으나 자식객체에 추가된 메서드는 사용할 수 없다. 
		// Car 타입의 참조변순인 car로는 water()를 사용할 수 없다.
		
		fe2 = (FireEngine)car; // fe2(FireEngine) 객체에 car조상을 넣는건 불가능 자식객체가 조상객체를 다룰 수 없음.
				   // 그래서 car = fe를 형변환해서 참조받았는데. 이걸 표현해주려면 (FireEngine)car 앞에 소방차클래스를 형변환해서 인증하는 형식.
					// 형변환 생략불가능
		
		fe2.water();
	}
}


class Car{ // 자동차
	
	Car(){} // 기본생성자를 생성하자
	
	String color; // 멤버변수
	int door; // 멤버변수

	void drive() { // 멤버메서드(인스턴스메서드)
		System.out.println("운전하다.");
	}
	
	void stop() { // 멤버 메서드
		System.out.println("멈추다");
	}
}

class FireEngine extends Car{ // 소방차
	
	// Car 조상님 클래스의 멤버를 상속받는다(멤버4개를 상속받음)
	
	void water() { // 멤버메서드를 한개 추가
		System.out.println("물 뿌리기 ~~~");
	}
}

class Ambulans extends Car{ // 응급차
	
	void madic() {
		System.out.println("의사 호출");
	}
}