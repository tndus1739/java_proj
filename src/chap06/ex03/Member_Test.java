package chap06.ex03;

public class Member_Test {

	public static void main(String[] args) {

		// 같은 패키지 내에서는 import 없이 클래스를 사용할 수 있다.
		// 접근 제어자가 default 이상이어야 한다.
		
		// 1. 객체 생성
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
		// 2. 객체의 필드 접근 <- DB에 값을 불러와서 자바 객체에 필드의 값을 주입
			// 입력 : setter 로 입력
		
		m1.setIdx(1);
		m1.setId("ID001");
		m1.setPwd("1111");
		m1.setName("홍길동");
		m1.setPhone("010-7298-1173");
		m1.setYear(2002);
		m1.setMonth(9);
		m1.setDay(20);
		m1.setAddr("서울");
		
		m2.setIdx(2);
		m2.setId("ID002");
		m2.setPwd("2222");
		m2.setName("홍길순");
		m2.setPhone("010-5628-1173");
		m2.setYear(2006);
		m2.setMonth(11);
		m2.setDay(8);
		m2.setAddr("경기도");
		
		m3.setIdx(3);
		m3.setId("ID003");
		m3.setPwd("3333");
		m3.setName("이길맘");
		m3.setPhone("010-3645-1163");
		m3.setYear(1998);
		m3.setMonth(5);
		m3.setDay(18);
		m3.setAddr("부산");
		 
		m4.setIdx(4);
		m4.setId("ID004");
		m4.setPwd("4444");
		m4.setName("김자윤");
		m4.setPhone("010-3445-1135");
		m4.setYear(1985);
		m4.setMonth(1);
		m4.setDay(28);
		m4.setAddr("인천");
		
		
		// 3. 필드의 값을 출력
		
		// 출력 : getter 로 출력
		
		System.out.println(m1.getIdx());
		System.out.println(m1.getId());
		System.out.println(m1.getPwd());
		System.out.println(m1.getName());
		System.out.println(m1.getPhone());
		System.out.println(m1.getYear());
		System.out.println(m1.getMonth());
		System.out.println(m1.getDay());
		System.out.println(m1.getAddr());
		
		// 4. 객체 자체를 출력시 객체의 Heap의 주소가 출력  (toString() 메소드 Overriding이 안되어 있다면 주소가 출력)
		System.out.println(m1);                 // chap06.ex03.Member@1c4af82c : heap의 주소
		System.out.println(m2); 				// chap06.ex03.Member@379619aa : heap의 주소
		System.out.println(m3);			 		// chap06.ex03.Member@cac736f : heap의 주소
		System.out.println(m4); 				// chap06.ex03.Member@5e265ba4 : heap의 주소
	
		System.out.println("======================for문 으로 출력 =============================");
		
		// 5. 객체를 배열에 저장   -----> 컬렉션 ( ArrayList)에 저장
		
		Member[] arr = new Member[10];
		
		arr[0] = m1;
		arr[1] = m2;
		arr[2] = m3;
		arr[3] = m4;
		
		// 6. 배열의 정보를 끄집어 내서 출력
		
	for ( int i = 0 ; i < arr.length ; i++) {         // 객체를 끄집어내서 출력
		
		Member mem1 = arr[i];
		
		System.out.println(mem1);
	}
		
		
		
		
		
		
		
	}

}
