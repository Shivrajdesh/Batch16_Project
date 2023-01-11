package Practice_package;

public class star_pattern {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			for(int b=6;b>=a;b--) {
			System.out.print(" ");
			}
			for(int c=1;c<=a;c++) {
				
				System.out.print("* ");
			}
			System.out.println();
			}

	}

}
