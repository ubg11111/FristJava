package Exam;

class RectangleEx{
	
	int x;
	int y;
	int width;
	int heigth;
	
	RectangleEx(){}
	
	RectangleEx(int x, int y, int width, int heigth){
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
	}
	
	boolean contains(RectangleEx r) {
		if(x < r.x && y< r.y) {
			if((width + x ) > (r.x + r.width) && (heigth + y) > (r.y+r.heigth))
				return true;
		}
		return false;
	}
	
	public int square() {
		return (width * heigth);
	}
	
	void show() {
		System.out.println("("+x+")" + "("+y+")" + "에서 크기가 8x7인 사각형");
	}
	
}


public class Rectangle2 {

	public static void main(String[] args) {
		RectangleEx r = new RectangleEx(2,2,8,7);
		RectangleEx s = new RectangleEx(5,5,6,6);
		RectangleEx t = new RectangleEx(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은"  + s.square());
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}else if(t.contains(s)) {
			System.out.println("t는 s를 포함합니다.");
		}
	}
}
