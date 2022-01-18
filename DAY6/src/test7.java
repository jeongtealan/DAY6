
public class test7 {
public static void main(String[] args) {
	
	int num = 0;
	num = 10;
	System.out.println("num = " + num);
	
	int[] array = new int[5];
	System.out.println("array = " + array);
	
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	System.out.println(array[3]);
	System.out.println(array[4]);
	System.out.println();
	
	array[0] = 10;
	array[1] = 20;
	array[2] = 30;
	array[3] = 40;
	array[4] = 50;
	
	for(int i=0; i<5; i++) {
		System.out.println(array[i]);
	}
	System.out.println();
}
}
