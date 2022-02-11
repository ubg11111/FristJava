package ch07;

public class Ex7_7 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine(); // 객체생성
		FireEngine fe2 = null; 
		
		
		fe.water();
		
		car = /*(Car) 생략가능*/ fe; // car = (Car)fe;에서 형변환이 된다. fe 객체를 조상객채로 형변환하고 Car 조상객체에 넣는다.
		
		// car.water(); // 못씀 조상객채가 자식객채를 다룰 수 있으나 자식객체에 추가된 메서드는 사용할 수 없다.
		
		fe2 = (FireEngine)car; // fe2(FireEngine) 객체에 car조상을 넣는건 불가능 자식객체가 조상객체를 다룰 수 없음.
				   // 그래서 car = fe를 형변환해서 참조받았는데. 이걸 표현해주려면 (FireEngine)car 앞에 소방차클래스를 형변환해서 인증하는 형식.
					// 형변환 생략불가능
		
		fe2.water();
	}
}


class Car{ // 차
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