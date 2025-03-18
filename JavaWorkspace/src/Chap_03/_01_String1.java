package Chap_03;

public class _01_String1 {
    public static void main(String[] args)
    {
        String s = "I like Java and Python and C and.";
        System.out.println(s);
        //문자열길이
        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.contains("Java")); // 포함된다면 true

        System.out.println(s.indexOf("Java")); // 이 단어가 시작된 위치(인덱스)
        System.out.println(s.indexOf("C#")); // 없으면 -1 반환

        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치

        System.out.println(s.startsWith("I")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 false
    }
}
