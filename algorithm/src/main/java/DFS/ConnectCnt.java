package DFS;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectCnt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NMStr = br.readLine().split(" ");
        int dotCnt = Integer.parseInt(NMStr[0]);
        int lineCnt = Integer.parseInt(NMStr[1]);
        int[][] dots = new int[lineCnt][2];
        for(int i=0; i<lineCnt; i++){
            String[] connected = br.readLine().split(" ");
            dots[i][0] = Integer.parseInt(connected[0]);
            dots[i][1] = Integer.parseInt(connected[1]);
        }
        HashSet<Integer> set = new HashSet<>();


        while(true){
            Queue<Integer> queue = new LinkedList<>();
            for(int i=0; i<lineCnt; i++){
//                if(dots[i][0] == )
            }
        }
    }
}
