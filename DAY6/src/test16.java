import java.util.Scanner;

public class test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] game = new int[9];
		
		int turn = 0;
		int win = 0;
		
		while(true)
		{	
			
			for(int i=0;i<9;i++)
			{
				if(game[i] == 0)
				{
					System.out.print("[ ]");
				}
				else if(game[i] == 1)
				{
					System.out.print("[O]");
				}
				else if(game[i] == 2)
				{
					System.out.print("[X]");
				}
				
				if(i==2 || i==5)
				{
					System.out.println();
				}
			}
			System.out.println();
			
			if(win == 1)
			{
				System.out.println("p1 ½Â¸®");
				break;
			}
			else if(win == 2)
			{
				System.out.println("p2 ½Â¸®");
				break;
			}
			
			if(turn%2 == 0)
			{
				System.out.print("[p1]ÀÎµ¦½º ÀÔ·Â:");
				int data = sc.nextInt();
				
				if(game[data] == 0)
				{
					game[data] = 1;
					turn++;
				}
				
			}
			else if(turn%2 == 1)
			{
				System.out.print("[p2]ÀÎµ¦½º ÀÔ·Â");
				int data = sc.nextInt();
				
				if(game[data] == 0)
				{
					game[data] = 2;
					turn++;
				}
			}
			
			for(int i=0;i<7;i++)
			{
				if(game[i]==1 && game[i+1]==1 && game[i+2]==1)
				{
					win = 1;
				}
				else if(game[i]==2 && game[i+1]==2 && game[i+2]==2)
				{
					win = 2;
				}
			}
			
			for(int i=0;i<3;i++)
			{
				if(game[i]==1 && game[i+3]==1 && game[i+6]==1)
				{
					win = 1;
				}
				else if(game[i]==2 && game[i+3]==2 && game[i+6]==2)
				{
					win = 2;
				}
			}
			
			for(int i=0;i<3;i++)
			{
				if(game[i]==1 && game[i+4]==1 && game[i+8]==1)
				{
					win = 1;
				}
				else if(game[i]==2 && game[i+4]==2 && game[i+8]==2)
				{
					win = 2;
				}
			}
		}
	}
}
