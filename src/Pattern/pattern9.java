package Pattern;

public class pattern9 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int P='A';
			for(int j=1;j<=i;j++) {
				System.out.print((char)P++ +" ");
			}
			System.out.println();
		}
	}
}
