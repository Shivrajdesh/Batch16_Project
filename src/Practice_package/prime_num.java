package Practice_package;

public class prime_num {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		for(int c=1;c<=a;c++) {
			if(a%c==0) {
				b++;
			}
		}
			if(b==2) {
				
				System.out.println("this is prime");
			}
			else {
				System.out.println("this is not prime");
			}
		}

	}


