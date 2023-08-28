package ch05reference;

public class C08array {
	public static void main(String[] args) {
		int[] a = {3,4,5};
		int[] b = {3,4,5};
		int[] c = a;
		
		int code1 = System.identityHashCode(a);
		int code2 = System.identityHashCode(b);
		int code3 = System.identityHashCode(c);
		
		System.out.println(code1);
		System.out.println(code2);
		System.out.println(code3);
		// a의 참조값과 c 의 참조값이 같게 나온다. 같은 값을 넣은 b는 주소 값이 다르다.
		
		System.out.println(a[0]); 	// 3
		a[0] = 33;
		System.out.println(a[0]);	//33
		System.out.println(c[0]);	//33
		System.out.println(b[0]);	//3
	}
}
