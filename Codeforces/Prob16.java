//https://codeforces.com/contest/268/problem/A Games
import java.util.*;
import java.io.*;



public class Prob16{

    static class Pair{
        int h,r;
        Pair(int  h,int r){
            this.h = h;
            this.r = r;
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Pair arr[];
        int n = s.nextInt();
        arr = new Pair[n];
        for(int i=0;i<n;i++){
            int h = s.nextInt();
            int r = s.nextInt();
            arr[i] = new Pair(h,r);
        }
        int count = 0;
        for(int j=0;j<arr.length;j++){
            for(int k=0;k<arr.length;k++){
                if(j==k){
                    continue;
                }
                else if(arr[j].h == arr[k].r){
                    count ++;
                }

            }
        }
        System.out.println(count);

    }
}