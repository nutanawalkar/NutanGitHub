package Array;

public class ArraySum {
	public static void main(String[] args) {
	    int []arr={5,9,2,10,67};
	    int sum=0;
	    for(int i=0;i<arr.length;i++) {
	    	sum=sum+arr[i];
	    }
	    System.out.println("sum of elements present in array:" +sum);
	}
}
  