package FindComplexity;

public class _5_Program {
	void display(){
		int n = 1000000;

		for(int i = 0; i < n; i++){			//(n)
			for(int j = 0; j < n; j++){		//(n)
				System.out.println("Batman");//(1)
			}
		}
	}

	/*
	The time complexity of this program is O(n^2).
	This is because there are two nested loops, each iterating n times, resulting in a total of n * n = n^2 operations.
	The space complexity of this program is O(1).
	=> O(n)*O(n)
	=> O(n^2)
	*/
}
