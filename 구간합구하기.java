import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // main 메서드에서 IOException이 발생할 수 있기 때문에 throws로 예외를 던짐
    public static void main(String[] args) throws IOException {

        // 빠른 입력을 위한 BufferedReader 사용
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 입력: 수의 개수(suNo)와 질의 개수(quizNo) 입력
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());   // 숫자의 개수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의(구간 합)의 개수

        // 누적 합을 저장할 배열 선언 (0번째 인덱스는 0으로 초기화)
        long[] S = new long[suNo + 1]; // S[0] = 0, S[i] = 첫 번째 ~ i번째 수까지의 합

        // 두 번째 줄 입력: 실제 수열 데이터
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            // 누적 합 계산: S[i] = S[i-1] + 현재 값
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // quizNo만큼 질의를 입력받아 처리
        for (int q = 0; q < quizNo; q++) {
            // 질의는 두 정수 i, j로 이루어져 있고, i번째부터 j번째까지의 합을 구함
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            // 구간 합 출력: S[j] - S[i-1]
            System.out.println(S[j] - S[i - 1]);
        }
    }
}