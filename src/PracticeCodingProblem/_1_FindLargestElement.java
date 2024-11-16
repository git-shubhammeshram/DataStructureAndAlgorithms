package PracticeCodingProblem;

import java.util.Scanner;

public class _1_FindLargestElement {

	public static void largestElement(int[] number) {
		int largest = 0;
		int index = 0;

		for (int i = 1; i < number.length; i++) {
			largest = number[i];
			if (largest >= number[i]) {
				largest = number[i];
			}
			index++;
		}

		System.out.println("largest element found at index: " + index + " is : " + largest);


	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int[] number = new int[scan.nextInt()];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < number.length; i++) {
            number[i] = scan.nextInt();
        }
		largestElement(number);

	}
}

/*
This problem is solved by iterating over the array and comparing each element with the current largest element.
If the current element is larger, it updates the largest element. After the iteration, the largest element is found
and its index is printed.

Time Complexity: O(n), where n is the size of the array. This is because we iterate over the array once.
Space Complexity: O(1), constant space used regardless of the size of the array.

Note: The space complexity of this program is O(1) because it uses a constant amount of extra space to store the 'largest' and 'index' variables.


 */