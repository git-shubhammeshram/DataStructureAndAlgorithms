package FindComplexity;

public class _1_Program {

	int display(/*n- input*/){
		System.out.println("Say Hello"); // O(k1)
		int a = 10;
										// O(k2)
        int b = 20;
		return a+b;						// O(k3)
	}

	/*
	=> O(k1)+O(k2)+O(K3)
	=> O(1)+O(1)+O(1)
	=> O(1)
	*/

	public static void main(String[] args) {

		_1_Program x = new _1_Program();
		System.out.println(x.display());


	}

}
