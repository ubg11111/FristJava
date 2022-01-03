public class Ex14 {

	public static void main(String[] args) {
		// 이름 붙은 반복문
		Loop1 : for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5)
						break Loop1;
					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println(); // break만 거는경우 평소 for(i)반복문이 계속 돌음
		} // Loop1 으로 브레이크하여 완전 반복문 탈출 
	
	}
}
