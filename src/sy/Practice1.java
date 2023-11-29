package sy;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {

		/*
	 	// 1. 선언

	 	arr[3][10] : 행의 방번호 ( 0 ~ 2 ), 방의 갯수 : 3 , arr.lenth
	 				 열의 방번호 ( 0 ~ 9 ), 열의 개수 : 10, arr[0].length
	 		
	 	// 2. 배열 방에 값을 저장

	 			[2중 for문을 사용해서 값을 저장]
	 	
	 				 0행에는 1부터 시작해서 1씩 증가
	 				 1행에는 짝수만 저장, 3의 배수는 빼고 저장
	 				 2행에는 7의 배수 , 8의 배수 저장
	 	// 3. 출력			 
	 			
	 			2중 for문을 사용해서 출력
	 			enhanced for문을 사용해서 출력
	 			arrays.toString () 으로 출력 , -> 1차원 배열을 출력
	 			
			*/
	
		int arr[][] = new int [3][10];
		
		for (int i = 0 ;  i < arr.length ; i++) 
		{
			if ( i == 0) 
			{
			int a = 1 ;
			for ( int j = 0 ; j < arr[i].length ; j++) 
			{
			arr[i][j] = a ;
			a++;
			System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		} 
			else if (i == 1 )
			{
			int a = 1 ;
			for ( int j = 0 ; j < arr[i].length ; a++ ) 
			{
				if( a % 2 == 0) 
				{
					if (a % 3 != 0) 
					{
					arr[i][j] = a;
					
					System.out.print(arr[i][j]+ "\t");
					
					j++;
				
					}
					
				}
				
			}
			System.out.println();	
			
		} else if (i == 2 ){
			int a = 1;
			for ( int j = 0 ; j < arr[i].length ; a++) {
			 if ( a % 7 == 0 ||  a % 8 == 0)	{
				arr[i][j] = a;
				
				System.out.print(arr[i][j]+ "\t");
				
				j++;
				
			 }
			}
			
		}	
		
		}
		
		
		
	/*
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		*/
		
		
		
	}

}
