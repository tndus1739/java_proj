package chap17.ex02;

import java.util.ArrayList;
import java.util.List;

public class Student_Test {

	public static void main(String[] args) {

		// 1. Student 객체 생성
		
		Student s1 = new Student();						// 기본 생성자 호출
		Student s2 = new Student("홍길동");
		Student s3 = new Student(1111);					// -> 메소드는 Student로 다 동일한데 시그니처가 다음 : 오버로딩
		Student s4 = new Student("김길동", "서울");
		Student s5 = new Student("최길동", " 서울", 1111);
		
		// 2. 객체를 ArrayList<Student>에 저장  -> 배열에 넣지 않고 컬렉션에 넣는다.
		// < > 타입이 오는데 : 제너릭 타입이라고 하는데 반드시 객체형 타입이 적용이 되어야함
				// Boolean , Byte, Short, Integer , Long, Float , Double , Charter
		
		List<Student> aList = new ArrayList<>();

		// aList에 Student 객체 저장
		
		aList.add(s1);
		aList.add(s2);
		aList.add(s3);
		aList.add(s4);
		aList.add(s5);
		
		System.out.println("===========================");
		
		// 배열
		
		int [] arr = new int[] {1, 2, 1, 3, 3, 3, 4, 5 ,5};
		
		// 1. Method ( Method는 클래스 , 타입 ) -> 객체를 생생해야 클래스 사용가능
		
		Method m = new Method();
		
		m.arrayListOut(aList);    // -> arrayListOut 메소드 호출
		
		System.out.println("=========================");
		
		m.arrayOutput(arr, 5);      // 메소드 호출해서  인풋값 던져주고 
		
		
		System.out.println("=========================");
		
		m.nameAddr(aList);
		
		
		
	}

}
