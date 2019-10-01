for i in range(int(input())):
	l,r=(int(x) for x in input().split())
	m=(r-l)//2
	if(l%2==1 or r%2==1):
		m=m+1
	if(m%2==0):
		print("Even")
	else:
		print("Odd")