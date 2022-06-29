package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class GroupWordCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer=0;
        char prevLetter;
        String word;
        HashSet<Character> set = new HashSet<>();
        for(int i =0 ; i<num; i++){
            answer++;
            set.clear();
            word = br.readLine();
            prevLetter=word.charAt(0);
            for(int j=0; j<word.length(); j++){
                if(set.contains(word.charAt(j))){
                    if(prevLetter!=word.charAt(j)) {
                        answer--;
                        break;
                    }
                }
                set.add(word.charAt(j));
                prevLetter=word.charAt(j);
            }
        }
        System.out.println(answer);
    }
}
