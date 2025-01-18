package method;

public class MethodFirst {
    public static void main(String[] args) {
        int fisrtResult= add(5, 10);
        System.out.println("결과1 출력" +fisrtResult);

        int SecondResult= add(15,20);
        System.out.println("결과2 출력" +SecondResult);


    }
    // add method
    public static int add (int a, int b){
        System.out.println(a+"+"+b +" 연산 수행");


        int result = a+b;
        return  result;
    }
}
