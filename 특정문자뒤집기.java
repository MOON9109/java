
import java.util.*;
class Main {
    public String solution(String str){

        String answer;
        char[] s=str.toCharArray();
        int pt1=0, pt2=str.length()-1;

        while(pt1<pt2){
            if (! Character.isAlphabetic(s[pt1])) pt1++;
            else if (!Character.isAlphabetic(s[pt2])) pt2--;
            else{
                char tmp=s[pt1];

                s[pt1]=s[pt2];
                s[pt2]=tmp;

                pt1++;
                pt2--;


            }


        }
        answer=String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb =new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str));
    }

}
