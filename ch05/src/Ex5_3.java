import java.util.Arrays;
// mac은 com+shift+o 누르면 해당 메소드 임포트문을 생성 .. window = ctrl+shift+o

public class Ex5_3 {

	public static void main(String[] args) {
		// 배열의 출력  예제
			
		int[] iArr = {100,95,80,70,60}; // 길이가 5인 int 배열 
		
		for(int i=0; i<iArr.length; i++) {
			
			System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
	} 
}
