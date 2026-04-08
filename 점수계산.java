import java.util.Scanner;

class 점수계산 {
    public int solution (int n, int[] array){

        int answer=0;

        int count=0;
        for (int x : array) {

            if (x==1) {
                //System.out.println(x);
                answer=answer+1+count;

                count=count+1;
            } else if (x==0) {

                count=0;

            }

        }

        return answer;
    }

    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);

        점수계산 T = new 점수계산();

        int n= kb.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i]=kb.nextInt();

        }

        System.out.println(T.solution(n,array));

    }

}