import java.util.Scanner;
public class test11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = {10,20,30,40,50};
	
	System.out.println("인덱스 2개를 입력받아 값 교체하기");
	System.out.println("인덱스1 입력:");
	int idx1 = sc.nextInt();
	System.out.println("인덱스2 입력:");
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
	System.out.println("값 2개를 입력받아 값 교체하기");
	System.out.println("값1 입력:");
	int value1 = sc.nextInt();
	System.out.println("값2 입력:");
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
	System.out.println("학번2개를 입력받아 값 교체하기");
	System.out.println("학번1 입력:");
	int data1 = sc.nextInt();
	System.out.println("학번2 입력:");
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
