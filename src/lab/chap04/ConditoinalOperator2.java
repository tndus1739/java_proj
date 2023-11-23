package lab.chap04;

import java.util.Scanner;

public class ConditoinalOperator2 {

	public static void main(String[] args) {
 
		//scanner로 "안녕"문자열을 입력, "안녕"문자열이 입력되었을 때 "안녕하세요" 아니면 " 안녕못합니다."
		// ==을 사용하면 안되고 , .equals("안녕")? 사용
		// 삼항 연산자 사용
	

	Scanner sc = new Scanner(System.in)	;
    
	// 1. 변수 선언
	
	String str1 ;     //기본자료혀이 아니라 참조자료형 (변수(str1)의 값이 stack이 아니라 heap에 저장)
	
	System.out.println("단어 하나를 입력 하세요>>>");
    str1 =sc.next();
    
//	System.out.println((str1 == "안녕") ? "안녕하세요." : "안녕못합니다.");   // ==가 참조형(string)일때는 다르게 처리- . ==쓰면 오류발생
    System.out.println((str1.equals("안녕")) ? "안녕하세요." : "안녕못합니다.");
    
    // 참조 자료형일 때 변수의 값은 heap 공간에 저장됨, stack에는 변수의 값이 아니라 변수명과 heap에 저장된 값의 번지가 저장
	
	}
	
	
	
}
