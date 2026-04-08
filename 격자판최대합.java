import java.util.Scanner;

class 격자판최대합 {
    public int solution (int n, int arr [][])
    {
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int sum1=0;
            int sum2=0;

            for (int j = 0; j < n; j++) {
                sum1= sum1+ arr[i][j];
                sum2= sum2+ arr[j][i];

            }
            answer= Math.max(answer,sum1);
            answer= Math.max(answer,sum2);
        }

        int sum3=0;
        int sum4=0;

        for (int i = 0; i < n; i++) {


                sum3= sum3+ arr[i][i];
                sum4=sum4+arr[i][n-1-i];

            }

        answer= Math.max(answer,sum3);
        answer= Math.max(answer,sum4);


        return answer;

    }


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        격자판최대합 T = new 격자판최대합();

        int n = kb.nextInt();

        int[][] Array = new int[n][n];



        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                Array[i][j]= kb.nextInt();

            }


        }

        System.out.println(T.solution(n,Array));


    }

}