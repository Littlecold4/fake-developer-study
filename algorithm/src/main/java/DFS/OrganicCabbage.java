package DFS;

import java.io.*;
import java.util.*;

public class OrganicCabbage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testCase; t++) {
            String[] sizeStr = br.readLine().split(" ");
            Queue<int[]> queue = new LinkedList<>();
            int width = Integer.parseInt(sizeStr[0]);
            int height = Integer.parseInt(sizeStr[1]);
            int nums = Integer.parseInt(sizeStr[2]);
            int[][] cabbages = new int[height][width];
            int[][] positions = new int[nums][2];
            for (int i = 0; i < nums; i++) {
                String[] positionStr = br.readLine().split(" ");
                positions[i][0] = Integer.parseInt(positionStr[0]);
                positions[i][1] = Integer.parseInt(positionStr[1]);
                cabbages[positions[i][1]][positions[i][0]] = 1;
            }
            for(int x =0; x<width; x++){
//                System.out.println();
                for(int y=0; y<height; y++){
//                    System.out.print(cabbages[y][x]);
                }
            }
            int[][] around = {{0,-1},{-1,0},{0,1},{1,0}};

//            System.out.println();
//            System.out.println();
//            System.out.println();
//            System.out.println();
            int result =0;
            for(int x=0; x<width; x++){
//                System.out.println();
                for (int y=0; y<height; y++){
//                    System.out.print(cabbages[y][x]);

                    if(cabbages[y][x]==1){
                        result++;
                        int[] position = new int[2];
                        position[0] =y;
                        position[1] = x;
                        queue.add(position);
                        cabbages[y][x]=0;
                        while(queue.size()!=0){
                            int[] temp = queue.poll();
                            int positionX = temp[1];
                            int positionY = temp[0];
                            if(positionX==0&& positionY==0){
                                for(int i=0; i<around.length; i++){
                                    if(i==0||i==1) continue;
                                    isCheck(queue, cabbages, around, positionX, positionY, i);
                                }
                            }
                            else if(positionX==0 && positionY==height-1){
                                for(int i=0; i<around.length; i++){
                                    if(i==0||i==3) continue;
                                    isCheck(queue, cabbages, around, positionX, positionY, i);
                                }
                            }
                            else if(positionX==width-1 && positionY==0){
                                for(int i=0; i<around.length; i++){
                                    if(i==1||i==2) continue;
                                    isCheck(queue, cabbages, around, positionX, positionY, i);
                                }
                            }
                            else if(positionX ==0 && positionY>0 && positionY<height-1){
                                for(int i=0; i<around.length; i++){
                                    if(i==0) continue;
                                    isCheck(queue, cabbages, around, positionX, positionY, i);
                                }
                            }
                            else if(positionX>0 &&positionX<width-1&& positionY==0){
                                for(int i=0; i<around.length; i++){
                                    if(i==1) continue;
                                    isCheck(queue, cabbages, around, positionX, positionY, i);
                                }
                            }
                            else if(positionX>0&&positionX<width-1&&positionY<height-1&&positionY>0) {
                               for(int i=0; i<around.length; i++){
                                   isCheck(queue, cabbages, around, positionX, positionY, i);
                               }
                            }else if(positionX ==width-1&&positionY<height-1&&positionY>0){
                                for(int i=0; i<around.length; i++){
                                    if(i==2) continue;
                                    isCheck(queue, cabbages, around, positionX, positionY, i);
                                }
                            }else if(positionX>0 &&positionX <width-1&&positionY==height-1){
                                for(int i=0; i<around.length; i++){
                                    if(i==3) continue;
                                    isCheck(queue, cabbages, around, positionX, positionY, i);
                                }
                            }else if(positionX==width-1&&positionY==height-1){
                                for(int i=0; i<around.length; i++){
                                    if(i==2||i==3) continue;
                                    isCheck(queue, cabbages, around, positionX, positionY, i);
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }

    private static void isCheck(Queue<int[]> queue, int[][] cabbages, int[][] around, int positionX, int positionY, int i) {
        if(cabbages[positionY+around[i][0]][positionX+around[i][1]]==1){
            int[] position1 = new int[2];
            position1[0] = positionY+around[i][0];
            position1[1] = positionX+around[i][1];
            cabbages[position1[0]][position1[1]]=0;
            if(!queue.contains(position1)) queue.add(position1);
        }
    }
}
