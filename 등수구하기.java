import java.util.ArrayList;
import java.util.Scanner;

class 등수구하기 {

    public ArrayList<Integer> solution(int n, int [] array){


        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int count=1;


            for (int j = 0; j < n; j++) {

                if (array[i]<array[j]) {
                    count = count + 1;

                }

            }
            answer.add(count);

        }


        return answer;
    }

    public static void main(String[] args) {


        Scanner kb = new Scanner(System.in);
        등수구하기 T = new 등수구하기();

        int n = kb.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i]=kb.nextInt();

        }

        for (int x : T.solution(n,array)) {
            System.out.printf(x+" ");

        }



    }


}