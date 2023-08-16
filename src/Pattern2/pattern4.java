package Pattern2;

public class pattern4 { 
	public static void main(String[] args) {
	for(int i=1,P='A';i<=5;i++,P++) {
		for(int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print((char)P+" ");
		}
		System.out.println();
	}
}
}
