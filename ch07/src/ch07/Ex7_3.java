package ch07;

public class Ex7_3 {

	public static void main(String[] args) {
		Child2 c2 = new Child2();
		
//		Parent2 p2 = new Parent2(); // 추상클래스는 생성이 불가능하다.
		
		c2.method();
	}
}

abstract class Parent2{
	int x =10; // super.x 와 this.x 둘다 접근이 가능하다.
}

class Child2 extends Parent2{
	
	// int x =10; // 상속받음
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x); // 자기멤버(Child)에 선언된 멤버변수가 없기에 상속받은 Parent2 멤버변수에 접근
		System.out.println("super x = " + super.x); // 조상멤버(Parent) 멤버변수 x에 접근
	}
}
