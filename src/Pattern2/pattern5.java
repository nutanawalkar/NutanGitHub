package Pattern2;

public class pattern5 {
	public static void main(String[] args) {
		for(int i=1,a=0;i<=5;i++,a+=2) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
