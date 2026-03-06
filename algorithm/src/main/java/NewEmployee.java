import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewEmployee {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0 ; t<T ; t++){
            int N = Integer.parseInt(br.readLine());
            int[] grades = new int[N];
            for(int i=0; i<N;i++){
                String[] input = br.readLine().split(" ");
                grades[Integer.parseInt(input[0])-1] = Integer.parseInt(input[1]);
            }

            int answer = 1;
            int minInterviewRank = grades[0];
            for(int i=1; i<N; i++){
                if(grades[i] <minInterviewRank){
                    answer++;
                    minInterviewRank=grades[i];
                }
            }
            System.out.println(answer);
        }
    }

}
