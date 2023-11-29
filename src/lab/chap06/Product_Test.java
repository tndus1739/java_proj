package lab.chap06;

public class Product_Test {

	public static void main(String[] args) {

		// 1. Product 객체 4개 생성
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		
		// 2. setter를 사용해서 객체dml 필드의 값을 주입
		
		p1.setIdx(1);
		p1.setProName("Iphone");
		p1.setQty(45);
		p1.setYear(2017);
		p1.setProColor("pink");
		
		p2.setIdx(2);
		p2.setProName("TV");
		p2.setQty(500);
		p2.setYear(2023);
		p2.setProColor("White");
		
		p3.setIdx(3);
		p3.setProName("PC");
		p3.setQty(874);
		p3.setYear(2019);
		p3.setProColor("Black");
		
		p4.setIdx(4);
		p4.setProName("Pencil");
		p4.setQty(168);
		p4.setYear(2022);
		p4.setProColor("Silver");
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		
		// 3. 배열 arr , 방크기는 10개 : 0 ~ 9 , 각 방에 4개의 객체를 배열 방에 넣음 
		
		Product[] arr = new Product [10];
		
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		
		
		// 4. 배열의 값을 끄집어내서 Product 변수 p 에 담고 for 문으로출력
		
		System.out.println("============================ for문으로 출력 ==================================");
		
//		for ( int i = 0 ; i < arr.length ; i++) {
//			
//			Product p = arr[i];
//			System.out.println(p);
//			}
		
		for ( int i = 0 ; i < arr.length ; i++) {
			if (arr[i] != null) {
				Product p = arr[i];
				System.out.println(p);
			}
			
			}
		
		}
		
	}


