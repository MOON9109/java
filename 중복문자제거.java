import java.util.*;

class Main {
    public String solution (String str){

        String answer="";

        for(int i=0 ;i<str.length(); i++){

//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            //indexOf는 해당 문자의 첫번째 인덱스를 가져다준다
            if(i==str.indexOf(str.charAt(i))) answer= answer+str.charAt(i);
        }

        return answer;
    }



    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));


    }

}