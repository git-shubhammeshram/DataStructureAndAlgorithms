package PracticeCodingProblem;

import java.util.Scanner;

public class _2_ReverseArray {
	public static void reverseArray(int [] number){
		int size = number.length;
		int[] reversedArray = new int[size];
		int index = 0;

		for(int i=reversedArray.length-1; i>=0; i--){
			reversedArray[index] = number[i];
			index++;
		}
		System.out.println("Reversed Array:");
		for(int x:reversedArray){
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int[] number = new int[scan.nextInt()];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<number.length; i++){
            number[i] = scan.nextInt();
        }
        reverseArray(number);
	}
}
