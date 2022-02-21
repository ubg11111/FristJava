package ch07;

public class Ex7_11 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		
		c.method();
		c.method1();
		c.method2(); // 인터페이스의 상위조건인 parent3 의 메서드를 출력
		Myinterface.staticMethod(); // 스태틱메서드의 접근공식 = 클래스명(인터페이스명).메서드명();
		Myinterface2.staticMethod2();
	}
}


class Child3 extends parent3 implements Myinterface,Myinterface2{
	public void method1() {
		System.out.println("메소드1() in Child3");
	}
	
}


class parent3{
	public void method2() {
		System.out.println("메소드2() in paretn3");
	}
}


interface Myinterface{
	default void method() {
		System.out.println("메소드1() in Myinteface");
	}
	
	default void method2() {
		System.out.println("메소드2() in Myinteface");
	}
	
	static void staticMethod() {
		System.out.println("스태틱메소드() in Myinterface()");
	}
}

interface Myinterface2{
	default void method1() {
		System.out.println("메소드1() in myinterface2");
	}
	
	static void staticMethod2() {
		System.out.println("스태틱메소드() in myinterface2");
	}
}