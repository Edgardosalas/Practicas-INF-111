#Escribe un programa que lea el radio de un círculo y muestre su área y circunferencia en la pantalla. Utiliza las fórmulas siguientes:
#Área = pi * radio^2
#Circunferencia = 2 * pi * radio
r=int(input())
pi=3.14
a=pi*r**2
c=2*pi*r
print(round(a, 2))
print(round(c, 2))