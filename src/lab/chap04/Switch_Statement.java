package lab.chap04;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		/*	
		  
		  	switch 문을 사용해서 출력 / if ~ else if 문 사용해서 출력
	
 			스캐너로 정수를 입력 받으세요.
 			1	"당신은 금메달을 획득했습니다."
 			2	"당신은 은메달을 획득했습니다."
 			3	"당신은 동메달을 획득했습니다."
 				"정수 1 ~ 3 중 하나의 값을 넣으세요."
 
 * */
		
// ------------------------------------------------------------------------------		
		Scanner sc = new Scanner(System.in)	;
		
		int num ;
		
		System.out.println("정수 1 ~ 3 중 하나의 값을 넣으세요.");
		
		num = sc.nextInt();
	
		
// 		1. switch 문
		
		System.out.println("======switch 문으로 출력=======");
		
		switch (num) {
		case 1 : case 10 : case 100 :						// switch문에서 여러 개의 조건들을 동시에 처리할 때 case 여러 개 사용
			System.out.println("당신은 금메달을 획득했습니다.");		// if문에서는 ||사용
			break;
		case 2 :
			System.out.println("당신은 은메달을 획득했습니다.");
			break;
		case 3 :
			System.out.println("당신은 동메달을 획득했습니다.");
			break;
		default :
			System.out.println("정수 1 ~ 3 중 하나의 값을 넣으세요.");
		
		}

		System.out.println("========if 문으로 출력=========");
		
//		2. if ~ else if 문 
		
		 
		
		if (num == 1 ||num == 10 || num == 100 ) {			// if문에서 여러 개의 조건들을 동시에 처리할 때 || 사용
			System.out.println("당신은 금메달을 획득했습니다.");
		} else if (num == 2) {
			System.out.println("당신은 은메달을 획득했습니다.");
		} else if (num == 3) {
			System.out.println("당신은 동메달을 획득했습니다.");
		} else {
			System.out.println("정수 1 ~ 3 중 하나의 값을 넣으세요.");
		}
		
	}

}
