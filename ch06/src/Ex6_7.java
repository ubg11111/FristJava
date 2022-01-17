class Data3 {int x;}


class Ex6_7 {
	public static void main(String[] args) {
	// 참조형 반환타입 이해하기.
		Data3 d = new Data3();
		d.x = 10; // d를 가리키는 x의 0x100의 주소에 10을 저장
		
		Data3 d2 = copy(d); // return tmp => copy(d)의 참조매게변수 => main Data3 d2 메인메소드에 저장  
		
		// 호출스텍에 의해 Data3 d2의 copy는 종료되어 사라지고 main 메서드로 이동하게 되어 출력 d = 0x100 , d2 = 0x200 각각 주소로 반환 실행
		System.out.println("d.x = " + d.x); 
		System.out.println("d2.x = " + d.x);
	
	}
	
	static Data3 copy(Data3 d) { // Data3 의 d지역변수를 복사함 
		Data3 tmp = new Data3(); // 새로운 객체 tmp를 생성한다. => 0x200 객체의 새로운주소가 생성
		
		tmp.x = d.x; // d.x의 값을 tmp.x에 복사한다. => d.x = 10 -> tmp.x = 10 초기화
		
		return tmp; // 복사한 객체의 주소를 반환한다. => tmp.x = 10을 반환하여 copy(d)에 저장
	}
}