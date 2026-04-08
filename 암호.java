//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

class 암호 {

    public String solution(int n, String s){

        String answer="";

        for (int i=0 ; i<n; i++){
            String text= s.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(text,2);
            //System.out.println(text+" "+ num);

            answer=answer+ (char)num;

            s= s.substring(7);


        }



        return answer;
    }


    public static void main(String[] args) {

        암호 T = new 암호();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();


        String result= T.solution(n, str);

        System.out.println(result);
        //System.out.println(T.solution(str));

    }
}