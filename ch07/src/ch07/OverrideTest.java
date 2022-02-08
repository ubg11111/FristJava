package ch07;

/*
 * 오버라이딩의 조건
 * 
 * 1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
 * 2. 접근제어자(public,protected,default,private)를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
 * 		- 접근제어자(scope) 접근이 쉬운 내림차순 순위
 * 			public -> protected -> default -> private
 * 3.예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
 */


class Point3{
	int x;
	int y;
	String getLocation() {
		return "x" + x + ", y: " + y;
	}
}

class Point3D extends Point3{
	
	int z;
	
	Point3D(){} // 기본생성자
	
	Point3D(int x , int y){ // 매개변수생성자
		this.x = x;
		this.y = y;
	}
	
	// 메서드 재정의 (오버라이딩) 조상의 getLocatin();
	// Object 클래스의 toString()을 오버라이딩 하기
	@Override
	public String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}


public class OverrideTest {

	public static void main(String[] args) {
		
		Point3D p = new Point3D(7,4);
		Point3D w = new Point3D();
		
		w.x = 3;
		w.y = 2;
		w.z = 4;
		
		// 매개변수생성자 초기화
		System.out.println(p.getLocation());
		
		// 기본생성자 초기화 
		System.out.println(w.getLocation());
	}
}
