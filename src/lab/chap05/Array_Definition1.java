package lab.chap05;

public class Array_Definition1 {

	public static void main(String[] args) {

		// 배열 변수 명 : arr
			// 배열 방의 갯수는 : 1000개 생성 , 0 ~ 999 , arr.length : 1000
			// 배열의 각 방에 3의 배수를 저장함 (for문 사용)
			// 배열의 각 방의 내용을 출력 (for문 사용)
		
		// 1. 배열 변수를 선언 
		
		int [] arr = new int [1000];
		
		String[] arr1 = new String [10];//arr1의 각 방에 문자열을 저장
		arr1[0] = "자바";
		arr1[1] = "HTNL";
		
		System.out.println(arr.length);		//배열 방의 갯수를 출력 : 0 ~ 999
		System.out.println(arr1.length);	// 10개의 방
		
		// 2. 1000개의 방에 3의 배수를 저장
		
		for ( int i = 0 , j =3 ; i < arr.length ; i++) {		// i : 방번호를 알려주는 변수 ( 0 ~ 999) , 1씩 증가하면서
			
			arr[i] = j;
			j+=3;					// j = j + 3
			
			System.out.println(arr[i]);
		}
	
		// 3. 1000개의  각 방에 있는 값을 출력
		
		for ( int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
}
}