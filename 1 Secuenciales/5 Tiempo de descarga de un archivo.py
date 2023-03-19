#Escribe un programa que calcule el tiempo de descarga de un archivo en función del tamaño del archivo y la velocidad de descarga en megabits por segundo. El programa debe pedir al usuario que ingrese el tamaño del archivo en megabytes y la velocidad de descarga en megabits por segundo, y mostrar el tiempo de descarga en minutos y segundos.
n=int(input("Introduzca el tamaño del archivo: "))
v=int(input("Introduzca la velocidad de descarga: "))
st=n//v
m=st/60
s=st%60
print(int(m),":",s)