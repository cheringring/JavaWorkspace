package chap_02;

public class _01_Operator {
    public static void main(String[] args)
    {
        System.out.println(5-4);
        //자바는 지가 알아서 계산해줌.
        // 여기서 계산 되면 소숫점은 표시 되지 않는다.


        // 선위,후위
        System.out.println("후위");
        // 후위
        int waiting = 0;
        System.out.println("대기 인원"+waiting++); // 후위이기때문에 여기선 0
        System.out.println("대기 인원"+waiting++); // 여기선 1
        System.out.println("대기 인원"+waiting++); // 여기선 2

        System.out.println("선위");
        //선위
        int waiting1 = 0;
        System.out.println("대기 인원"+ ++waiting1); // 선위: 1
        System.out.println("대기 인원"+ ++waiting1); // 2
        System.out.println("대기 인원"+ ++waiting1); // 3


    }
}
