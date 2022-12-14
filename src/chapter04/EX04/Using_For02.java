package chapter04.EX04;

import java.util.Scanner;

public class Using_For02 {

	public static void main(String[] args) {
		// for 문을 사용해서 스캐너로 5개의 값을 인풋 받아 출력
		Scanner sc = new Scanner(System.in);
		
		String s;
		for(int i = 0 ; i<5 ; i++) {			//0,1,2,3,4
			s= sc.next();
			System.out.println(s);
		}
	
		// for 문 내에서 변수 선언시 for 문 내에서만 사용
		// 	- 클래스에서 재사용이 가능, ex) int a를 for 문내에서 사용하면 해당 문이 끝나면 재사용 가능
		int a ;		//전역변수 : for 밖, 안 ← 모두 사용	
		a = 0;
		for (int i =0 ; i<3 ; i++) {		//0, 1, 2
				//i : 지역 변수, for 문 내에서만 사용
			System.out.println(i);
			System.out.println(a);
		}
		System.out.println(a);		//밖에서 변수 선언했기 때문에 for문 내 뿐만아니라 밖에서도 사용가능
		sc.close();
		
	}
	
}