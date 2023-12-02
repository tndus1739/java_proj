package chap02.ex04;

public class TypeCasting2 {

	public static void main(String[] args) {

		int kor = 77;     // 국어점수
		int eng = 88;     // 영어점수
		int math = 98;	  // 수학점수
		
		// 합계 : kor + eng + math
		System.out.println(" 합계 : " + kor + eng + math);   // ( ) 없으면 문자열로 인식해서 계산 안함
		System.out.println(" 합계 : " + (kor + eng + math)); // ( ) 적용해면 먼저 처리해서 계산
		
		// 평균 : (kor + eng + math) / 3
		System.out.println(" 캐스팅하지 않는 평균 : " + (kor + eng + math) / 3 );
		System.out.println(" 평균 : " + ((double)(kor + eng + math)) / 3 );
		System.out.println(" 평균 : " + ((double)(kor + eng + math)) / 3 );
		
		System.out.println("========================");
		
		int hap = kor + eng + math ;
		
		double avg = ((double) hap) /3;		// hap은 int인데 double로 업캐스팅 후 3으로 나눔
		
		double avg1 = hap / 3 ;		// 87.0이 출력   (int/int) : 정수/정수 -> 정수 -> 더블
		double avg2 = hap / 3.0 ;   // 3.0은 double이라서 자동으로 double을 만들어 줌 : 정수(더블)/더블-> 더블 -> 더블
		//																		 앞에 있는 정수가 뒤에 있는 3.0 때문에 더블로 업캐스팅
		
		
		System.out.println(" 합계 : " + hap );
		System.out.println(" 평균 : " + avg );
		
		System.out.println("=========================");
		System.out.println("avg1 : " + avg1);
		System.out.println("avg2 : " + avg2);
		
		
		
		
		
	}

}
