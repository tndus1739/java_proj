package lab.chap02;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);     // sc를 사용함 , 라이브러리 상단에 넣어놔
		
		// 스캐너로 각 변수의 값을 인풋 받아서 작성
		
		String stu ;  // 학생1
		
		int kor ;      // 국어점수
		int eng ;	   // 영어점수
		int math ;     // 수학점수
		
		int hap ; 	   // 점수의 합계
		double avg ;    // 평균
		
	
		System.out.println("==========첫번째학생==========");
		System.out.println("학생1의 [이름 국어점수 영어점수 수학점수]를 입력하세요 >>>>");
		stu =sc.next();        //콘솔에서 인풋을 대기
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap / 3.0 ;     //3.0은 더블
		
		// 코드 부분
		
		//System.out.println("홍길동의 모든 점수의 합계는 333점이고 평균은 88.99입니다.");  // -> 출력결과
		
		System.out.println(stu+ "의 모든 점수의 합계는 " + hap +"점이고 평균은 "+ avg +"입니다." );
		System.out.println("============================");
		
		
		System.out.println("==========두번째학생==========");
		System.out.println("학생2의 [이름 국어점수 영어점수 수학점수]를 입력하세요 >>>>");
		stu =sc.next();        //콘솔에서 인풋을 대기
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap / 3.0 ;     //3.0은 더블
		
		// 코드 부분
		
		//System.out.println("홍길동의 모든 점수의 합계는 333점이고 평균은 88.99입니다.");  // -> 출력결과
		
		System.out.println(stu+ "의 모든 점수의 합계는 " + hap +"점이고 평균은 "+ avg +"입니다." );
		System.out.println("============================");
		
		System.out.println("==========세번재학생==========");
		System.out.println("학생3의 [이름 국어점수 영어점수 수학점수]를 입력하세요 >>>>");
		stu =sc.next();        //콘솔에서 인풋을 대기
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		hap = kor + eng + math;
		avg = hap / 3.0 ;     //3.0은 더블
		
		// 코드 부분
		
		//System.out.println("홍길동의 모든 점수의 합계는 333점이고 평균은 88.99입니다.");  // -> 출력결과
		
		System.out.println(stu+ "의 모든 점수의 합계는 " + hap +"점이고 평균은 "+ avg +"입니다." );
		System.out.println("============================");
				
		
				
		
	}

}
