package exam;

class Outer{
	class Inner{
		int iv = 100;
	}
}

class Outer2{
	static class Inner{
		int iv = 200;
	}
}

public class Exam05 {

	public static void main(String[] args) {
		// 디폴트 클래스에 내부클래스 접근방법
		Outer out = new Outer(); // 외부클래스 객체를 생성
		Outer.Inner in = out.new Inner(); // 외부클래스안에 있는 내부객체를 생성
		
		System.out.println(in.iv);
		
		// 스태틱 클래스에 내부클래스 접근방법
		Outer2.Inner in2 = new Outer2.Inner(); // static 내부 클래스의 인스턴스는 외부클래스를 먼저 생성하지 않아도 된다.
		System.out.println(in2.iv);
		
	}
}
