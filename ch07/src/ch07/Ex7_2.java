package ch07;

public class Ex7_2 {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.method();
	}
}


class Parent{
	int x = 10; // super.x 
}

class Child extends Parent{
	int x = 20 ; // 상속의 멤버변수 초기화 // this.x
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x); // 자기멤버(Child) 멤버변수 x에 접근
		System.out.println("super x = " + super.x); // 조상멤버(Parent) 멤버변수 x에 접근
	}
}