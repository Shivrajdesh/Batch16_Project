package Practice_package;

public class rev_pyramid {

	public static void main(String[] args) {
		for(int a=1;a<=6;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print(" ");
			}
			for(int c=5;c>=a;c--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
