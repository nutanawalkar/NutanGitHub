package Array;

public class multiDimensionalArray {
public static void main(String[] args) {

	int a [] [] = new int [3] [2]; // array declaration
	// inserting the values.
	a[0] [0] =100;
	a[0] [1] = 200;
	a[1] [0] =300;
	a[1] [1] = 400;
	a[2] [0] =500;
	a[2] [1] = 600;
	
	// find out the size 
	
	System.out.println("The Number of Rows "+ a.length );
	System.out.println("The Number of Columns "+ a[0].length);
	// Program to read array.
	
	for (int i=0; i<a.length;i++) {
		for (int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j] +" ");
		}
		System.out.println();
	}
	
}
}
