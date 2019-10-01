//https://codeforces.com/contest/266/problem/A  Stones on the table

import java.io.*;
import java.util.*;
public class Prob15 {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String seq = s.next();
        int count = 0;
        for(int i=1;i<seq.length();i++){
            if(seq.charAt(i-1) == seq.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}