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
			
			System.out.println("�޴� ����");
			System.out.println("[1]�ڸ� ����");
			System.out.println("[2]���");
			System.out.println("[0]����");
			int select = scanner.nextInt();
			
			if(select == 1)
			{
				System.out.println("���� �ڸ� ����");
				int choice = scanner.nextInt();
				
				if(seat[choice] == 0)
				{
					seat[choice] = 1;
					count++;
				}
				else
				{
					System.out.println("�̹� ���ŵ� �ڸ��Դϴ�.");
				}
				
				
			}
			if(select == 2)
			{
				System.out.println("��ȭ ��:" + count*12000);
			}
			if(select == 0)
			{
				System.out.println("���� ���α׷��� �����մϴ�.");
				break;
			}
		}
	}

}
