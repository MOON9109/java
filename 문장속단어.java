// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
//
// 채점을 위해서는 class Main으로 지정해야함
class Main {

    public String solution (String str) {
        String answer="";
        int m =Integer.MIN_VALUE; // 가장 작은 값으로 초기화
        String[] s=str.split(" "); // 띄어쓰기로 구분
        for (String x : s) {
//
//            System.out.println(x);
            int len=x.length();
            if (len>m){
                m=len;
                answer=x;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str =kb.nextLine() ; // 한줄을 입력 받아야되서 nextline 사용



//
        String result=T.solution(str);
        System.out.println(result);

    }

}
