package ch05reference;

public class C06matrix {
//이차원 배열 
	public static void main(String[] args) {
		int[][] a = { {1,2,3},{10,20,30},{100,200,300} };
		int[][] b = a;
		
		System.out.println(a[0][2]); 	// 3
		System.out.println(b[0][2]); 	// 3
		
		a[1][1] = 2000;
		System.out.println(a[1][1]);	// 2000
		System.out.println(b[1][1]);	// 2000
		
		b[2][2] = 9999;
		System.out.println(a[2][2]); 	// 9999
		
		b[2] = new int[] {111,222,333};
		System.out.println(a[2][2]);	// 333
		System.out.println(b[2][2]);	// 333
		
		b = new int[][] {{33, 44}, {22, 11}};	// 이렇게 b 에 값을 만들어 준순간 a와 b의 주소 저장 값은 달라진다.
		System.out.println(b[0][0]);	// 33
		System.out.println(a[0][0]);	// 1
		
	}
}
