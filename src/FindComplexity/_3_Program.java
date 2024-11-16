package FindComplexity;

public class _3_Program {

	void display(){
		System.out.println("Hello World");		//O(1)
		int n = 1000000;
		for(int i=0; i<n; i++){					//O(n)
			for(int j=0; j<100; j++){			//O(1)
				System.out.println("Hello World");//O(1)
			}
		}
	}

	/*
	 => O(1)+O(n)+O(1)+O(1)
	 => O(1)+O(n)
	 => O(n)
	*/
}
