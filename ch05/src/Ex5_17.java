import java.util.Arrays;

public class Ex5_17 {

	public static void main(String[] args) {
		// 5-4  2차원 배열의 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하시오.
		
		
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
		};
		
		
		int total = 0;
		float average = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				average = total/(float)arr.length / arr[i].length;
				// 325 / 4.0 / 5.0 = 16.25
			}
		}
		
		System.out.println("total=" + total);
		System.out.println("average=" + average);
	}  
}
