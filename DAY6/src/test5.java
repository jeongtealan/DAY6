import java.util.Scanner;
public class test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.println(">>");
			String text = scanner.next();
			if(text.equals("exit")) //equals = 문자가 둘이 같냐(숫자는 ==, 문자일 경우에만 사용)
					break;
		}
		System.out.println("종료합니다...");
	}

}
