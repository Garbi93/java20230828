package ch05reference;

public class C10method {
	public static void main(String[] args) {
		int[] a= {3,4,5}; 		// 3,4,5 의 주소값을 갖고있다.
		
		System.out.println("main 메소드");
		System.out.println(System.identityHashCode(a));
		
		System.out.println(a[0]);
		method1(a);
		
		System.out.println("메소드 호출 후");
		System.out.println(a[0]); 	//참조값을 변경했으므로 a의 3이 아닌 p의33이 출력됨
	}
	
	
	public static void method1(int[] p) {
		System.out.println("메소드1 메소드");
		System.out.println(System.identityHashCode(p));
		System.out.println(p[0]);
		
		p[0]=33;	//참조 값을 변경하여 메소드 전달
	}
}
