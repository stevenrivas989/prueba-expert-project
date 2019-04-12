Algoritmo PascalTriangleClass
	Escribir "Ingrese n: "
	Leer n;
	constructionPascalTringle(0,n);
FinAlgoritmo

Funcion constructionPascalTringle( currentNumber, n )
	Si currentNumber < n Entonces
		k=0;
		printSpace(currentNumber, n, k);
		printTriangle(currentNumber,0);
		Escribir "";
		constructionPascalTringle( currentNumber + 1, n );
	Fin Si
Fin Funcion

Funcion printSpace( currentNumber, n, k )
	Si k < n - currentNumber Entonces
		Escribir Sin Saltar " ";
		printSpace(currentNumber, n, k + 1);
	Fin Si
Fin Funcion

Funcion printTriangle(currentNumber,j)
	
	Si j <= currentNumber Entonces
		Escribir Sin Saltar pascalTriangle(currentNumber, j);
		Escribir Sin Saltar " ";
		printTriangle(currentNumber, j + 1);
	Fin Si
	
Fin Funcion

Funcion result <- pascalTriangle(currentNumber, j )
	Si j == 0 || j == currentNumber Entonces
		result <- 1;
	SiNo
		result <- pascalTriangle(currentNumber - 1, j - 1) + pascalTriangle(currentNumber - 1, j);
	Fin Si
Fin Funcion






