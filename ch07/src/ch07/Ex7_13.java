package ch07;

public class Ex7_13 {
	
	class InstanceInner{}
	static class StaticInner{};
	
	// 인스턴스멤버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner(); // 객체 생성
	// static 멤버 간에는 서로 직접 접근이 가능하다.
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		// static 멤버는 인스턴스 멤버에 직접 접근할 수 없다.
//		InstanceInner obj1 = new InstanceInner();  에러 인스턴스클래스는 스태틱메서드에 접근 불가.
		StaticInner obj2 = new StaticInner(); // 접근가능 static
		
		
		//굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
		//인스턴스클래스는 외부클래스를 먼저 생성해야만 생성할 수 있다.
		Ex7_13 outer = new Ex7_13(); // 외부클래스 객체 생성
		InstanceInner obj1 = outer.new InstanceInner();
		
	}
	
	
	void instanceMethod() {
		//인스턴스메서드에서는 인스턴스 멤버와 static멤버 모두 접근이 가능하다.
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
//		LocalInner lv = new LocalInner();
	}
	
	
	void myMethod() {
		class LocalInner{
			LocalInner lv = new LocalInner();
			
			static String hi = "hi";
		}
		System.out.println(LocalInner.hi); // 지역변수는 내부안에서만 서로 접근이 가능하다. 외부로 접근 불가능
	}
}
