
public class test10 {
	public static void main(String[] args) {
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int count = 0;
		for(int i=0;i<5;i++)
		{
			if(arr[i]%4 == 0)
			{	
				count++;
			}
		}
		
		temp = new int[count];
		int check = 0;
		
		for(int i = 0; i<5; i++)
		{
			if(arr[i]%4 == 0)
			{
				temp[check] = arr[i];
				check++;
			}
		}
		
		System.out.print("[");
		for(int i = 0; i<count; i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println("]");
	}
}
