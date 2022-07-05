package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CutLan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int nowLines = Integer.parseInt(lines[0]);
        int neededLines = Integer.parseInt(lines[1]);
        long[] lineLengths = new long[nowLines];
        for(int i=0; i<nowLines; i++){
            lineLengths[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(lineLengths);
        System.out.println(binarySearch(lineLengths,neededLines));
    }

    public static long binarySearch(long[] lineLengths,int neededLines){
        long mid=0;
        long start =1;
        long end =lineLengths[lineLengths.length-1]+1;
        int howManyLines;
        while (true) {
            if(start>=end) break;;
            howManyLines=0;
            mid = (start + end)/2;
            for(int i=0; i<lineLengths.length; i++){
                howManyLines += lineLengths[i]/mid;
            }
           if(howManyLines<neededLines){
               end = mid;
           }else{
               start = mid+1;
           }
        }
        return start-1;
    }
}
