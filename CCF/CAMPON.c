#include <stdio.h>

int main(void) {
  int t;
  scanf("%d",&t);
  while(t--){
    int a[31]={0};
    int d,q; int index,req;
    scanf("%d",&d);
    while(d--){
      scanf("%d",&index);
      scanf("%d",&a[index-1]);
    }
    scanf("%d",&q);
    while(q--){
      scanf("%d%d",&d,&req);
      int sum=0;
      for(int i=0;i<d;i++){
        sum+=a[i];
      }
      if(sum<req)
        printf("Go Sleep\n");
      else 
        printf("Go Camp\n");
    }
  }
  return 0;
}