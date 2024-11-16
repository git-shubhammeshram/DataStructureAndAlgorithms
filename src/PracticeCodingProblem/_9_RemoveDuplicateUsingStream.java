package PracticeCodingProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class _9_RemoveDuplicateUsingStream {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 2, 3, 5, 6, 5};
		Set<Integer> uniqueNumber = new HashSet<>();

		for(int x:numbers){
			uniqueNumber.add(x);
		}

		int[] result = uniqueNumber.stream().mapToInt(Integer::intValue).toArray();

		System.out.println("After removing the duplicate :- "+ Arrays.toString(result));
	}
}
