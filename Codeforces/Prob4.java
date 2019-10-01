import java.io.*;
import java.util.*;
import java.util.Map.*;

public class Prob4{


    public static void main(String args[]){
        int s1,s2,s3,s4;
        Scanner s = new Scanner(System.in);
        Vector<Integer> v  = new Vector<Integer>();
        Map<Integer,Integer> hm =new HashMap<Integer,Integer>();

        for(int i =0;i<4;i++){
            int val = s.nextInt();
            v.add(val);
            
        }
        
        for(int j=0;j<v.size();j++){
            if(hm.containsKey((int)v.get(j))){
                hm.put((int)v.get(j),hm.get((int)v.get(j))+1);
            }
            else{
                hm.put((int)v.get(j),1);
            }
        }
        
        int count = 0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){

            if((int)entry.getValue()!=1){
                int value = (int)entry.getValue();
                count += (value -1);

            }
        }
        System.out.println(count);

       


        
        

    }
}