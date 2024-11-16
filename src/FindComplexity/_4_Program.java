package FindComplexity;

public class _4_Program {
	void display() {
		int n = 1000000;
		for(int i=0; i<n/2; i++) {
			System.out.println("Batman");
			System.out.println("Superman");
		}
	}

	/*
	Time Complexity: O(n/2) = O(n)
	Space Complexity: O(1) - Constant space used regardless of input size.
	This program prints "Batman" and "Superman" alternatively for a million times.
	Note: The actual time and space complexity might vary depending on the specific implementation and hardware.

	*/
}
