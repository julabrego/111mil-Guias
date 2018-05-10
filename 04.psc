Algoritmo NombreMeses
	meses Es Caracter
	Dimension meses[12]
	numeroMes Es Entero
	mesElegido Es Entero
	
	meses[0]<-"Enero"
	meses[1]<-"Febrero"
	meses[2]<-"Marzo"
	meses[3]<-"Abril"
	meses[4]<-"Mayo"
	meses[5]<-"Junio"
	meses[6]<-"Julio"
	meses[7]<-"Agosto"
	meses[8]<-"Septiembre"
	meses[9]<-"Octubre"
	meses[10]<-"Noviembre"
	meses[11]<-"Diciembre"
	
	Repetir	
	Escribir "Ingrese el numero de mes o 0 para salir"	
	leer numeroMes
	
		Si numeroMes>=1 Y numeroMes<=12 Entonces
			mesElegido<-numeroMes-1
			Escribir "Mes elegido: ",meses[mesElegido]
			
		SiNo
			Escribir "opción incorrecta"
		FinSi		
	Hasta Que numeroMes==0
	
FinAlgoritmo
