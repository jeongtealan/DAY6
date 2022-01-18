import java.util.Scanner;

public class test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int exit = 10;
		int[] game = { 11, 15, 10, 14, 12, 13 };
		int check = 0;

		while (true) {
			System.out.println("exit= " + exit);
			System.out.print("[");
			for (int i = 0; i < 6; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.print("]");

			System.out.println("인덱스 위치를 입력하시오");
			int num = sc.nextInt();

			for (int i = 0; i < 6; i++) {
				if (game[i] == exit) {
					check = i;
					game[i] = 0;
				}
			}

			if (num == check) {
				exit++;
			}

			if (exit == 16) {
				System.out.println("모든 인덱스 위치를 맞췄습니다.");
				break;
			}

		}
	}
}
