package ch05reference;

public class C09method {
	public static void main(String[] args) {
		int a = 5;
		
		method(a); // 메소드 실행시 a 값을 넘김
		
		int b=50;
		method(b);//메소드를 b 값을 넘김
	}
	
	public static void method(int p) {
		System.out.println(p);	// main 메소드 안의 a나b 를 받아와 넣는다
		
	}
}
