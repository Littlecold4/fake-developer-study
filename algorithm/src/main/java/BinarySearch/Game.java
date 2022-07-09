package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long X = Long.parseLong(input[0]);
        long Y = Long.parseLong(input[1]);
        System.out.println(binarySearch(X,Y));
    }

    public static long binarySearch(long X,long Y){
        long mid=0;
        long nowZ= (long)Math.floor(100*Y/X);
        long start = 0;
        long end =2_000_000_000;
        if(nowZ>=99){
            return -1;
        }
        while (true) {
            mid = (start+end)/2;

            long afterZ= (long)Math.floor((Y+mid)*100/(X+mid));
            if(afterZ>=nowZ+1){
                end = mid-1;
            }else {
                start = mid+1;
            }
            if(end <=start) break;
        }
        return start;
    }
}
