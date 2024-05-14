import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RGBDistance {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] cost = new int[num][3];
        String[] costStr = new String[3];
        for(int i=0; i<num; i++){
            costStr = br.readLine().split(" ");
            cost[i][0] = Integer.parseInt(costStr[0]);
            cost[i][1] = Integer.parseInt(costStr[1]);
            cost[i][2] = Integer.parseInt(costStr[2]);
        }
        for(int i=0; i<num-1; i++){
            cost[i+1][0] = Math.min(cost[i][1],cost[i][2])+cost[i+1][0];
            cost[i+1][1] = Math.min(cost[i][0],cost[i][2])+cost[i+1][1];
            cost[i+1][2] = Math.min(cost[i][0],cost[i][1])+cost[i+1][2];
        }
        int answer = Arrays.stream(cost[num-1]).min().getAsInt();
        System.out.println(answer);
    }
}