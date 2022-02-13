package ch07;

/*
 * 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용한다.
 * 주로 조건문에 사용되며, 왼쪽에는 참조변수를 오른쪽에는 (클래스명)이 피연산자로 위치한다.
 * 그리고 연산의 결과로 boolean 값인 true또는 false 중의 하나를 반환한다.
 * instanceof를 이용한 연산결과로 true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻한다
 */


/*
 * QnA
 * 
 * Q. 참조변수의 형변환은 왜하나요?
 * 	A. 참조변수(리모콘)을 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위함. 5개에서 4개만 쓴다는 형식으로 바꾸는거임.
 * 
 * Q. instanceof연산자는 언제 사용하나요?
 * 	A. 참조변수를 형변환하기 전에 형변환 가능여부를 확인할 때
 * 		ex) if(c instance of FireEngine) == 조건문으로 작성해야함 . FireEngine의 조상이 car인가? 형변환이 가능한가?
 */

public class Instanceof {
	
	void doWork(Car c) {
		// 형변환이 가능한지 반드시 확인해야한다.
		if(c instanceof FireEngine) { // 형변환이 가능한지 조건문으로 확인하는 instanceof를 사용 c의 자손이 FireEngine이 맞는가?
			FireEngine fe = (FireEngine)c; // 형변환
			fe.water();
		} else if(c instanceof Ambulans) { // 자손인 엠뷸런스가 조상c로 형변환이 가능한가? 
			Ambulans ab = (Ambulans)c; // 형변환
			ab.madic();
		}
	}
	
	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		System.out.println(fe instanceof Object); // FireEngine의 조상은 Object인가?
		System.out.println(fe instanceof Car); // FireEngine이 조상은 Car인가?
		System.out.println(fe instanceof FireEngine); // FireEngine이 FireEngine인가?
		
		
	}
}
