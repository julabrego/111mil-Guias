Algoritmo Promedio
	Definir A, sumaA, promedio Como Real
	Dimension A[4]
	Definir i Como Entero
	
	Para i <- 0 hasta 3 con paso 1
		Escribir "Ingrese un valor para A[" i "]"
		Leer A[i]
	FinPara
	
	sumaA <- 0
	Para i <- 0 Hasta 3 Con Paso 1
		sumaA <- sumaA + A[i]
	FinPara
	promedio <- sumaA / 4
	
	Escribir "Promedio de los cuatro numeros: " promedio
FinAlgoritmo
