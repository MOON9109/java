// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
//
// 채점을 위해서는 class Main으로 지정해야함
class Main {

    public int solution (String str, char t) {
        int answer=0;

        str=str.toUpperCase();  // 대문자화

        t= Character.toUpperCase(t); // 대문자화

//        System.out.println(str+" "+t);
        // charAt 인덱스로 char 접근
        for(int i=0; i<str.length(); i++){

            if(str.charAt(i)==t) answer++;
        }



        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str =kb.next(); // 문자열 하나 받아옴
        char c = kb.next().charAt(0); // 문자열을 문자열로 접근

        System.out.print(T.solution(str,c));
    }

}
