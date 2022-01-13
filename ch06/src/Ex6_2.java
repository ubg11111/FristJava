

public class Ex6_2 {
	public static void main(String[] args) {
		Tv t1 = new Tv(); // Tv t1; t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은" + t1.channel + "입니다.");
		System.out.println("t1의 channel값은" + t2.channel + "입니다.");
	
		t1.channel = 7; // channel 값을 7로 설정.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
	
		t2 = t1; // 참조 변수 t1의 값을 t2에 저장.
		System.out.println("t1의 channel값은" + t1.channel + "입니다.");
		System.out.println("t1의 channel값은" + t2.channel + "입니다.");
		
	} // 기존 t2는 가비지컬렉터에 의해 메모리값이 정리됨 
}
 