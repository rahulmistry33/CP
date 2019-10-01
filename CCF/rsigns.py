'''def findCommon(m,n):
	a=[]
	m=str(m)
	n=str(n)
	for i in m:
		if i not in a:
			a.append(i)
	for j in n:
		if j not in a:
			a.append(j)
	return len(a)

def driver(n):
	ans=0
	for i in range (0,n):
		a=i
		b=n-1-i
		count=findCommon(a,b)
		#print(str(a)+" "+str(b)+" "+str(count))
		if(count==2):
			ans+=1
		if(b-a==1):
			break
	return ans

ans=driver(100000)
print(ans)'''

import math
a=5
r=2
m=1000000007
for i in range (int(input())):
	k=int(input())
	ans=a*(math.pow(r,(k-1)%m)
	print((int(ans)*2)%m)