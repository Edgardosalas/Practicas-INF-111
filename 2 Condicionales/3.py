#Calculadora de Índice de Masa Corporal (IMC)
#Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y calcule su Índice de Masa Corporal (IMC) utilizando la siguiente fórmula:
#IMC = peso / altura^2
#Luego, el programa debe imprimir el resultado del IMC y una categoría que indique si el usuario está en su peso ideal, por debajo o por encima de él. Las categorías son las siguientes:
# Bajo peso: IMC menor a 18.5
# Peso normal: IMC entre 18.5 y 24.9
# Sobrepeso: IMC entre 25 y 29.9
# Obesidad: IMC mayor a 30
p=float(input())
a=float(input())
imc=p/a**2
imc=round(imc, 2)
if imc<18.5:
    print("Bajo peso")
elif imc>18.5 and imc<24.9:
    print("Peso normal")
elif imc>25 and imc<29.9:
    print("Sobrepeso")
else:
    print("Obesidad")