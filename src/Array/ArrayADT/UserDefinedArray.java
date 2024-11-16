package Array.ArrayADT;

public class UserDefinedArray {
	private int[] array;
	private int index;
	private int size;

	UserDefinedArray(int size ){
		this.size = size;
		this.array = new  int [this.size];
		this.index = 0;
	}

	public void insert(int value){
		if(index == size){
			System.out.println("Array is full");
			return;
		}
		array[index] = value;
		index++;
	}



}
