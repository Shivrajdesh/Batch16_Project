package Practice_package;

public class largest_num {

	public static void main(String[] args) {
		int a=90,b=20,c=30;
		
		if(a>=b && a>=c) {
			System.out.println("Largest num is=" +a);
		}
		else if(b>=a && b>=c) {
			System.out.println("Largest num is=" +b);
		}
		else {
			System.out.println("Largest num is=" +c);
		}

	}

}
