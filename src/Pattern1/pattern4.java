package Pattern1;

public class pattern4 {
	public static void main(String[] args) {
		for(int i=1,a=5;i<=5;i++,a--) {
			for(int j=5;j>=i;j--) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
