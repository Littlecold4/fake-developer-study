package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<String> words = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        int j;
        for(int i=0; i<num; i++) {
            String word = br.readLine();
            set.add(word);
        }
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String word= iter.next();
            for(j=0 ; j<words.size(); j++){
                if(word.length()<words.get(j).length()){
                    break;
                }else if(word.length()==words.get(j).length()){
                    if(word.compareTo(words.get(j))<0){
                        break;
                    }
                }
            }
            words.add(j,word);
        }
        for(int i=0; i<words.size();i++){
            sb.append(words.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
