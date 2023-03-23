#Escribe un programa que calcule el tiempo de descarga de un archivo en función del tamaño del archivo y la velocidad de descarga en megabits por segundo. El programa debe pedir al usuario que ingrese el tamaño del archivo en megabytes y la velocidad de descarga en megabits por segundo, y mostrar el tiempo de descarga en minutos y segundos.
t=int(input())
v=int(input())
t=t*8
vd=t/v
tm=vd/60
print(round(vd, 2))
print(round(tm, 2))