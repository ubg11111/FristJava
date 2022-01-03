import java.util.*;

public class Ex13 {

	public static void main(String[] args) {
		// break 문하고 continue 문의 활용
		
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 햄버거");
			System.out.println("(2) 피자");
			System.out.println("(3) 치킨");
			System.out.print("원하는 메뉴(1~3)를 선택해주세요.(종료:0)>");
			
			String tmp = scanner.nextLine(); // 입력받은 값을 tmp에 저장
			menu = Integer.parseInt(tmp); // 입력받은 tmp값을 정수로 변환 메뉴에 저장
		
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1<=menu && menu<=3)) {
				System.out.println("번호를 잘 못 입력하셨습니다.");
				continue;
			}
			System.out.println("선택하신 메뉴는" + menu + "번 입니다.");
		}
	}
}
