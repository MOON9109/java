//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

class 숫자만추출 {

    public int solution(String s){
        String answer="";
        
        for(char x: s.toCharArray()){

            if(Character.isDigit(x)){ answer= answer+x ;

            }
        }

        return Integer.parseInt(answer);

    }


    public static void main(String[] args) {

        숫자만추출 T = new 숫자만추출();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));

    }
}