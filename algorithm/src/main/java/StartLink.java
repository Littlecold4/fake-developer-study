import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartLink {
    static int[][] team;
    static int N;
    static int[] visit,notVisit;

    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        team = new int[N][N];
        visit = new int[N/2];
        notVisit = new int[N/2];

        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            team[i][0] = Integer.parseInt(input[0]);
            team[i][1] = Integer.parseInt(input[1]);
        }

    }

    private static int diffOfSum(){
        int sum1=0,sum2=0;
        for(int i=0; i<N/2 - 1; i++){
            for(int j=i+1; j<N/2; j++){
                sum1 += team[visit[i]][visit[j]]+team[visit[j]][visit[i]];
            }
        }
        for(int i=0; i<N/2 - 1; i++){
            for(int j=i+1; j<N/2; j++){
                sum2 += team[notVisit[i]][notVisit[j]]+team[notVisit[j]][notVisit[i]];
            }
        }
        return Math.abs(sum1 - sum2);
    }
//    private static void rest(){
//        for(int i=0; i<N;i++){
//            if(!contains(i)) no
//        }
//    }

    private static boolean contains(int value) {
        for (int i = 0; i < visit.length; i++) {
            if (visit[i] == value) {
                return true; // 찾았으면 바로 true를 반환하고 끝!
            }
        }
        return false; // 배열 전체를 다 돌았는데 못 찾았으면 false 반환
    }
}
