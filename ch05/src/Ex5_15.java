import java.util.Arrays;

public class Ex5_15 {

	public static void main(String[] args) {
		// Arrays 로 배열 다루기
		
		int[] arr = {0,1,2,3,4}; // 1차원 배열 arr
		
		int[] arrSort = {3,1,2,5,4}; // 배열 정령 변수
		
		Arrays.sort(arrSort); // 배열을 오름차순으로 정렬해줌
		System.out.println(Arrays.toString(arrSort));
		
		int[][] arr2D = {{11,12} , {21,22}}; // 2차원 배열 arr2D
	
	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa","bbb"}, {"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"}, {"AAA","BBB"}};
		
		System.out.println(str2D==str2D2); // 참조변수 값 비교 false
		System.out.println(Arrays.equals(str2D, str2D2)); // 참조변수 값 비교 false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); // 2차원배열은 deepEquals 적용
	
	
		int[] arr2 = Arrays.copyOf(arr, 7); // arr 배열 복사 {0,1,2,3,4}
		int[] arr3 = Arrays.copyOfRange(arr, 2,4); // copyOfRange (from ~ to) to값은 제외
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
	}  
}
