
import java.util.Scanner;

class 멘토링 {

    public int solution(int [][]array, int N, int M){

        int answer =0;

        for (int i = 1; i <= N; i++) {


            for (int j = 1; j <= N; j++) {

                int cnt=0;
                for (int k = 0; k < M; k++) {

                    int p1=0;
                    int p2=0;

                    for (int l = 0; l <N; l++) {

                        if (array[l][k]==i) p1=l;
                        if (array[l][k]==j) p2=l;

                    }

                    if (p1<p2) cnt++;




                }

                if (cnt==M) answer++;

            }



        }





        return answer;
    }


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        멘토링 T = new 멘토링();

        int N= kb.nextInt();
        int M=kb.nextInt();
        int[][] array = new int[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j <N; j++) {
                array[j][i]= kb.nextInt();

            }

        }





        System.out.println(T.solution(array,N,M));


    }

}