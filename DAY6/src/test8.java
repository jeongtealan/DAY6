import java.util.Scanner;
public class test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] Lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] Lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] Lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		
		while(true)
		{
			System.out.println("[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[4] 종료");
			
			System.out.println("메뉴 선택 : ");
			int select = scanner.nextInt();
			
			if(select == 1)
			{
				int count = 0;
				int check = -1;
				
				for(int i=0; i<8; i++)
				{
					if(Lotto1[i] == 7)
					{
						count ++;
						if(count == 3)
						{
							check = 1;
						}
					}
					else
					{
						count = 0;
					}
				}
				if(check == 1)
				{
					System.out.println("당첨");
				}
				else
				{
					System.out.println("꽝!");
				}
			}
			else if(select == 2)
			{
				int count = 0;
				int check = -1;
				
				for(int i=0; i<8; i++)
				{
					if(Lotto2[i] == 7)
					{
						count++;
						if(count == 3)
						{
							check = 1;
						}
					}
					else
					{
						count = 0;
					}
				}
				if(check == 1)
				{
					System.out.println("당첨");
				}
				else
				{
					System.out.println("꽝!");
				}
			}
			else if(select == 3)
			{
				int count = 0;
				int check = -1;
				
				for(int i=0; i<8; i++)
				{
					if(Lotto3[i] == 7)
					{
						count++;
						if(count == 3)
						{
							check = 1;
						}
					}
					else
					{
						count = 0;
					}
				}
				if(check == 1)
				{
					System.out.println("당첨");
				}
				else
				{
					System.out.println("꽝!");
				}
			}
			else if(select == 4)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
