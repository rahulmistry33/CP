def getDistancia(value):
	if value not in dic:
		return 1
	return 1 + getDistancia(dic[value])
 
n = int(input())
dic = {}
 
for e in range(n):
	ent = int(input())	
	if ent != -1:
		dic[e+1] = ent
 
maior = 1
for e in dic:
	aux = getDistancia(e)
	if aux > maior:
		maior = aux
 
print(maior)
