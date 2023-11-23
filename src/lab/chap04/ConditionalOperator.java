package lab.chap04;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 스캐너 장착 , 변수는 정수로 (콘솔로 입력) , %이용해서 나머지 , ||연산자 사용 (하나라도 true 이면 true) , 삼항 연산자 사용
		
		// 1. 스캐너로 정수 값을 인풋받아서 -> 출력내용 : 인풋 받은 값은 00 이고, 짝수 입니다. (or 홀수입니다.)
		
		// 2. 스캐너로 값을 인풋 받아서 -> 출력내용 : 인풋 받은 값은 00이고, 3,6,9의 배수 입니다. (or 3, 6, 9의 배수가 아닙니다.)
		
		
		
		
		
		// 1. 스캐너 장착
		
		Scanner sc = new Scanner(System.in);
		
		// 2. 인풋 받을 변수 선언 : 정수
		
		int abc ;
		
		// 3. 스캐너로 정수 값을 인풋 받음
		
		System.out.println("정수 값 하나를 입력하세요>>>"); // abc = sc.nextInt(); 이거 전에 넣어주어야함
		abc = sc.nextInt();
		
		System.out.printf("인풋 받은 값은 %d 이고, " , abc);
		System.out.println((abc % 2 == 0 ) ? "짝수입니다." : "홀수입니다.");
		
		//--------------------------------------------------------------------------
		
		System.out.println("정수 값 하나를 입력하세요>>>");
		
		abc = sc.nextInt();
		
		System.out.printf("인풋 받은 값은 %d 이고, " , abc);
		System.out.println((abc % 3 == 0 || abc % 3 == 0 || abc % 3 == 0 ) ? "3, 6, 9의 배수입니다." : "3, 6, 9의 배수가 아닙니다.");
		
		
	}

}
