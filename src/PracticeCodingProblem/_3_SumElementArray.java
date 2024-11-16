package PracticeCodingProblem;

import java.util.Scanner;

public class _3_SumElementArray {
	public static void show(int[] numbers) {
		int sum = 0;
		for (int x : numbers) {
			sum = sum + x;
		}
		System.out.println("Sum of elements " + sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int[] numbers = new int[scan.nextInt()];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
		show(numbers);
	}
}
