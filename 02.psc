Algoritmo login
	nombre_correcto Es Caracter
	contrasena_correcta Es Caracter
	nombre Es Caracter
	contrasena Es Caracter
	
	nombre_correcto<-"gudi"
	contrasena_correcta<-"1234"
	
	Escribir "Ingrese su usuario"
	Leer nombre
	Escribir "Ingrese su contraseña"
	Leer contrasena
	
	Si nombre==nombre_correcto Entonces
		Escribir "Login correcto"
	Fin Si
FinAlgoritmo
