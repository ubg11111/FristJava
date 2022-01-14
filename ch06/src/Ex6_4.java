class Ex6_4 {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		long result1 = mm.add(5L, 3L); // 5L = a , 3L = b  , add 메서드 호출 class MyMath (long add (long a, long b))
		long result2 = mm.subtract(5L,3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5, 3);
		long result6 = mm.min(5, 3);
		
		
		System.out.println("add(5L, 3L) = " + result1 + "L");
		System.out.println("subtract(5L, 3L) = " + result2 + "L");
		System.out.println("multiply(5L, 3L) = " + result3 + "L");
		System.out.println("divide(5L, 3L) = " + result4 + "L");
		System.out.println("max(5L, 3L) = " + result5);
		System.out.println("min(5L, 3L) = " + result6);
	}
}

class MyMath{
	long add(long a, long b) {
		long result = a + b;
		return result;
	// retunr a + b ; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	// 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a , long b){
		return a > b ? a:b; // 삼항연산자 최대값 
	}
	long min(long a , long b) {
		return a < b ? a:b; // 삼항연사자 최소값
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
}