package ch05reference;

public class C05reference {
	public static void main(String[] args) {
		int[] a = {3,4,5};
		int[] b = a;
		
		System.out.println(b[2]); 	// 5

		a[2] = 7;
		System.out.println(b[2]); 	// 7
		
		int[] c = {10,20,30};
		int[] d = {10,20,30};	// c 와 d 의 주소는 다르지만 주소에 저장되어 있는 값은 같다 값을 비교하면 같다고 나오겠지만 c와 d 를 비교하면 다르다고 나올 것이다.
		
		System.out.println(d[2]); 	// 30
		System.out.println(d[2] == c[2]);	//true
		
		c[2] = 90;
		System.out.println(c[2]);	// 90
		System.out.println(d[2]);	// 30
		System.out.println(d[2] == c[2]);	//false
		
	}
}
