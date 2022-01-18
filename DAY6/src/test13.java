import java.util.Random;

public class test13 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] check = new int[5];
		
		Random ran = new Random();
		
		for(int i=0;i<5;i++)
		{
			int num = ran.nextInt(5);
			arr[i] = num;
			if(check[num] == 0)
			{
				check[num] = 1;
			}
			else
			{
				i--;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
