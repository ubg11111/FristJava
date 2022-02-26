package exam;

/*
 * 연습문제 7-4에서 작성한 MyTv클래스의 이전 채널 (previous channel)로 이동하는 기능의
 * 메서드를 추가해서 실행결과아 같은 결과를 얻도록 하시오.
 */

public class Exam04 {
	
	
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println(t.getChannel());
		
		t.setChannel(20);
		System.out.println(t.getChannel());
		
		t.goroPrevChannel();
		System.out.println(t.getChannel());
		
		t.goroPrevChannel();
		System.out.println(t.getChannel());
	}
}
