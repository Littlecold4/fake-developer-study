import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class PressCoordinate {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int count =0;
        String[] numStr = br.readLine().split(" ");
        HashMap<Integer,Integer> index =new HashMap<Integer, Integer>();
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(numStr[i]);
        }
        int[] origin =num.clone();
        Arrays.sort(num);

        StringBuilder sb =new StringBuilder();
        for(int i=0; i<N; i++){
            if(!index.containsKey(num[i])){
                index.put(num[i], count++);
            }
        }
        for(int i=0; i<N; i++) sb.append(index.get(origin[i])+" ");
        System.out.println(sb);
    }
}
