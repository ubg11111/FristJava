class Data_1{
	int value; // 생성자가 없기때문에 자동으로 기본생성자 추가
} // Data_1() {} 처럼 기본생성자 자동추가

class  Data_2{
	int value;
	
	Data_2(){} // 컴파일 에러가 안나기 위해 기본 생성자를 직접 추가함
	
	Data_2(int x){ // 매개변수가 있는 생성자
		value = x;
	}
}


class Ex6_11 {
	public static void main(String[] args) {
	 // 기본 생성장 예제
		
		Data_1 d1 = new Data_1(); // 기본 생성자 호출 Data_1 이 컴파일 에러가 안뜨는 이유는 Data_1의 클래스에서는 생성자가0개이고 그에따른 기본생성자를 자동추가함
		Data_2 d2 = new Data_2(); // compile error 발생 
	}
}
