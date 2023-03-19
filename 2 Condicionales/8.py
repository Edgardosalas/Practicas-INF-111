#Escribe un programa que solicite al usuario ingresar el lenguaje de programación que está aprendiendo. Si el usuario ingresa "Python", el programa deberá imprimir en pantalla el mensaje "¡Python es un excelente lenguaje de programación! Sigue adelante". Si el usuario ingresa "JavaScript", el programa deberá imprimir en pantalla el mensaje "¡JavaScript es un lenguaje de programación popular y útil! Sigue adelante". Si el usuario ingresa cualquier otro lenguaje de programación, el programa deberá imprimir en pantalla el mensaje "¡Ese es un buen lenguaje de programación! Sigue adelante".
n=input("Ingrese el lenguaje de programacion que esta aprendiendo ")
if n=="Python":
    print("¡Python es un excelente lenguaje de programacion")
elif n=="JavaScript":
    print("¡JavaScript es un lenguaje de programacion popular y util! Sigue adelante")
else:
    print("¡Ese es un bien lenguaje de programacion! Sigue adelante")