import java.util.Scanner;

class 임시반장정하기 {

    public int solution(int [][] array, int n){

        int max = Integer.MIN_VALUE;
        int answer=0;

        for (int i = 1; i <=n; i++) {
            int count=0;
            for (int j =1; j <= n; j++) {
                for (int k = 1; k <=5; k++) {

                    if (i!=j){
                        if (array[i][k]==array[j][k]){

                            count++;
                            break;
                        }


                    }


                }

            }

            if(count>max){
                answer=i;
                max=count;

            }

        }


        return answer ;
    }


    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);

        임시반장정하기 T = new 임시반장정하기();
        int n = kb.nextInt();

        int[][] array = new int[n + 1][6];


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=5; j++) {

                array[i][j]= kb.nextInt();

            }

        }

        System.out.println(T.solution(array,n));






    }

}