from statistics import mean
for i in range (int(input())):
	n=int(input())
	a=(int(x) for x in input().split())
	a=list(a)
	m=mean(a)
	if m in a:
		print(a.index(m)+1)
	else:
		print("Impossible")
