package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BestSeller {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<num; i++){
            String book = br.readLine();
            map.put(book,map.getOrDefault(book,0)+1);
        }
        List<String> books = new ArrayList<>(map.keySet());
        Collections.sort(books, (v1,v2) -> map.get(v2) - map.get(v1));
        List<String> bestSellers = new ArrayList<>();
        bestSellers.add(books.get(0));
        for(int i=0; i<books.size()-1; i++){
            if(map.get(books.get(i))==map.get(books.get(i+1))){
                bestSellers.add(books.get(i+1));
            }else break;
        }
        Collections.sort(bestSellers);
        System.out.println(bestSellers.get(0));
    }
}
