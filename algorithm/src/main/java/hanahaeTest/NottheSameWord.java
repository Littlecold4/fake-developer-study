package hanahaeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NottheSameWord {
    public String[] solution(String[] arr, int n) {
        List<String> words = new ArrayList<>();
        List<String> restWords = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]) if(!words.contains(arr[i])) words.add(arr[i]);
            }
        }
        for(int i=0; i< arr.length; i++){
            if(!words.contains(arr[i])){
                char letter = arr[i].charAt(n);
                String newWord = letter + arr[i].substring(0,n) + arr[i].substring(n+1);
                restWords.add(newWord);
            }
        }
        String[] answer = new String[restWords.size()];
        Collections.sort(restWords);
        for(int i=0; i< restWords.size(); i++){
            char letter = restWords.get(i).charAt(0);
            String newWord = restWords.get(i).substring(1,n+1)+letter + restWords.get(i).substring(n+1);
            answer[i] = newWord;
        }
        return answer;
    }

    public static void main(String[] args) {
        NottheSameWord method = new NottheSameWord();
        String[] arr = {"coke", "water", "glass", "dog", "dog", "yogurt", "vitamin"};
        int n = 2;
        System.out.println(Arrays.toString(method.solution(arr, n)));
    }
}
