#Escribe un programa que calcule el tiempo que tardará un vehículo en recorrer una distancia a una velocidad constante. El programa debe pedir al usuario que ingrese la distancia en kilómetros y la velocidad en kilómetros por hora, y mostrar el tiempo que tardará en recorrer la distancia en horas.
n=int(input("Introduzca la distancia: "))
v=int(input("Introduzca la velocidad: "))
d=n//v
print("Tardará",int(d), "hora(s)")