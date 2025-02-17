import java.util.Scanner;

class Main {


    public String solution(String str){

        String answer="YES";
        str=str.toUpperCase();
        for (int i=0; i<str.length()/2; i++){
//            System.out.println(str.charAt(i)+" "+str.charAt(str.length()-1-i));
            if(str.charAt(i)!=str.charAt(str.length()-1-i)) return "NO";

        }


        return answer;
    }

    public static void main(String[] args) {

        Main T= new Main();

        Scanner kb =new Scanner(System.in);
        String str = kb.next();
//        System.out.println('test');

        System.out.println(T.solution(str));

    }
}