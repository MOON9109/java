import java.util.Scanner;

class 피보나치 {

    public int[] solution(int n){

        int [] answer =new int [n];

        for (int i =0; i< answer.length; i++){

            if (i==0||i==1) answer[i]=1;
            else { answer[i]=answer[i-1]+answer[i-2];

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();


        피보나치 T= new 피보나치();

        for (int x : T.solution(n) ) {
            System.out.printf(x+" ");
        }




    }

}