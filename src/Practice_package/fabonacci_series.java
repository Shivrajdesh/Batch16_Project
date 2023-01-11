package Practice_package;

public class fabonacci_series {

	public static void main(String[] args) {
		int a=0, b=1,c;
		 System.out.println(a);
         System.out.println(b);
         for(int d=1;d<=10;d++) {
        	 c=a+b;
        	 System.out.println(c);
             a=b;
             b=c;
         }
	}

}
