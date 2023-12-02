package sy;

import java.util.Scanner;

public class oo_Switch {
	
	public static void main(String[] args) {
	
	// Switch
		
	Scanner sc = new Scanner(System.in);
	
	String select ;
	int color ; 
	String pay; 
	
	System.out.println("==========================");
	System.out.println("a. Iphone 7");
	System.out.println("b. Iphone 13");
	System.out.println("c. Iphone 15");
	System.out.println("==========================");
	System.out.println("보기 중 하나를 선택하세요.");
	System.out.println("==========================");
		
	select = sc.next();
	
	System.out.println("==========================");
	System.out.println("색상 선택을 위해 번호를 눌러주세요.");
	System.out.println("1. pink 2. whihe 3. black");
	System.out.println("==========================");
	
	color = sc.nextInt();
	
	switch(select) {
	case "a" : 
		if (color == 1 || color == 2) {
			System.out.println("카드와 현금 중 결제 수단을 선택해주세요.");
			 pay = sc.next();
			 System.out.println(pay+ "를 선택하셨습니다.");
			 
			 	if (pay.equals("카드")) {
			
			  System.out.println("결제가 완료되었습니다.");	
		
		  	}else {
			 System.out.println("잔액이 부족합니다.");	
		  	}
		  	}else  {
		  
		 System.out.println("black의 재고가 부족합니다.");
	}	
		break;
	case "b" :
		if (color == 1 || color == 2) {
			System.out.println("카드와 현금 중 결제 수단을 선택해주세요.");
			pay = sc.next();
			 if (pay.equals("카드")) {
					
				  System.out.println("결제가 완료되었습니다.");	
			
			  	}else {
				 System.out.println("잔액이 부족합니다.");	
			  	}
			  	}else  {
			  
			 System.out.println("black의 재고가 부족합니다.");
		}	
		break;
	
    default:
    	
    	System.out.println("재고가 부족합니다.다른 기종을 선택해주세요.");	
	
	}
		
	
		
	
		
		
		
		
		
}
}
