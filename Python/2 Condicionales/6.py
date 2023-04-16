#Escribe un programa que solicite al usuario ingresar dos números enteros. El programa deberá imprimir en pantalla el resultado de la suma de los dos números si ambos números son mayores que 10. Si alguno de los números es menor o igual que 10, el programa deberá imprimir en pantalla el mensaje "Los números ingresados deben ser mayores que 10".
n=int(input("Introduzca un numero: "))
n1=int(input("Introduzca un numero: "))
if n>10 and n1>10:
    print(n+n1)
else:
    print("Los numeros ingresados deben ser mayores que 10")