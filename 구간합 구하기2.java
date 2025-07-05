// 표준 입력을 효율적으로 읽기 위한 BufferedReader와 InputStreamReader import
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 공백 기준으로 문자열을 나누기 위한 StringTokenizer import
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        // 입력을 받기 위한 BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄 입력 받아 공백으로 분리 (예: "4 3"이면 N=4, M=3)
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 배열의 크기 N
        int M = Integer.parseInt(st.nextToken()); // 질의 개수 M

        // 실제 배열 A 선언 (1-based index 사용을 위해 크기를 N+1로 설정)
        int A[][] = new int[N + 1][N + 1];

        // A 배열 입력 받기
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine()); // 각 행 입력 받음

            for (int j = 1; j <= N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken()); // 공백 기준으로 숫자 입력
            }
        }

        // 누적 합 배열 D 선언 (1-based index)
        int D[][] = new int[N + 1][N + 1];

        // D 배열 계산 (2차원 누적 합 공식 사용)
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // (i,j)까지의 누적합: 왼쪽, 위쪽, 왼쪽 위 대각선 누적합을 이용
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }

        // M개의 질의에 대해 결과 계산
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()); // 질의 좌표 입력

            int x1 = Integer.parseInt(st.nextToken()); // 왼쪽 위 x좌표
            int y1 = Integer.parseInt(st.nextToken()); // 왼쪽 위 y좌표
            int x2 = Integer.parseInt(st.nextToken()); // 오른쪽 아래 x좌표
            int y2 = Integer.parseInt(st.nextToken()); // 오른쪽 아래 y좌표

            // (x1,y1)부터 (x2,y2)까지의 합을 2차원 누적합 배열 D를 이용해 계산
            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];

            // 결과 출력
            System.out.println(result);
        }
    }
}