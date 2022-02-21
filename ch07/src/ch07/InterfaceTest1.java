package ch07;

/*
 * A B C 세개의 클래스가 있다.
 * 일반 클래스의 형식의 경우는 A에서 B와 C를 바꿔가면서 객체를 사용한다하면
 * A클래스에서 메서드 매개변수를 변경해줘야하는 불편함이 있다. 
 * 
 * 용이하게 변경이 가능하게 사용하려면 
 * 인터페이스를 활용하여 분리  작업을 해줘야 한다.
 * 
 * I라는 껍데기 인터페이스를 만들고 추상메서드를 정의하여
 * 일반클래스 B에서 재정의하여 사용하는것이다.
 */

class A{
	public void method(I i) { // 인터페이스 i를 구현한 놈들만 들어와라
		i.method(); // 일반클래스 i를받은 b와c를 사용
	}
}

// B클래스의 선언과 구현을 분리
interface I{
	public void method(); 
	// 각 implements(구현)을 받은 클래스만 재정의해주면 다중상속이 됨
}


class B implements I{
	public void method() {
		System.out.println("B클래스의 메소드");
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B()); //A객체가 B객체를 사용해 b메서드를 호출
						   // A가 B를 의존(사용)했다고 한다.
	
		a.method(new C());
	}
}
