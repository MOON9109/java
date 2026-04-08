//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Scanner;

class 큰수출력하기 {

    public ArrayList<Integer> solution(int n, int [] arr){

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i =1; i<n ;i++){
            if (arr[i-1]<arr[i]) answer.add(arr[i]);

        }

        return answer;
    }


    public static void main(String[] args) {

        큰수출력하기 T = new 큰수출력하기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int [] arr = new int[n];

        for (int i=0 ; i<n ; i++){

            arr[i]= kb.nextInt();

        }

        for (int x : T.solution(n,arr)){

            System.out.printf(x+" ");
        }



//        String str = kb.next();
//
//
//        String result= T.solution(n, str);
//
//        System.out.println(result);
        //System.out.println(T.solution(str));

    }
}