# cook your dish here
for _ in range(int(input())):
    n,p = map(int,input().split())
    fir = False
    sec = False
    if n==1 or n==2:
        print(p**3)
        fir = True
    if p == n and fir == False:
        print(((n//2)+1)**2)
        sec = True
    if fir == False and sec == False:
        if n%2==0:
            a = n//2
        else:
            a = n//2 + 1
        i = p -n
        j = p -a + 1
        val = (j**2)+(i)*(j+i)
        print(val)