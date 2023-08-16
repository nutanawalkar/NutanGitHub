package Pattern;

public class pattern6 {
	public static void main(String[] args) {
		for(int i=1,P='A';i<=5;i++,P++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)P+" ");
			}
			System.out.println();
		}
	}
}
