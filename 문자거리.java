//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Arrays;
import java.util.Scanner;

class 문자거리 {

    public int [] solution(String s, char t){
        int[] answer = new int[s.length()];

        Arrays.fill(answer, s.length()*2);

        for (int i=0; i< s.length(); i++){

            if (s.charAt(i)==t){

                answer[i]=0;

            } else if (i>0) {

                answer[i]= answer[i-1]+1;

            }
        }

        for (int i=s.length()-1; i>=0; i--){

            if (s.charAt(i)==t){

                answer[i]=0;

            } else if (i<s.length()-1) {

                answer[i] = Math.min(answer[i], answer[i+1] + 1);

            }
        }


        return answer;
    }


    public static void main(String[] args) {

        문자거리 T = new 문자거리();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
//        System.out.println("str = " + str);
//        System.out.println("c = " + c);

        int[] result= T.solution(str,c);

        for (int num : result){
            System.out.print(num+" ");
        }
        //System.out.println(T.solution(str));

    }
}