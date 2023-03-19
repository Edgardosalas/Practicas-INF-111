n=int(input("Introduzca un numero: "))
s=0; c=n; p=1; c2=1
for i in range(1,n+1):
    s=s+c2*10**(c-1)
    c=c-1
    c2=c2+1
print(s)
c=n
for j in range(n-1):
    c=c-1
    s=s%10**c
    print(s)
c=n
for k in range(n-1):
    s=s*10**p+(c-1)
    c=c-1
    print(s)