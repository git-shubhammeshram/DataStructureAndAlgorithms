package PracticeCodingProblem;

public class _10_FindMissingNumber {
	// TODO: Implement the solution here
	public static void findMissingNumber(int[] numbers){

		int n = numbers.length+1;
		int expectedSum = n*(n+1)/2;
		int actSum = 0;

		for(int x:numbers)
			actSum = actSum+x;

		int missingNumber = expectedSum-actSum;

		System.out.println("Missing number is:- "+missingNumber);

	}

	public static void main(String[] args) {
		int[] array = {1,2,4,5,6};
		findMissingNumber(array);
	}


}
