import java.util.Scanner;

class 에라토스테네스체 {

    public int solution (int n){
        int answer=0;
        int [] temp = new int[n+1];

        for (int i=2; i<=n; i++){
            if (temp[i]==0) answer=answer+1;

            for (int j=i; j<=n; j=j+i){
                temp[j]=1;
            }
        }

    return answer;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        에라토스테네스체 T= new 에라토스테네스체();

        System.out.println(T.solution(n));





    }

}