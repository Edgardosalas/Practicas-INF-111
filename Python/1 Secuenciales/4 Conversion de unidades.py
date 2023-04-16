#Escribe un programa que convierta una longitud en pies y pulgadas a centímetros. El programa debe pedir al usuario que ingrese la cantidad de pies y pulgadas y mostrar la longitud equivalente en centímetros. Se considera que 1 pie = 12 pulgadas y 1 pulgada = 2.54 centímetros.
pi=int(input("Ingrese la cantidad de pies: "))
pu=int(input("Ingrese la cantidad de pulgadas: "))
c=2.54
p=12
ce=(pi*p)*c+(pu*c)
print(round(ce, 2))