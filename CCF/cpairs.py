for m in range(int(input())):
	n=int(input())
	A=(int(x) for x in input().split())
	A=list(A)
	count=0
	even=0
	for i in range(0,n):
		if(A[i]%2==0):
		    even+=1
		else:
		    count+=even
	print(count)