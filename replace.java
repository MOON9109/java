import java.util.*;

class Main {

    public String Solution(String str){

        String answer="NO";
        String s=str.toUpperCase().replaceAll("[^A-Z]",""); //알파벳 아닌것 제거
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }


    public static void main(String[] args) {

        Main T=new Main();
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.Solution(str));



    }




}