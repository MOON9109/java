// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
//
// 채점을 위해서는 class Main으로 지정해야함
class Main {

    public String solution (String str) {
        String answer="";


        for (char x : str.toCharArray()) {

            if(Character.isLowerCase(x))answer = answer + Character.toUpperCase(x); //대문자화
            else answer=answer + Character.toLowerCase(x); // 소문자화
            }
//        }



        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str =kb.next(); // 문자열 하나 받아옴


//
        String result=T.solution(str);
        System.out.println(result);

    }

}
