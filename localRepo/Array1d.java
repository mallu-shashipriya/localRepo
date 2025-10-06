package array_pack;

import java.util.Arrays;
import java.util.Scanner;

public class Array1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
//		int[] arr1 = {10,20,30,40,50};
//		
//		for(int i : arr1) {
//			System.out.println(i);
//		}
//		
		
//		int[] arr2 = new int[10];
		System.out.print("Size of Array: ");
		int len = scn.nextInt();
		int[] arr2 = new int[len];
		System.out.print("Size of Array: ");
		int len = scn.nextInt();
		int[] arr2 = new int[len];
		for(int i = 0; i < 5; i++) {
			arr2[i] = scn.nextInt();
		}
		
		Arrays.sort(arr2);
		for(int i : arr2) {
			System.out.println(i);
		}
		
		int selmt = scn.nextInt();
		System.out.println(Arrays.binarySearch(arr2, selmt));
		
		
		System.out.println(Arrays.toString(arr2));
		scn.close();
	}

}
