import java.util.Scanner;

public class test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int check = 0;
		int count = 0;

		while(true)
		{
			int max = 0;
			
			for(int i=0;i<5;i++)
			{
				if(max<arr[i])
				{
					max = arr[i];;
					check = i;
				}
			}
			
			System.out.print("[");
			for(int i=0;i<5;i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			
			System.out.println("�ִ��� �Է��Ͻÿ�");
			int data = sc.nextInt();
			
			if(max == data)
			{
				arr[check] = 0;
				count++;
			}
			
			if(count == 5)
			{
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}
