package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GroupWordCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer=0;
        char prevLetter;
        String word;
        HashMap<Character,Boolean> map = new HashMap<>();
        for(int i =0 ; i<num; i++){
            answer++;
            map.clear();
            word = br.readLine();
            prevLetter=word.charAt(0);
            for(int j=0; j<word.length(); j++){
                if(map.containsKey(word.charAt(j))){
                    if(prevLetter!=word.charAt(j)) {
                        answer--;
                        break;
                    }
                }
                map.put(word.charAt(j),true);
                prevLetter=word.charAt(j);
            }
        }
        System.out.println(answer);
    }
}
