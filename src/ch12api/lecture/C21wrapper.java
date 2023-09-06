package ch12api.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i = 3;
        Integer j = Integer.valueOf(i);
        Object k = j;

        int l = 5;
        Integer m = l;
        Object n = m;

        Object o = 7;   // autoboxing 이 되기 때문에 Object 에 int 타입이 들어가는게 가능하다.

        //int p = o; //이건 불가능 하다
        Integer q = (Integer) o;    // 위험한 코드
        int r = q;
    }
}
