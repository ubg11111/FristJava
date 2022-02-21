package Exam;


public class Rectangle {
	
	// 사각형의 가로와 세로를 멤버로 생성
	double row;
	double col; 
	
	Rectangle(){} // 기본생성자
	
	Rectangle(double row, double col){
		// 면적 가로*세로
		this.row = row;
		this.col = col;
		
	}
	
	
	double getArea() {
		return row * col;
	}
	
	double getCircumference() {
		return (this.row + this.col);
	}
	
	public static void main(String[] args) {
		
		Rectangle rc = new Rectangle(3.82, 8.65);
		
		
		System.out.println("면적 : " + rc.getArea());
		System.out.println("둘레 : " + rc.getCircumference());
		
	}
}
