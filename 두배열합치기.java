
import java.util.ArrayList;
import java.util.Scanner;

class 두배열합치기 {

    public ArrayList<Integer> solution(int n, int m, int [] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();

        int pt1=0;
        int pt2=0;


        while((pt1<n)&& (pt2<m)){

            if (a[pt1]>=b[pt2])   answer.add(b[pt2++]);
            else answer.add(a[pt1++]);
        }

        while(pt1<n) answer.add(a[pt1++]);

        while (pt2<m) answer.add(b[pt2++]);



        return answer;
    }


    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        두배열합치기 T = new 두배열합치기();

        int N = kb.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i]= kb.nextInt();

        }

        int M = kb.nextInt();
        int[] b = new int[M];

        for (int i = 0; i < M; i++) {
            b[i]= kb.nextInt();

        }

        for (int x : T.solution(N,M, a,b)) {

            System.out.printf(x+" ");
        }





    }

}