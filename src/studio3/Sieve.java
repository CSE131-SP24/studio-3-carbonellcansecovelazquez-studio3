package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		int array[] = new int[n];


		for (int i = 0; i < array.length; i++) {
			array[i] = i+2;
		}
		
		for (int i = 2; i < array.length; i++) {
			
			if (array[i]!=-1) {
				for (int j=i; j<array.length; j++) {
					int k = j*i;
					if (k-2 <array.length && array[k-2]!=-1) {
						array[k-2]= -1;
					}
				}
				
			}
		}
		
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]!=-1) {
				System.out.println(array[i]);
			}
		}
	

	}
}