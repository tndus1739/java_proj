package chap03.ex02;

import java.util.Scanner;

public class BitWiseOperator {

	public static void main(String[] args) {

		// 다양한 진법 표현, 비트연산자
		
		// 1. 다양한 진법 표현 : 2진수 , 10진수 , 8진수 16진수 . calc (계산기)  -> 모든 언어 공통
		 
		int date = 13 ;
		
		// 정수를 2진수로 변환 : Integer.toBinaryString(젼환할 정수) -> 2진수로 출력
		System.out.println(Integer.toBinaryString(date)); // 1101
			
		// 정수를 16진수로 변환 : Integer.toHexString(젼환할 정수) -> 16진수로 출력
		System.out.println(Integer.toHexString(date));	// d로 출력
		
		// 정수를 8진수로 변환 : Integer.toOctaLString(젼환할 정수) -> 8진수로 출력
		System.out.println(Integer.toOctalString(date));	// 15
		
		// 문자열로된 숫자를 정수 타입으로 변환 (★★★ 중요하고 많이 사용)
		System.out.println( "3"+"5");		//숫자로 되어있지만 문자열 ( 문자열 + 문자열 = 문자열 연결)  //35
		
		// Integer.parseInt("숫자(정수만 OK)-실수는 X"); -> 정수 타입으로 저장됨 ★★★★★★★★
		System.out.println(Integer.parseInt("3")+ Integer.parseInt("5"));		//8
		
		// 문자열로된 실수를 실수 타입으로 변환 -> 실수 타입으로 저장 (★★★ 중요하고 많이 사용)
		// Double.perseDouble("13.5") -> 실수로 변환
		
		System.out.println("13.5" + "17.77");    // 13.517.77
		
		System.out.println(Double.parseDouble("13.5") + Double.parseDouble("17.77"));    //31.27
		
		
		
		System.out.println("==============================");
		
		// 스캐너에서 숫자가 문자열로 들어왔을 대 정수로 변환, 실수로 변환 후 연산
		
		Scanner sc = new Scanner (System.in);    //ctrl + shif + o
		
		String kor ;
		String eng ;
		String avg ;
		
		System.out.println(" 국어점수(정수) 영어점수(정수) 평균(실수) 로 입력해 주세요>>>");
		
		kor = sc.next()	;	// 여기까지는 string
		eng = sc.next()	;	// 여기까지는 string
		avg = sc.next()	;	// 여기까지는 string
		
		// int hap = kor + avg ; -> 오류발생, 타입이 맞지 않는다.
		int hap = Integer.parseInt(kor) + Integer.parseInt(eng) ; //string을 int로 변경해야한다.
		
		System.out.println("국어점수 + 영어점수 : " + hap );
		System.out.println("평균출력 : " + Double.parseDouble(avg) );
		
		
	}

}
