import java.util.*;
import java.io.*;
public class Prob2{

    public static void algorithm(int n,String s){
        int countA =0;
        int countD = 0;

        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == 'A'){
                countA++;
            }
            else{
                countD++;
            }
        }
        if(countA>countD){
            System.out.println("Anton");
        }
        else if(countA<countD){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
    public static void main(String args[]){
        int n;
        String seq="";
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        seq = s.next();
        algorithm(n,seq);
    }
}