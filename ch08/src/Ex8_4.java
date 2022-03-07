public class Ex8_4 {
	
	/*
	 * 예외처리 try catch문
	 * 예외처리가될 만한 문장을 실행하는 문구
	 * -try{} - {}는 생략이 절대 불가능
	 * 
	 * 예외처리가 발생시 해당에러에대한 문구를 잡아내는 문구
	 * -catch() {} - ()는 Exception e(변수)가 선언된다 {}는 생략이 절대 불가능
	 * 
	 * 예외처리의 최고조상인 Exception이 있으며, Exception은 젤 마지막문구에 와야한다.
	 */
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0); // 에러발생문구
			System.out.println(4); // 위에 에러로인해 실행되지않는다 
		} catch(Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
		System.out.println(6);
	}
}
