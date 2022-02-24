package ch07;



public class Ex7_12 {
	
	class InstanceInner{ // iv 인스턴스 변수와 같음.
		int iv = 100;
		static int cv = 100; // 에러 ! static 변수를 선언할 수 없다.
		final static int CONST = 100; // final static은 상수이므로 허용.
	}

	static class StaticInner{ // cv 클래스변수와 같음.
		int iv = 200;
		static int cv = 200; // static 클래스만 static멤버를 정의할 수 있다.
		
		static String meMethod() {
			return "안녕";
		}
		// static은 객체생성없이 사용할 수 있다. 클래스명.메서드 or 클래스명.변수명
	}
	
	void myMethod() {
		class LocalInner{ // lv 로컬변수와 같음.
			int iv = 300;
			static int cv = 300; // 에러 ! static 변수를 선언할 수 없다.
			final static int CONST =300; // final static은 상수이므로 허용
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
		System.out.println(StaticInner.meMethod());
	}
}
