package implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        if(sentence.replace(" ","").equals("")){
            System.out.println(0);
        }
        System.out.println(sentence.trim().split(" ").length);
    }
}
