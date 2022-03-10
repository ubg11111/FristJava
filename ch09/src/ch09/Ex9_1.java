package ch09;

public class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10); // 0x100
		Value v2 = new Value(10); // 0x200
		
		
		// 서로 다른 두 객체는 항상 주소가 다르다.
		
		if(v1.equals(v2))
			System.out.println("v1과 v2는 같다"); // 주소가 다른지 비교할 수 있다.
		else
			System.out.println("v1과 v2는 다르다");
		}
	}

class Value{
	Value(){} // 기본생성자
	
	int value;
	
	Value(int value){ // 인자생성자(매개변수생성자)
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		Value v = (Value)obj; // obj를 value로 형변환
		
		return this.value==v.value;
		// return this == obj ;; // 주소비교. 서로 다른 객체는 항상 거짓
		// 참조변수 형본환 전에는 반드시 instanceof로 확인해야함.
	}
}