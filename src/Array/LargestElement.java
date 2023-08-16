package Array;

public class LargestElement {
	public static void main(String[] args) {
	    int []arr={5,9,2,10,67};
	int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
						}	
	}
	System.out.println("largest element:" +max);
	}
}
