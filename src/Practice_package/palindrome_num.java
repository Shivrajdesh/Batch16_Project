package Practice_package;

public class palindrome_num {

	public static void main(String[] args) {
		int a=1441,b=a,rem,rev=0;
		while(b!=0) {
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
		}
		if(rev==a) {
			System.out.println("this is palindrome");
		}
		else {
			System.out.println("this is not palindrome");
		}
	}

}
