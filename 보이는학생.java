//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

class 보이는학생 {

    public int solution (int n, int [] arr){
        int answer =0;

        int temp=0;

        if (n>=1) {

            answer=1;
            temp=arr[0];
        }
        for (int i=1; i<n; i++){

            if (temp<arr[i]){

                answer= answer+1;

                temp=arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

       보이는학생 T =  new 보이는학생();
       Scanner kb =  new Scanner(System.in);

       int n =kb.nextInt();

       int [] arr = new int[n];

       for (int i=0 ; i<n ; i++){

           arr[i]=kb.nextInt();
       }

        System.out.println(T.solution(n,arr));

    }
}