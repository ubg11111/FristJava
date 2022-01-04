public class Ex16 {

	public static void main(String[] args) {
		// 주사위를 두개 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하세요
		for(int i=0; i <=6; i++) {
			for(int j=0; j<=6; j++) {
				if(i+j!=6) 
					continue;
				System.out.printf("%d + %d = %d%n", i, j, i+j);
				}
			}
		}
}
