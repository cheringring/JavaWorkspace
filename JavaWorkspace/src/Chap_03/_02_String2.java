package Chap_03;

public class _02_String2 {
    public static void main(String[] args)
    {
        System.out.println("---------------- 문자 치환 ---------------------");
        String s = " I like Java and Python and C.";

        System.out.println(s.replace(" and",","));
        // sout 치면나옴

        System.out.println("--------- 인덱스 찾아서 뽑아내기------------");

        System.out.println(s.substring(7)); // 인덱스 7기준 부터 시작

        System.out.println(s.substring(s.indexOf("Java"))); // Java인덱스찾아서 거기서부터 시작
        System.out.println(s.substring(s.indexOf("Java") , s.indexOf(" Python")));
        // Java가 시작하는 위치부터 "." 이 시작하는 위치 바로 앞까지.



        System.out.println("------------ 공백제거 --------------");
        String a = "          I love Java.      ";
        System.out.println(a.trim()); // 앞 뒤 공백제거

        System.out.println("---------------문자열 합치기 --------------");

        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1+s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(","));
        System.out.println(s1.concat(",").concat(s2));

        System.out.println("--------------------------");


    }
}
