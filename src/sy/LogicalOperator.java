package sy;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//      00은 10보다 크고 20 보다 작습니다. / 
		
		int a ;
			
		System.out.println("숫자를 입력하세요");
		
		a = sc.nextInt() ;
		
		if ( a > 10 && a < 20) {
			System.out.printf("%d은 10보다 크고 20보다 작습니다.\n\n", a);
		} else if (a >= 20 && a < 30 ) {
			System.out.printf("%d은 20보다 크고 30보다 작습니다.\n\n", a);
		} else {
			System.out.printf("범위를 벗어났습니다.\n\n");
		}
//		-------------------------------------------------------

		String bbb ;
		int num ;
		System.out.println("본인의 거주지역과 거주기간을 입력하세요.>>>>>");
		
		bbb = sc.next();
		num = sc.nextInt();
		
		System.out.printf("거주지역은 %s이고 거주기간은 %d입니다.\n",bbb,num );
		
		
		
		int ccc ;
		
		System.out.println("숫자를 입력하세요");
		
		ccc = sc.nextInt() ;
		
		if (ccc > 20 && ccc <= 30) {
			System.out.printf("%d는 20 ~ 30 사이의 수 입니다.", ccc);
		}else if (ccc >= 31 && ccc <= 40 ) {
			System.out.printf("%d는 31 ~ 40 사이의 수 입니다.", ccc);
		}else {
			System.out.println( "범위를 벗어났습니다. 다시 입력해주세요 ");
		}
		
	}
	
	
	
	
	

}
