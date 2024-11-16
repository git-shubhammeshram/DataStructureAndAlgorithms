package FindComplexity;

public class _2_Program {

	int display(int[] array){
		int sum = 0;						//O(1)
		for (int j : array) {    			//O(n)
			sum = sum + j;                	//O(1)
		}
		return sum;							//O(1)
	}

	/*
		Time Complexity: O(n)
        Space Complexity: O(1)
        This program calculates the sum of elements in an array. It has a time complexity of O(n) and a space complexity of O(1).
        It uses a single loop to iterate over the array and performs constant time operations (addition and assignment) for each element.
        The result is stored in the 'sum' variable, which is also a constant-time operation.
        The total time complexity is the sum of the time complexity of the loop and the constant time operations inside the loop.
        In this case, the total time complexity is O(n) + O(1) = O(n).
        The space complexity is the size of the 'sum' variable, which is constant (O(1)).
        The total space complexity is the sum of the space complexity of the 'sum' variable and the array itself.
        In this.

        Note: The space complexity of this program is O(1) because it uses a constant amount of extra space to store the 'sum' variable.
        The space complexity of the program does not depend on the size of the input array.

        The time complexity of this program is O(n) because it iterates over the array once.

        => O(n)+O(1)
        => O(n)
	*/

	public static void main(String[] args) {
		_2_Program obj = new _2_Program();
        int[] array = {1,2,3,4,5};
        System.out.println("Sum of array elements: "+obj.display(array));
	}
}
