package sy;

import java.util.Scanner;

public class Shopping_Test {

	public static void main(String[] args) {

		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		Shopping s1 = new Shopping();
		
		
		String name;
		int price;
		int cnt;
		
		
		
		
		System.out.println("구매하고 싶은 제품을 입력하세요");
		name = sc.next();
		s1.name(name);
		

		
	    System.out.println("구매하고 싶은 수량을 입력하세요");
		
		cnt = sc.nextInt();
		
		System.out.println("제품금액 10000");
	    price = sc.nextInt();
	    
	    System.out.println( "구매하신" + name + "의 가격은 " + price+ "입니다.");
	   s1.setPrice(price);
	   s1.setCnt(cnt);
	   
	    s1.multi(10000, 2);
	    
	    s1.toto();
		
		
	}

	
	
	
}
