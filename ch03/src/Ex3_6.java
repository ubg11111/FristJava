
public class Ex3_6 {

	public static void main(String[] args) {
		// 연습 문제 
		int numOfapples = 123; // 사과의 개수
		int sizeOfbucket  = 10; // 사과를 담는 바구니의 개수 
		int numOfbucket = Math.round(numOfapples / sizeOfbucket + 0.5f); 
		// 소수점 첫째 자리에 0.5를 더하면 , Math.round는 무저건 반올림하여 반환 123/10.5f = 13
				
		System.out.println("필요한 바구니의 수:" + numOfbucket);
	

		
	}
}