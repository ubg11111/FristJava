package Exam;

public class Exam6_6 {

	public static void main(String[] args) {
		MyPoint w = new MyPoint(); // 기본생성자 호출
		 
		MyPoint p = new MyPoint(1, 1); // 매개변수생성자 호출

		
		//p와 (2,2)의 거리를 구한다.
		
		System.out.println(p.getDistance(2,2));
	}
}



class MyPoint{
	
	// 멤버변수 선언
	int x;
	int y;
	
	
	public MyPoint() {}; // 기본생성자
	
	// 매개변수가 있는 생성자
	public MyPoint(int x , int y){
		this.x = x;
		this.y = y;
	}

	
	double getDistance(int x1 , int y1) {
		 return Math.sqrt((x - x1) * (x- x1) + ((y - y1) * (y - y1)));
		
	}
}