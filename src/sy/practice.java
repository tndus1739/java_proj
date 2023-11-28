package sy;

public class practice {

	
	public static void main(String[] args) {
		
		int c = 5 , b = 5;
		System.out.println("-------------------");
		System.out.println(c + " ,  " + b);
		 b = c++;
		 System.out.println("-------------------");
		System.out.println(c + " ,  " + b);
		
		c = 5;
		b = 0;
		System.out.println("-------------------");
		System.out.println(c + " ,  " + b);
		System.out.println("-------------------");
		b = ++c ;
		System.out.println(c + " ,  " + b);
		System.out.println("==========================");
		
		
	}
}
