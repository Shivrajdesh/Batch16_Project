package Practice_package;

public class rev_string {

	public static void main(String[] args) {
		String a="Shivraj";
		String b="";
		int L=a.length();
		for(int c=L-1;c>=0;c--) {
			b=b+a.charAt(c);
		}
 
		System.out.println(b);
	}

}
