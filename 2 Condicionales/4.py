#Escribe un programa que solicite al usuario ingresar una letra. Si la letra ingresada es una vocal (a, e, i, o, u), el programa deberá imprimir en pantalla el mensaje "La letra ingresada es una vocal". De lo contrario, el programa deberá imprimir en pantalla el mensaje "La letra ingresada es una consonante".
n=input("Introduzca una letra: ")
if n=="a" or n=="e" or n=="i" or n=="o" or n=="u":
    print("La letra ingresada es una vocal")
else:
    print("La letra ingresadad es una consonante")