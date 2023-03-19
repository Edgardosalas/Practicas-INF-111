#Escribe un programa que solicite al usuario ingresar su edad. Si el usuario tiene entre 18 y 25 años (ambos inclusive), el programa deberá imprimir en pantalla el mensaje "¡Felicidades! Eres elegible para nuestra oferta especial para jóvenes". Si el usuario tiene más de 25 años, el programa deberá imprimir en pantalla el mensaje "¡Gracias por tu interés en nuestra oferta especial para jóvenes, pero esta oferta es solo para personas entre 18 y 25 años!".
n=int(input("Introduzca su edad: "))
if n>=18 and n<=25:
    print("¡Felicidades! Eres elegible para nuestra oferta especial para jovenes")
else:
    print("¡Gracias por tu interes en nuestra oferta especial pra jovenes, pero esta oferta es solo para personas entre 18 y 25 años!")