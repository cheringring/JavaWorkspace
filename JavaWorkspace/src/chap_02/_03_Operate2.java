package chap_02;

public class _03_Operate2 {
    public static void main(String[] args)
    {
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = false;
        System.out.println(김치찌개 || 계란말이 || 제육볶음);
        // 하나라도 true면 true or조건
        System.out.println(김치찌개 && 계란말이 && 제육볶음);
        // 다 true여야 true and조건

        // 불가능한 코드
        // System.out.println(5<3<3);
    }
}
