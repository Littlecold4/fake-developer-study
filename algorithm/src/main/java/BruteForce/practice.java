package BruteForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class practice {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N= Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);
        String[][] people = new String[N][2];
        for(int i=0; i<N; i++){
            String[] inputPerson = br.readLine().split(" ");
            if(i==0){
                people[0][0] = inputPerson[0];
                people[0][1] = inputPerson[1];
            }else{
                for(int j=0; j<i; j++){
                    if(inputPerson[0].compareTo( people[j][0])>0){
                        people[j+1] =people[j];
                        people[j] = inputPerson;
                        break;
                    }else if(inputPerson[0].compareTo(people[j][0])==0){

                    }
                }
            }
        }

    }

}