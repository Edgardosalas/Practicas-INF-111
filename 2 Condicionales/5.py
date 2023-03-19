#Escribe un programa que pida al usuario un número entero y determine si es múltiplo de 3 y/o de 5. Imprime "Es múltiplo de 3", "Es múltiplo de 5" o "No es múltiplo de 3 ni de 5" según corresponda.
n=int(input("Introduzca un numero entero: "))
if n%3==0 and n%5==0:
    print("Es multiplo de 3 y de 5")
else:
    if n%3==0:
        print("Es multiplo de 3")
    else:
        if n%5==0:
            print("Es multiplo de 5")
        else:
            print("No es multiplo de 3 ni de 5")