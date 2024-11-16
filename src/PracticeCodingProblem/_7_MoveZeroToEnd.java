package PracticeCodingProblem;

public class _7_MoveZeroToEnd {
	public static void moveZeroes(int[] array) {
		int index = 0;
		for(int i=0; i< array.length; i++){
			if(array[i]!=0){
			//  0 != 0
			//	1 != 0
			//  0 != 0
			//  2 != 0
			//  3 != 0
			//  4 != 0
			//  5 != 0
				array[index] = array[i];
			//	0 = 1
			//  1 = 2
			//  2 = 3
			//  3 = 4
			//  4 = 5
				index++;
			// 1 2 3 4 5
			}
			//1 2 3 4 5 4 5
		}
		while (index<array.length){
			// 5 < 6
			array[index] = 0;
			//     5 = 0
			index++;
			//6
		}

		for (int j : array) {
			System.out.print(j+" ");
		}

	}

	public static void main(String[] args) {
		int[] array = {0,1,0,2,3,4,5};
		moveZeroes(array);
	}
}
