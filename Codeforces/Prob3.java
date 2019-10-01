import java.util.*;
import java.io.*;

public class Prob3{

    public static void algorithm(String a,String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
       
        int val = a.compareTo(b);
        if(val<0){
         System.out.println(-1);
        }
        else if(val>0){
            System.out.println(1);
           }
        else if(val==0){
            System.out.println(0);
           }

    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        algorithm(a,b);
    }
}