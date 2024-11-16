package PracticeCodingProblem;

import java.util.Scanner;

public class _4_CountTheOccurrence {

	public static void countOccurrence(int[] array, int target) {
		int count = 0;
		for (int j : array) {
			if (j == target) {
				count++;
			}
		}

		System.out.println("Number of occurrences: " + count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int[] number = new int[scan.nextInt()];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < number.length; i++) {
            number[i] = scan.nextInt();
        }
		System.out.println("Enter the target number:");
		int target = scan.nextInt();

		countOccurrence(number, target);
	}
}
