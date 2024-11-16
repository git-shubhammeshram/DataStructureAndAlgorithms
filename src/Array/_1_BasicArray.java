package Array;

public class _1_BasicArray {
	/*
	An array is a collection of elements of the same type stored in contiguous memory locations.
	Array is declared using square brackets ([]).
	Syntax: datatype[] arrayName = new datatype[size];
	Example: int[] numbers = new int[5];
	KeyPoint:-
		1.Size is fixed
		2.Contiguous memory locations
		3.Elements can be accessed using index (0-based)
		4.Index based memory locations
		5.Store homogeneous elements


	Types of arrays:
	1. Single-dimensional array
	2. Multidimensional array

	Note: Array size cannot be changed once initialized.

	Types of declarations of arrays:
	1. Declaration and initialization in one line
		int x[] = new int{1,2,3,4,5};
	2. Declaration, initialization, and assignment in separate lines
	    int[] x;
	    x = new int[5];
	    x[0] = 1;
	    x[1] = 2;
	    x[2] = 3;
	    x[3] = 4;
	    x[4] = 5;
	3. Declaration and assignment in separate lines
	    int[] x = new int[5];
	    for(int i=0; i<5; i++)
            x[i] = i+1;

    Types of accessing the values of array:
    1.Using for loop
    for (int i=0; i<arr.length; i++){
        System.out.println(x[i]);

    2. Using for-each loop
    for (int num : x){
        System.out.println(num);
    }

    3. Using index notation (x[index])
    System.out.println(x[0]);

    4. Using stream api Java-8
    Arrays.stream(x).forEach(System.out::println);

    How to calculate address of an Arrays:
    Base Address + nth element + size of block
    => 1000 + 4 * 4
    => 1000 + 16
    => 1016

    Basic memory size
    1 Bytes => 8 bits
    4 Bytes => 32 bits
    => 32 bits / 8 bits = 4 bytes
    => 4 bytes * 10 elements = 40 bytes
    => 40 bytes / 4 bytes per student = 10 students


    Benefits of using an Arrays:
    1. Easy to use
    2. Efficient memory management
    3. Array can be of any type
    4. Array size is fixed
    5. Array can be passed as a function argument
    6. Array can be returned from a function
    7. Array can be passed as a parameter to a method
    8. Array can be used as a data structure for storing and managing multiple elements
    9. Array can be used as a data structure for sorting and searching elements
    10. Array can be used as a data structure for performing mathematical operations
    11. Array can be used as a data structure for performing complex mathematical operations
    12. Array can be used as a data structure for managing and organizing data in a hierarchical or tree-like structure
    13. Array can be used as a data structure for managing and organizing data in a graph-like structure

    14.Efficient index-based access
    15.Optimize fetched cache (storing data into cache memory)



	*/

	public void display(){
		int marks[] = {80,90,45,38,70,60,55,48,25,18};
		int failedCount = 0;

		for(int x:marks){
			if(x<=40){
	            failedCount++;
			}
		}

        System.out.println("Number of students failed: " + failedCount);

		int[] failedStudent = new int[failedCount];
		int studentCount = 0;

		for(int y:marks){
			if(y<=40){
				failedStudent[studentCount] = y;
				studentCount++;
			}
		}

		System.out.println("Failed students with marks: ");
		for(int z:failedStudent){
            System.out.println(z);
        }


	}

	public static void main(String[] args) {
		_1_BasicArray obj = new _1_BasicArray();
        obj.display();
	}
}
