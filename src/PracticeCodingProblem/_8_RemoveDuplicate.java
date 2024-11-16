package PracticeCodingProblem;

public class _8_RemoveDuplicate {
	public static void display(int[] array){
		int[] numbers = new int[array.length];
		int index = 0;

		for(int i=0; i<array.length; i++){
			boolean isDuplicate = false;
			for(int j=0; j<numbers.length; j++){
				if(array[i] == numbers[j]){
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate){
				numbers[index] = array[i];
				index++;
			}
		}

		System.out.println("After removing the duplicate");
		for(int i=0; i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,3,4,5,5,6,7,7,8,9};
        display(array);
	}
}
