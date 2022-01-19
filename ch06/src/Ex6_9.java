class Ex6_9 {
	public static void main(String[] args) {
		// 오버로딩 예제
		MyMath3 mm = new MyMath3(); // 인스턴스 생성
		
		System.out.println("mm.add(3,3) 결과 = " + mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과 = " + mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과 = " + mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과 = " + mm.add(3L,3L));
		
		int []  a = {100,200,300};
		System.out.println("mm.add(a) 결과 =" + mm.add(a));
	}
}


class MyMath3 { // 오버로딩 결국 하는 작업은 같음
	int add (int a , int b) { // add라는 메서드 이름이 셋다 동일하나 add(매개변수)값은 전부 다르다
		System.out.println("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a , long b) {
		System.out.println("long add(long a, long b) - ");
		return a+b;
	}
	
	long add(long a , int b) {
		System.out.println("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a , long b) {
		System.out.println("long add(int a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) { // 배열의 모든 요소의 합을 결과로 반환
		System.out.println("int add(int[] a) - ");
		int result = 0;
		
		for(int i=0; i< a.length; i++)
			result += a[i];
		return result;
	}
}
