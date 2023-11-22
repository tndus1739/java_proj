package sy;

import java.util.Scanner;

public class S {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in)	;
	
	String  stu;
	int kor;
	int eng;
	int math;
	 
	int hap;
	double avg;

	System.out.println("학생1의 [이름 국어 영어 수학]을 입력하세요.>>>>>");
	
	stu = sc.next();
	kor = sc.nextInt();
	eng = sc.nextInt();
	math = sc.nextInt();
	
	hap = kor + eng + math;
	avg = hap/3.0;
	

	// 출력 예시 - System.out.println("학생1의 점수의 합은 00점이고 평균은 00점 입니다."); 
	
	// 코드 입력 - System.out.printf 사용
			
	System.out.printf("%s의 점수의 합은 %d점이고 평균은 %4.2f점 입니다.\n", stu, hap, avg);
	
	System.out.println("=======================");
	
	//-------------------------------------------------------------------------
	
    System.out.println("학생1의 [이름 국어 영어 수학]을 입력하세요.>>>>>");
	
	stu = sc.next();
	kor = sc.nextInt();
	eng = sc.nextInt();
	math = sc.nextInt();
	
	hap = kor + eng + math;
	avg = hap/3.0;
	
	// 출력 예시 - System.out.println("학생1의 점수의 합은 00점이고 평균은 00점 입니다."); 
    
	// 코드 입력 - System.out.println 사용

	
	System.out.println( stu +"의 점수의 합은 " + hap +"점이고 평균은 "+ avg +"점 입니다.");
	
		
		
		
		
		
		
	}

}
