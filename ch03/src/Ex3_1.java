
public class Ex3_1 {

	public static void main(String[] args) {
		int i=5, j=0;
	
		j = i++; // 후위형 
		System.out.println("j=i++; 실행후 , i=" + i + ", j =" + j);
		
		j=5; // 결과를 비교하기 위해 i와 j의값을 다시 5와 0으로 변경 
		j=0;
		
		j = ++i; // 전위형
		System.out.println("j=++i; 실행후, i=" + i + ", j="+j);
		
		double d = 85.4;
		int score = (int)d; // 8byte의 double -> int 4byte 정수값으로 형변환 시키는 작업
		
		System.out.println(score);
	}

}
