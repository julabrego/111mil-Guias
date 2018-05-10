Algoritmo Butacas
	Definir butaca Como Logico
	Definir AuxRandom Como Entero
	Dimension butaca[10]
	Definir i Como Entero
	
	// Se le otorga a cada indice de butaca[] un valor Verdadero o Falso
	Para i <-0 hasta 9 Con Paso 1
		AuxRandom<- Aleatorio(0, 1)
		Si AuxRandom = 0 Entonces
			butaca[i] <- Falso
		SiNo
			butaca[i] <- Verdadero
		FinSi
	FinPara
	
	// Se chequean todas las butacas y si están vacías se suma 1 a ButacasVacias
	// Se imprime el estado de cada butaca
	Definir ButacasVacias Como Entero
	ButacasVacias <- 0
	
	Para i <- 0 Hasta 9 Con Paso 1
		Si butaca[i] = Falso Entonces
			ButacasVacias <- ButacasVacias + 1
			Escribir "Butaca " i + 1 " Está vacía"
		SiNo
			Escribir "Butaca " i + 1 " Está ocupada"
		FinSi
		Esperar 1 Segundos
	FinPara
	
	// Se escribe la cantidad de butacas vacías y ocupadas
	Escribir ""
	Escribir "Butacas vacias: " ButacasVacias
	Escribir "Butacas ocupadas: " 10-ButacasVacias
	
FinAlgoritmo
