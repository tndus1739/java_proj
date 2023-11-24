package lab.chap04;

public class While_Statement {

	public static void main(String[] args) {

		// 1000 부터 1 까지 5씩 감소하면서 출력 : for 문 , while문으로 출력		
		
		
		// for
		
		for ( int a = 1000 ; a > 0 ; a-=5) {
			System.out.println("a의 값 : " + a);
		}
		
		System.out.println("===================");
		

		// while
		
		System.out.println("====while====");
		int b = 1000 ;
		while ( b > 0 ) {
			System.out.println("b의 값 : " + b);
			b-=5 ;
		}
		
		
		// while + break;

		
		int c = 1000 ;
		while ( c <= 1000) {
			System.out.println("c의 값 : " + c);
			if (c == 5 ) 
			break ;
			c-=5 ;
		}
		
	}

}
