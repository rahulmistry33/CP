import java.util.*;
import java.io.*;

public class Prob1{
    int n,h;
    Scanner s = new Scanner(System.in);
    Vector<Integer> v = new Vector<Integer>();
    int count = 0;

    public void algorithm(){
        for(int i =0;i<v.size();i++){
            if((int)v.get(i)>h){
                count +=2;
            }
            else{
                count+=1;
            }
            
            
        }
        System.out.println(count);
    }
    public void inputs(){
        n = s.nextInt();
        h = s.nextInt();
        for(int i =0;i<n;i++){
            int val = s.nextInt();
            v.add(val);
        }
        algorithm();

    }
    public static void main(String args[]){
        Prob1 p = new Prob1();
        p.inputs();
    }
}