
public class Ex4 {

	public static void main(String[] args) {
	// 임의의 정수만들기 (난수) Math.random()
		int num = 0;
		
		// 괄호{} 안에 내용을 10번 반복한다.
		
		for(int i=1; i <=20; i++) {
			num = (int)(Math.random() * 11) - 5; // 0~9까지 곱하고 +1을하여 1~10까지 10번을 계산하고 정수로 출력 
			System.out.println(num);
		}
	}
}
