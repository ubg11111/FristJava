class MyMath2{
	long a,b;
	
	// 인스턴스 변수 a,b 만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() { return a + b; } // a,b는 인스턴스 변수
	long subtract() { return a - b; } 
	long multiply() { return a * b; } 
	double divide() { return a / b ; }
	
	// 인스턴스변수와 관계없이 바로 호출가능한 클래스 변수 생성 매개변수만으로 작업이 가능하다.
	
	static long add(long a, long b) { return a + b;} // a,b는 지역변수로 설정되어 사용
	static long subtract(long a, long b) {return a - b;} 
	static long multiply(long a, long b) {return a * b;} 
	static double divide(long a, long b) {return a / (double)b;} 
}



class Ex6_10 {
	public static void main(String[] args) {
	
	// 클래스 메서드 호출. 인스턴스 생성 없이 바로 호출 가능
	System.out.println(MyMath2.add(200L, 100L));
	System.out.println(MyMath2.subtract(200L, 100L));
	System.out.println(MyMath2.multiply(200L, 100L));
	System.out.println(MyMath2.divide(200L, 100L));
	
	
	MyMath2 mm = new MyMath2(); // 인스턴스 객체 생성
	mm.a = 200L;
	mm.b = 100L;
	
	// 인스턴스 메서드는 객체생성 후에만 호출이 가능함

	System.out.println(mm.add()); // MyMath2 객체를 생성하고 mm이란 변수에 저장 mm.a 인스턴스변수에 200L , mm.b 인스턴스변수에 100L값을 저장
	System.out.println(mm.subtract()); // mm 인스턴스메서드를 호출
	System.out.println(mm.multiply());
	System.out.println(mm.divide());
	}
}
