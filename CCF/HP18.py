t=int(input())
for c in range(t):
  i=0
  n,a,b = [int(x) for x in input().split()] 
  l=[int(x) for x in input().split()] 
  alist=[int(x) for x in l if (x%a==0 and x%b!=0)]
  blist=[int(x) for x in l if (x%b==0 and x%a!=0)]
  ab=[int(x) for x in l if (x%b==0 and x%a==0)]
  l1,l2,l3=len(alist),len(blist),len(ab)
  if(l3!=0):
    if(l2>l1):
      print('ALICE')
    else: 
      print('BOB')
  else:
    if(l1>l2):
      print('BOB')
    else: 
      print('ALICE')
