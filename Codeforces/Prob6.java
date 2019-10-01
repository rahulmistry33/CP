import java.util.*;
import java.io.*;
import java.util.Map.*;

public class Prob6{


    public static void main(String args[]){


        Scanner s = new Scanner(System.in);
        String seq = s.next();
        Map<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<seq.length();i++){

            if(hm.containsKey(seq.charAt(i))){
                hm.put(seq.charAt(i),hm.get(seq.charAt(i))+1);

            }
            else{
                hm.put(seq.charAt(i),1);
            }
            


        }
        //System.out.println(hm);
        if(hm.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");

        }
    }
}