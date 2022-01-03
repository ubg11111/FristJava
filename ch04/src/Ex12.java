public class Ex12 {

	public static void main(String[] args) {
		// continue 문 예제.
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
