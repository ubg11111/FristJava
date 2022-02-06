package ch07;

class Point{
	int x;
	int y;
}

//class Circle extends Point{ // 상속관계
//	// int x;  // Point의 멤버 2개를 상속받음
//	// int y;
//	int r; 
//}

class Circle{ // 포함관계
	
	// Circle 클래스 안에 Point 클래스를 넣음. Point 객체생성이 p에  명시적 초기화
	// 참조변수초기화
	Point p = new Point(); 
	int r;
	
	
	Circle(){ // 기본생성자안에서 초기화
		p = new Point();
	}
}


public class inheritanceTest {

	public static void main(String[] args) {

// 		상속관계 출력
//		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x = " + c.x);
//		System.out.println("c.y = " + c.y);
//		System.out.println("c.r = " + c.r);
		
		
//   	포함관계 출력
		Circle c = new Circle(); 
		c.p.x = 1; // c 참조변수0x100 -> p 멤버변수 0x100 -> x 멤버변수 0x200 
		c.p.y = 2; // c 참조변수0x100 -> p 멤버변수 0x100 -> y 멤버변수 0x200 
		c.r = 3; // c 참조변수 0x100 -> r 멤버변수 0x100
		System.out.println("c.p.x = " + c.p.x);
		System.out.println("c.p.y = " + c.p.y);
		System.out.println("c.r = " + c.r);
	}
}
