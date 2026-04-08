//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

class 문자열압축 {

    public String solution(String s){

        String answer="";

        s= s+" ";

        int count =1;

        for (int i=0; i<s.length()-1 ; i++){
            if (s.charAt(i)==s.charAt(i+1)) count++;
            else {
                answer= answer + s.charAt(i);

                if (count>1) answer=answer+String.valueOf(count);
                count=1;


            }




        }

        return answer;
    }


    public static void main(String[] args) {

        문자열압축 T = new 문자열압축();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();


        String result= T.solution(str);

        System.out.println(result);
        //System.out.println(T.solution(str));

    }
}