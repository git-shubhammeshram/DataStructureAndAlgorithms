package PracticeCodingProblem;

public class _6_CheckSortedArray {
	public static String isSorted(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			if(array[i]>array[i+1])
				return "Array is not sorted";
		}
		return "Array is sorted";
	}

	public static void main(String[] args) {
		int[] array = {1, 6, 3, 4, 5};
		System.out.println(isSorted(array));
	}

}
