package ch07;


public class Ex7_4 {

	public static void main(String[] args) {
		Point3D2 p = new Point3D2(20,10,30);
		
		System.out.println("x = " + p.x + ", y = " + p.y + ", z = " + p.z);
		
	}
}


class Point2{
	
	int x;
	int y;
	
	
	Point2(){} // 기본생성자 필수로 작성이 필요하다
	

	// 조상이 int x , int y 를 초기화 하는 과정이다.
	Point2(int x, int y){ // 매개변수가 있는 생성자
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2{
	
	int z;
	
	// 모든 생성자는 첫줄에 다른 생성자를 호출해줘야한다 (절대적)
	// 아래와같은 경우 super(x,y) 부모의 생성자를 호출한다. this() 자신을 생성하는경우 오류발생
	// 조상이 초기화한 Point(int x, int y)를 호출한다
	Point3D2(int x, int y , int z) {
		super(x,y); // 첫줄에 부모생성자를 호출 ★
		this.x = x;
		this.y = y;
		this.z = z; // 자신의 멤버를 초기화 한다
	}

}
