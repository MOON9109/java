import java.util.ArrayList;
import java.util.Scanner;

class 뒤집은소수 {

    public boolean checkPrime(int k){
        boolean check = true;

        if (k==1) check=false;

        for (int i = 2; i < k; i++) {
    

             if (k%i==0) check=false;

        }

        return check;

    }

    public ArrayList<Integer> solution(int n, int [] arr){
        ArrayList<Integer> answer = new ArrayList<>();


        for (int i = 0; i <n; i++) {
            int temp=arr[i];
            int num=0;
            while(temp>0){
                int t=temp%10;
                num=num*10+t;

                temp=temp/10;

            }

            if (checkPrime(num)==true) answer.add(num);

        }


        return answer;
    }

    public static void main(String[] args) {
        뒤집은소수 T = new 뒤집은소수();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= kb.nextInt();

        }





        for (int x : T.solution(n,arr)) {

            System.out.printf(x+" ");

        }

    }

}