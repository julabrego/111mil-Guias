Algoritmo TablaMultiplicar
	Definir A, max, n, i Como Entero
	
	Escribir "Ingrese un numero del que desea imprimir la tabla de multiplicar"
	Leer A
	
	Escribir "Ingrese el valor maximo al que desea llegar"
	Leer max
	
	n <- 1
	i <- 1
	Repetir
		n <- A * i
		// Agrego SI porque de otro modo se imprime el numero aunque se pase el maximo
		Si n <= max
			Escribir A " x " i " = " n
		FinSi
		i <- i + 1
	Hasta Que n > max
FinAlgoritmo
