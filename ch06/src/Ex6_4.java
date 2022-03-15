class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L); // 5L = a , 3L = b  , add 메서드 호출 class MyMath (long add (long a, long b))
		long result2 = mm.subtract(5L,3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5, 3);
		long result6 = mm.min(5, 3);
		Object result7 = mm.same(5, 3);
		mm.printGugudan(9); // 구구단 3단을 출력
		
		
		System.out.println("add(5L, 3L) = " + result1 + "L");
		System.out.println("subtract(5L, 3L) = " + result2 + "L");
		System.out.println("multiply(5L, 3L) = " + result3 + "L");
		System.out.println("divide(5L, 3L) = " + result4 + "L");
		System.out.println("max(5L, 3L) = " + result5);
		System.out.println("min(5L, 3L) = " + result6);
		System.out.println("same(5L = 3L) =  " + result7);
	}
}

class MyMath{
	void printGugudan(int dan) {
//		if(!(2<=dan && dan <=9)) {
//			return; // 입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 리턴하여 돌아감
//		}
//		for(int i=1; i<=9; i++) {
//			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
//		}
		
		if((2<=dan && dan <=9)) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d%n", dan, i, dan * i);
			} 
			return;
		}
	}

	
	long add(long a, long b) {
		long result = a + b;
		return result;
	// retunr a + b ; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	// 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a , long b){
		
		return a > b ? a:b;
		
//		if(a>b) {
//			return a; // void가 없는경우 return문 생략 불가능 
//		}else{
//			return b; // 조건식이 참일때만 리턴문이 반환되기에 반드시 else문도 같이 리턴값을 반환해줘야한다.
//		}
	
	}
	long min(long a , long b) {
		return a < b ? a:b; // 삼항연사자 최소값
		
		// if(a < b)
			// return a;
		// else
			// return b;
	}
	long subtract(long a, long b) {
		return a-b;
	}
	long multiply(long a, long b) {
		return a*b;
	}
	double divide(double a, double b) {
		return a/b;
	}
	
	Object same(long a, long b) {
		
		if(a == b) 
			return "값이 같습니다.";
		else
			return "값이 같지 않습니다.";
	}
}