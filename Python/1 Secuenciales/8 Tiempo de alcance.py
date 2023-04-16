#Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d. El que está detrás (v1) viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto determinar y mostrar en qué tiempo (minutos) alcanzará el vehículo más rápido al otro.
#Ta=d/(v2-v1)
v1=int(input("Introduzca velocidad: "))
v2=int(input("Introduzca velocidad: "))
d=int(input("Introduzca velocidad: "))
Ta=d/(v2-v1)
Ta=Ta*60
print(round(Ta, 2))