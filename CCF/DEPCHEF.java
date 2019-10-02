/* package codechef; // don't place package name! */
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      TreeSet<Integer> treeset = new TreeSet();
      int n = sc.nextInt();
      int a[] = new int[n];
      int d[] = new int[n];
      for(int i=0;i<n;i++)
        a[i] = sc.nextInt();
      for(int i=0;i<n;i++)
        d[i] = sc.nextInt();
      int f = 0;
      if(d[0]>a[1]+a[n-1])
        f++;
      if(d[0]>a[n-1])
        f++;
      if(d[0]>a[1])
        f++;
      if(f==3)
        treeset.add(d[0]); 
      f= 0;
      if(d[n-1]>a[n-2]+a[0])
        f++;
      if(d[n-1]>a[n-2])
        f++;
      if(d[n-1]>a[0])
        f++;
      if(f==3)
        treeset.add(d[n-1]); 
      f= 0;
      for(int i=1;i<n-1;i++){
        if(d[i]>a[i-1]+a[i+1])
          f++;
        if(d[i]>a[i-1])
          f++;
        if(d[i]>a[i+1])
          f++;
        if(f==3)
          treeset.add(d[i]); 
        f=0;
      }
      if(treeset.size()==0)
        System.out.println(-1);
      else
        System.out.println(treeset.last());
    }
  }
}
