import java.util.Scanner;

public class test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int count = 2;
		
		while(true)
		{
			for(int i=0;i<count;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("[1] 추가");
			System.out.println("[2] 삭제");
			System.out.println("[3] 삽입");
			System.out.println("[0] 종료");
			
			System.out.println("메뉴 선택:");
			int select = sc.nextInt();
			
			
			if(select == 1)
			{
				System.out.println("추가할 값 입력:");
				int data = sc.nextInt();
				
				if(count == 5)
				{
					System.out.println("더 이상 인덱스를 추가할 수 없습니다.");
				}
				
				for(int i=0;i<5;i++)
				{
					if(arr[i] == 0)
					{
						arr[count] = data;
					}
				}
				count++;
			}
			if(select == 2)
			{
				System.out.println("삭제할 값 입력:");
				int data = sc.nextInt();
				
				int delIdx = -1;
				for(int i=0;i<count;i++)
				{
					if(arr[i] == data)
					{
						delIdx = i;
					}
				}
				
				if(delIdx==-1)
				{
					System.out.println("값 존재하지 않는다");
				}
				else
				{
					for(int i=delIdx; i<count-1;i++)
					{
						arr[i] = arr[i+1];
					}
					count--;
				}
			}
			if(select == 3)
			{
				if(count == 5)
				{
					System.out.println("더 이상 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.println("삽일할 위치 입력:");
				int idx = sc.nextInt();
				System.out.println("삽일할 값 입력:");
				int data = sc.nextInt();
				
				if(count<idx || idx<0)
				{
					System.out.println("해당 위치에는 삽입할 수 없습니다.");
					continue; 
				}
				
				for(int i=count;i>idx;i--)
				{
					arr[i] = arr[i-1];
				}
				arr[idx] = data;
				count++;
			}
			if(select == 0)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
