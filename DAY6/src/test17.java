import java.util.Random;
import java.util.Scanner;

public class test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[9];
		
		for(int j=0;j<9;j++)
		{
			arr[j] = j+1;
		}
		
		int i = 0;
		while(i<1000)
		{
			int num = ran.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[num];
			arr[num] = temp;
			i++;
		}
		
		int start = 1;
		while(true)
		{
			System.out.print("[");
			for(int j=0;j<9;j++)
			{
				System.out.print(arr[j] + " ");
			}
			System.out.print("]");
			System.out.println();
			
			System.out.println("�ε����� �Է��Ͽ���");
			int data = sc.nextInt();
			
			int check = 0;
			
			if(start == 9)
			{
				System.out.println("��� �ε����� ������ϴ�.");
				System.out.println("���α׷� ����");
				break;
			}
			
			for(int j=0;j<9;j++)
			{
				if(arr[data]==start)
				{
					arr[data] = 0;
					start++;
				}
			}
		}
	}
}
