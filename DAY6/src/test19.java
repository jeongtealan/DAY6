import java.util.Random;

public class test19 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];
		int strike = 0;
		int ball = 0;
		
		int i = 0;
		while(i<3)
		{
			int num = ran.nextInt(10) +1;
			int check = 1;
			int j = 0;
			while(j<i)
			{
				if(num == me[j])
				{
					check--;
				}
				j++;
			}
			if(check == 1)
			{
				me[i] = num;
				i++;
			}
		}
		
		System.out.print("com= ");
		for(int j=0;j<3;j++)
		{
			System.out.print(com[j]+" ");
		}
		System.out.println();
		
		System.out.print("me=  ");
		for(int j=0;j<3;j++)
		{
			System.out.print(me[j]+" ");
		}
		System.out.println();
		
		
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<3;k++)
			{
				if(j!=k)
				{
					if(com[j] == me[k])
					{
						ball++;
					}
				}
				else if(j==k)
				{
					if(com[j] == me[k])
					{
						strike++;
					}
				}
			}
		}
		
		System.out.println();
		System.out.println(strike+"strike");
		System.out.println(ball+"ball");
		
		if(strike == 3)
		{
			System.out.println("»ïÁø ¾Æ¿ô!");
		}
		if(ball == 4)
		{
			System.out.println("Æ÷º¼ Ãâ·ç!");
		}
	}
}
