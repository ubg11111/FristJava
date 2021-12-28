
public class Ex3_5 {

	public static void main(String[] args) {
		// 연습 문제 
		
		int x = 2;
		int y = 5;
		char c = 'A'; // A의 문자코드는 65 
		
		int num = 456;
		int num2 = 111;
		
		System.out.println(y >=5 || x < 0 && x > 2);
		System.out.println(y + 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		System.out.println(num / 100  * 100);
		System.out.println(num2 / 100  * 100);

	}
}