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
			
			System.out.println("[1] �߰�");
			System.out.println("[2] ����");
			System.out.println("[3] ����");
			System.out.println("[0] ����");
			
			System.out.println("�޴� ����:");
			int select = sc.nextInt();
			
			
			if(select == 1)
			{
				System.out.println("�߰��� �� �Է�:");
				int data = sc.nextInt();
				
				if(count == 5)
				{
					System.out.println("�� �̻� �ε����� �߰��� �� �����ϴ�.");
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
				System.out.println("������ �� �Է�:");
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
					System.out.println("�� �������� �ʴ´�");
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
					System.out.println("�� �̻� ������ �� �����ϴ�.");
					continue;
				}
				
				System.out.println("������ ��ġ �Է�:");
				int idx = sc.nextInt();
				System.out.println("������ �� �Է�:");
				int data = sc.nextInt();
				
				if(count<idx || idx<0)
				{
					System.out.println("�ش� ��ġ���� ������ �� �����ϴ�.");
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
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
