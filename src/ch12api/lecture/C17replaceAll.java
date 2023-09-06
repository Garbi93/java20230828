package ch12api.lecture;

public class C17replaceAll {
    public static void main(String[] args) {
        // replaceAll : 특정 패턴 -> 다른 문자열로 변경
        String a = "JAVA is java";
        String r = a.replace("java", "python");
        System.out.println(r);
        // 기존 리플레이스는 소문자만 변경

        String r2 = a.replaceAll("(java|JAVA)", "python");
        System.out.println(r2);
        // 두 값을 한번에 패턴화 시켜서 변경

        String str = "zipXzap";
        String pattern = "z.p";
        System.out.println(str.replaceAll(pattern,"zp"));

    }
}
