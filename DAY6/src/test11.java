import java.util.Scanner;
public class test11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = {10,20,30,40,50};
	
	System.out.println("�ε��� 2���� �Է¹޾� �� ��ü�ϱ�");
	System.out.println("�ε���1 �Է�:");
	int idx1 = sc.nextInt();
	System.out.println("�ε���2 �Է�:");
	int idx2 = sc.nextInt();
	
	int temp = arr[idx1];
	arr[idx1] = arr[idx2];
	arr[idx2] = temp;
	
	System.out.print("[");
	for(int i=0; i<5; i++)
	{
		System.out.print(arr[i]+ " ");
	}
	System.out.print("]");
	System.out.println(" ");
	
	System.out.println("");
	System.out.println("�� 2���� �Է¹޾� �� ��ü�ϱ�");
	System.out.println("��1 �Է�:");
	int value1 = sc.nextInt();
	System.out.println("��2 �Է�:");
	int value2 = sc.nextInt();
	
	int check1 = 0;
	int check2 = 0;
	
	for(int i=0; i<5; i++)
	{
		if(arr[i] == value1)
		{
			check1 = i;
		}
		if(arr[i] == value2)
		{
			check2 = i;
		}
	}
	
	temp = arr[check1];
	arr[check1] = arr[check2];
	arr[check2] = temp;
	
	System.out.print("[");
	for(int i=0; i<5; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.print("]");
	System.out.println();
	
	System.out.println("");
	System.out.println("�й�2���� �Է¹޾� �� ��ü�ϱ�");
	System.out.println("�й�1 �Է�:");
	int data1 = sc.nextInt();
	System.out.println("�й�2 �Է�:");
	int data2 = sc.nextInt();
	
	check1 = 0;
	check2 = 0;
	int[] ids = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = {  87,   11,   45,   98,   23};
	
	for(int i=0;i<5;i++)
	{
		if(ids[i] == data1)
		{
			check1 = i;
		}
		if(ids[i] == data2)
		{
			check2 = i;
		}
	}
	
	temp = scores[check1];
	scores[check1] = scores[check2];
	scores[check2] = temp;
	
	System.out.print("[");
	for(int i=0; i<5; i++)
	{
		System.out.print(scores[i]+" ");
	}
	System.out.print("]");
	System.out.println();
}
}
