
public class Ex3_8 {

	public static void main(String[] args) {
		// 연습 문제 
		int fahrenheit = 100;
		float celcius = (int)(5/9f * (fahrenheit-32) * 100 + 0.5) / 100.0f;
	
		
		System.out.println("Fahrenheit :" + fahrenheit);
		System.out.println("Celcius:" + celcius);
	}
}