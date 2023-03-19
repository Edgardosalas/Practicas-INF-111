f=1; c=1; s=0
while True:
    n=int(input("Itroduzca un numero: "))
    if n>0:
        for i in range(1,n):
            f=f+f*c
            c=c+1
        print(f)
        break