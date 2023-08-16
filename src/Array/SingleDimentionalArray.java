package Array;

public class SingleDimentionalArray {
public static void main(String[] args) {
	// declare the array.
			int a[]=new int [6];
			
			// add the values in the array
			a[0]=10;
			a[1]=20;
			a[2]=30;
			a[3]=40;
			a[4]=50;
			a[5]=60;
			
			// how  to check the size/capacity/length of array
			System.out.println("The Size of the array is "+ a.length);
			
			// how to read single value in array.
			System.out.println(a[2]);
			
			// how to read all values in the array.
			for (int i=0; i<a.length;i++) {
				System.out.println(a[i]);
			}
}
}
