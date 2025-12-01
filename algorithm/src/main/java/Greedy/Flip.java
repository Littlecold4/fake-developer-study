package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flip {
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] input1 = input.split("0");
        String[] input0 = input.split("1");
        int num1 = 0;
        for(int i=0; i<input1.length;i++){
            if(!input1[i].equals("") ) num1++;
        }

        int num2 = 0;
        for(int i=0; i<input0.length;i++){
            if(!input0[i].equals("")) num2++;
        }

        if(num1>num2) System.out.println(num2);
        else System.out.println(num1);
    }
}
