package PracticeCodingProblem;

public class _5_SecondLargestElement {
	public static void secondLargestElement(){
		int[] array = {10, 20, 30, 40, 50};
		int largest = array[0];
		int secondLargest = array[1];

		for (int i=0; i<array.length; i++){
			if(array[i]>largest){
				secondLargest = largest;
                largest = array[i];
			}
			else {
				if(array[i]>secondLargest && array[i]!=largest){
                    secondLargest = array[i];
                }
			}
		}
		System.out.println(secondLargest);
	}

	public static void main(String[] args) {
		secondLargestElement();

	}
}
