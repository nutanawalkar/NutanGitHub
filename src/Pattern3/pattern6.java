package Pattern3;

public class pattern6 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int count=1;
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(count++);
			}
			System.out.println();
		}
	}
}
