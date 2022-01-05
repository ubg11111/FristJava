import java.util.Arrays;

public class Ex5_6 {

	public static void main(String[] args) {
		// 배열의 활용  예제 (3) - 섞기 (shuffle)
		
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10); // 0~9중의 숫자를 랜덤으로 선택
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
		
	} 
}
