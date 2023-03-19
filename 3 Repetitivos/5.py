n=int(input("Introduzca un numero: "))
s=0; c=1; p=1
for i in range(1,n+1):
    for j in range(1,p+1):
        s=s+1
        if j==c:
            print(s)
            c=c+1
        else:
            print(s,  end=" ")
    p=p+1
