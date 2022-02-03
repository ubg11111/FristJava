public class Ex6_14 {
	public static void main(String[] args) {
		
		MyRoom room = new MyRoom();
		
		room.color = "흰색";
		room.computer = "1개가 있다.";
		room.bad = "침대는 컴퓨터 뒤에 있다.";
		room.door = 2;
		room.rooms();
		
	}
}

class MyRoom{
	String color; // 인스턴스 변수
	String computer;
	String bad;
	int door;
	
	void rooms(){ // 인스턴스 메서드
		System.out.println("내 방의 색은 : " + color);
		System.out.println("내 방의 컴퓨터는 : " + computer);
		System.out.println("내 방의 침대는 : " + bad);
		System.out.println("내 방의 문은 몇개 : " + door);
	}
}