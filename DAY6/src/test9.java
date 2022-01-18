import java.util.Scanner;
public class test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int seat[] = {0, 0, 0, 0, 0, 0, 0};
		int count = 0;
		
		while(true)
		{
			System.out.println("seat =");
			for(int i=0; i<7; i++)
			{
				System.out.println(seat[i] + " ");
			}
			System.out.println("");
			
			System.out.println("메뉴 선택");
			System.out.println("[1]자리 선택");
			System.out.println("[2]계산");
			System.out.println("[0]종료");
			int select = scanner.nextInt();
			
			if(select == 1)
			{
				System.out.println("앉을 자리 선택");
				int choice = scanner.nextInt();
				
				if(seat[choice] == 0)
				{
					seat[choice] = 1;
					count++;
				}
				else
				{
					System.out.println("이미 예매된 자리입니다.");
				}
				
				
			}
			if(select == 2)
			{
				System.out.println("영화 값:" + count*12000);
			}
			if(select == 0)
			{
				System.out.println("예매 프로그램을 종료합니다.");
				break;
			}
		}
	}

}
