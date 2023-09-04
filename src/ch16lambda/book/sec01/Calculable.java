package ch16lambda.book.sec01;

// 추상메소드가 하나인 인터페이스
// : Functional Interface
@FunctionalInterface    // 이 인터페이스가 추상메소드가 1개 인지 컴파일러를 통해 검증 시키는것
public interface Calculable {
    void caclulate(int x, int y);
}
