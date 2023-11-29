package sy;

class Test{
	
	String name;
	int age;
	int kor;
	int eng;
	int math;
	double avg;
	
	
	Test  (){}
	
	Test ( String name, int age, int kor, int eng,int math,double avg  ){
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg ;
	}
		
	void printAll() {
		System.out.println("이름 : " + name + "나이 : " + age );
		System.out.println("국어점수 : " + kor );
		System.out.println("영어점수 : " + eng );
		System.out.println("수학점수 : " + math );
		System.out.println("평균 : " + avg );
		
		
	}
	double avg() {
		double avg1 = 0.0;
		avg1 = (kor + eng + math) / 3.0;
		return avg1;
	}
	
	
	
}


public class practice2 {

	public static void main(String[] args) {
		
		Test test1 = new Test("홍길동", 25, 98, 87, 100, 80 );
		
		
		test1.printAll();
		
		System.out.println(test1.avg);
		
		
		Test test2 = new Test();
		
		test2.name = "이길동";
		test2.age = 21;
		test2.kor = 63;
		test2.eng = 90;
		test2.math = 85;
		System.out.println("=======================");
		System.out.println("평균출력 : " + test2.avg());
		
	}
	
}
