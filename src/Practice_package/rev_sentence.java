package Practice_package;

public class rev_sentence {

	public static void main(String[] args) {
		String a="My name is Shivraj";
		 String b="";
		 String [] c=a.split(" ");
		 for(int d=c.length-1;d>=0;d--) {
			 b=b+c[d]+" ";
		 }
		 System.out.println(b);
	}

}
