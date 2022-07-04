package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumberCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int cardNum = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        String[] cards =br.readLine().split(" ");
        for(int i=0; i<cardNum; i++){
            map.put(cards[i], map.getOrDefault(cards[i],0)+1);
        }
        List<String> cardsNumber = new ArrayList<>(map.keySet());
        Collections.sort(cardsNumber);
        int inputCardNum = Integer.parseInt(br.readLine());
        String[] inputCard = br.readLine().split(" ");
        StringBuffer sb =new StringBuffer();
        for(int i=0; i<inputCardNum; i++){
           if(binarySearch(cardsNumber,inputCard[i])) sb.append(map.get(inputCard[i])).append(" ");
           else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
    public static boolean binarySearch(List<String> cardsNumber, String inputNumber){
        int mid;
        int start = 0;
        int end = cardsNumber.size()-1;
        while (true) {
            mid = (start+end)/2;
            if(start>end){
                return false;
            }
            if (inputNumber .compareTo( cardsNumber.get(mid))>0) {
                start = mid+1;
            } else if (inputNumber.equals( cardsNumber.get(mid))) {
                return true;
            } else {
                end = mid-1;
            }
        }
    }
}
