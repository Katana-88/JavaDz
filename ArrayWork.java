import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayWork {

	public static void main(String[] args) {
	
		//Task 1. Odd numbers from 1 to 99
		Integer [] arr = new Integer[50];
		int j=0;
		
		for (int i=1; i<100; i++) {
			if(i%2!=0) arr[j++]=i;
			}
		
		String arrToString = "";
		for(int x:arr){
			arrToString += x +" ";
			 }
		
		System.out.println(arrToString);
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		String arrToStringReverse = "";
		for(int x:arr){
			arrToStringReverse += x +" ";
			 }
		
		System.out.println(arrToStringReverse);		
		System.out.print("\n");
		
		//Task 2. Fibonacci numbers
		
		Integer [] arr2 = new Integer[20];
		arr2[0]=1;
		arr2[1]=1;
		
		for (int i=2; i<arr2.length; i++) {
			arr2[i]=arr2[i-1]+arr2[i-2];
			}
		
		for(int x:arr2){
			System.out.print(x + " ");
		}
		System.out.println("\n");
		
		//Task 3. Two-dimensional array. Filled with random numbers from 10 to 99
		
		int [][] arr3 = new int [8][5];
		Random rand=new Random();
		for(int i=0;i<8;i++){
			for(int k=0; k<5; k++) {
				arr3[i][k]=rand.nextInt(90)+10;
				System.out.print(arr3[i][k]+" ");
			}
			System.out.println();
		}		
	}
}
