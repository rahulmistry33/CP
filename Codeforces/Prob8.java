//http://codeforces.com/contest/263/problem/A   Beautiful Matrix
import java.util.*;
import java.io.*;

public class Prob8 {
    public static void main(String args[]){

        int arr[][] = new int[5][5];
        int row=0,col=0;
        int count = 0;
        Scanner s = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                int val = s.nextInt();
                if(val == 1){
                    row = i;
                    col = j;
                }
                arr[i][j] = val;

            }
        }
        if(row<2){
            count += (2-row);
        }
        else if(row>2){
            count += (row -2);
        }
        if(col<2){
            count += (2-col);
        }
        else if(col>2){
            count += (col -2);
        }

        System.out.println(count);


    }
}