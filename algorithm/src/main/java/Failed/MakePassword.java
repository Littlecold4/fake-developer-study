package Failed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakePassword {
    static int L;
    static int C;
    static String[] letters;
    static String answer;
    static String[] letter1 ={"a","e","i","o","u"};
    static String[] letter2 ={"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
    public static void main(String[] args)throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        String[] LnCStr = br.readLine().split(" ");
        L = Integer.parseInt(LnCStr[0]);
        C = Integer.parseInt(LnCStr[1]);

        letters = br.readLine().split(" ");
        Arrays.sort(letters);

        for(int i=0; i<C; i++){
            func(0,"",i);
        }
        System.out.println(answer);
    }
    static void func(int depth,String password,int index){
        password+= letters[index];
        if(depth==3){
            if(containL1(password)&&containL2(password))
            answer += password+"\n";
            return;
        }
        depth++;
        for(int i=index; i<C-1; i++){
            func(depth,password,i+1);
        }
    }
    static boolean containL1(String password){
        for(int i=0; i<letter1.length; i++){
            if(password.contains(letter1[i])) return true;
        }
        return false;
    }
    static boolean containL2(String password){
        int answer=0;
        for(int i=0; i<letter2.length; i++){
            if(answer ==2) return true;
            if(password.contains(letter2[i])) answer++;
        }
        return false;
    }
}
