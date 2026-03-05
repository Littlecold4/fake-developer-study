import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class littlePrince {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for(int t =0 ; t<T; t++){
            st= new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int answer = 0;

            int n =Integer.parseInt(br.readLine());
            for(int i=0; i<n;i++){
                st= new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                if(insideCircle(x1,y1,cx,cy,r)&&insideCircle(x2,y2,cx,cy,r)) {
                }
                else if(insideCircle(x1,y1,cx,cy,r)||insideCircle(x2,y2,cx,cy,r))
                    answer++;
            }

            System.out.println(answer);
        }
    }
    static boolean insideCircle(int x1 , int y1, int x2,int y2,int r2){
        if(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)>r2*r2) return false;
        return true;
    }
}
