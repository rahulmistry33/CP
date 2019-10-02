n,m = map(int,input().split())
a = [int(i) for i in input().split()]
b = [int(i) for i in input().split()]
minIndex = str(a.index(min(a)))
maxIndex = str(b.index(max(b)))
for i in range(0,len(b)):
    print(minIndex+" "+str(i))
c = 0
i = int(len(a)-1)
while(i>=0):
    if not(i)==int(minIndex):
        print(str(i)+" "+maxIndex)
    i-=1