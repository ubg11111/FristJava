package ch07;

class AAA{ // AAA는 BBB의 외부클래스
	int i = 100;
	BBB b = new BBB();
	
	class BBB{ // BBB는 AAA의 내부클래스
		void mathod() {
			System.out.println(i); // 객체생성없이 외부클래스의 멤버에 접근가능
		}
	}
}


class CCC{
//	BBB b = new BBB(); // BBB 클래스가 AAA내부클래스가되서 에러가남.
	
}

public class Innertest {

	public static void main(String[] args) {
		AAA a = new AAA();
		
		a.b.mathod();
		
		
	}
}
