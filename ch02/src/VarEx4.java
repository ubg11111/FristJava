
public class VarEx4 {

	public static void main(String[] args) {
		int x = 4 , y = 2; // 4의값을 가진 x컵 , 2의값을 가진 y컵
		int tmp; // 빈 컵
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x의 값" +  x);
		System.out.println("y의 값" +  y);
	}
}
  