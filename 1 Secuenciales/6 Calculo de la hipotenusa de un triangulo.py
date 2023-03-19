#Escribe un programa que calcule la longitud de la hipotenusa de un triángulo rectángulo en función de las longitudes de los catetos. El programa debe pedir al usuario que ingrese la longitud de los catetos y mostrar la longitud de la hipotenusa.
n=int(input("Introduzca la longitud de un cateto: "))
c=int(input("Introduzca la longitud de otro cateto: "))
h=(n**2+c**2)**(1/2)
print(round(h, 2))