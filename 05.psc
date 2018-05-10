Algoritmo Meses
	Definir A Como Entero
	Definir mes Como Caracter
	Dimension mes[12]
	
	mes[0] <- "Enero"
	mes[1] <- "Febrero"
	mes[2] <- "Marzo"
	mes[3] <- "Abril"
	mes[4] <- "Mayo"
	mes[5] <- "Junio"
	mes[6] <- "Julio"
	mes[7] <- "Agosto"
	mes[8] <- "Septiembre"
	mes[9] <- "Octubre"
	mes[10] <- "Noviembre"
	mes[11] <- "Diciembre"
	
	Repetir
		Escribir "Ingrese el numero de un mes o 0 para terminar"
		Leer A
	
		Si A > 0 Y A < 13 Entonces
			Escribir mes[A-1]
		SiNo
			Si A <> 0 Entonces
				Escribir "Numero incorrecto. Vuelva a intentar"
			FinSi
		FinSi
	Hasta Que A = 0
FinAlgoritmo
