package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MemoryKing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int test = 0; test < testNum; test++) {
            int note1 = Integer.parseInt(br.readLine());
            String[] note1NumStr = br.readLine().split(" ");
            int[] note1Num = new int[note1];
            for(int i=0; i<note1; i++){
                note1Num[i] = Integer.parseInt(note1NumStr[i]);
            }
            int note2 = Integer.parseInt(br.readLine());
            Arrays.sort(note1Num);
            String[] note2NumStr = br.readLine().split(" ");
            int[] note2Num = new int[note1];
            for(int i=0; i<note2; i++){
//                note2Num[i] = Integer.parseInt(note2NumStr[i]);
                sb.append(binarySearch(note1Num,Integer.parseInt(note2NumStr[i]))).append("\n");
            }
        }
        System.out.println(sb);
    }
        public static int binarySearch(int[] numIndex, int note2Num){
            int mid;
            int start = 0;
            int end = numIndex.length-1;
            while (true) {
                mid = (start+end)/2;
                if(start>end){
                    return 0;
                }
                if (note2Num > numIndex[mid]) {
                    start = mid+1;
                } else if (note2Num== numIndex[mid]) {
                    return 1;
                } else {
                    end = mid-1;
                }
            }
        }
    }
