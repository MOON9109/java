//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Scanner;

class 가위바위보 {

    public ArrayList<Character> solution(int n, int [] arrA, int[] arrB){

        ArrayList<Character> answer = new ArrayList<>();

        //1 가위 2 바위 3 보

        //A 13  21 32
        //B 31  12 23
        for (int i =0 ; i<n; i++){



            if(arrA[i]==arrB[i]) answer.add('D');

            else if ((arrA[i] == 1 && arrB[i] == 3) ||
                    (arrA[i] == 2 && arrB[i] == 1) ||
                    (arrA[i] == 3 && arrB[i] == 2)) {
                answer.add('A');
            }
            else {
                answer.add('B');
            }


        }

        return answer;
    }


    public static void main(String[] args) {


      Scanner kb =  new Scanner(System.in);

      가위바위보 T =  new 가위바위보();

      int n = kb.nextInt();

      int[] A = new int[n];
      int[] B = new int[n];


      for (int i =0; i<n; i++){

          A[i]= kb.nextInt();
      }

      for (int i =0; i<n; i++){

        B[i]= kb.nextInt();
      }

        for (char x : T.solution(n,A,B)){

            System.out.println(x);
        }
    }



}