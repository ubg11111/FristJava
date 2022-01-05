
public class Ex5_10 {

	public static void main(String[] args) {
		// 커맨드 라인을 통해 입력받기
		
		System.out.println("매개변수의 개수 :" + args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = \"" + args[i] + "\"");
		}
	} 
}
