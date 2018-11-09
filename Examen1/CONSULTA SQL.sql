#	EXAMEN 1

SELECT idOrden AS 'Numero de orden' FROM Orden o 
INNER JOIN Cliente c ON o.Cliente_dni = c.dni
WHERE c.apellido = 'Rodriguez';