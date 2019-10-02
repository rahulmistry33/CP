import java.util.*;
class Main {
  static int x[] , y[] , i = 0;
  public static void main(String[] args) {
    int t , m , N ;
    Scanner sc = new Scanner(System.in);
    t = sc.nextInt();
    m = t;
    x = new int[t];
    y = new int[t];
    while(m-->0){
      N = sc.nextInt();
      check(N);
    }
    for(int j=0;j<t;j++)
      System.out.printf(""+x[j]+" "+y[j]+" ");
  }
  public static void check(int N){
    x[i] = (int)((int)Math.pow(2,N) - (int)Math.pow(-1,N))/3;
    y[i] = (int) Math.pow(2,N);
    i++;
  }
}