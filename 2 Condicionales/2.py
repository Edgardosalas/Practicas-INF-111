#Escribe un programa que solicite al usuario ingresar tres números enteros. El programa deberá imprimir en pantalla el mensaje "Hay un número par" si al menos uno de los números ingresados es par. De lo contrario, deberá imprimir en pantalla el mensaje "No hay números pares".
n=int(input("Introduzca un numero: "))
n2=int(input("Introduzca un numero: "))
n3=int(input("Introduzca un numero: "))
if n%2==0 or n2%2==0 or n3%2==0:
    print("Hay un numero par")
else:
    print("No hay numeros pares")
