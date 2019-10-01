t=int(input())
for i in range(t):
    n=int(input())
    s,c=input().split()
    count=0
    g=-1
    for j in range (n):
        if s[j]==c:
            g=j
        count=count+g+1
    print(int(count))
