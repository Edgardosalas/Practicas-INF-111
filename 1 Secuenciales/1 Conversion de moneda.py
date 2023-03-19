#Escribe un programa que convierta una cantidad de dólares a euros. El programa debe pedir al usuario que ingrese la cantidad en dólares y mostrar la cantidad equivalente en euros. Se considera que el cambio de divisa es de 1 dólar = 0,83 euros.)
n=int(input("Introduzca dolares: "))
c=0.83
e=n*c
print(round(e, 2))