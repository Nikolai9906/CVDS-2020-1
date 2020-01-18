# Henry Sánchez Arévalo
## Información personal
 - Estudiante de ingeniaria de sistemas en la **Escuela Colombiana de ingenieria Julio Garavito**.
 - Septimo Semestre.
 - Hincha de Santafe.
## Acerca de mi 
 Soy una persona divertida, me gusta jugar futbol, programar, _leer_ , estoy en 7 semestre, me gusta la universidad. 
## ¿Que me gusta de la carrera?  
 1. La programación.
 2. Los profesores.
 3. El campus.
 4. El aroma a conocimiento que hay dentro de la u.
 
## Mi parte favorita de la u
!["La entrada linda"](http://makex.tdrobotica.co/img/img-escuela.jpg)

## Redes
- Facebook: www.facebook.com/Henrysantafesito
- Instagram: www.instagram.com/1948hen

## Codigos
- dejo un fragmento de codigo que me gusta
- Es un codio de multiplicacion de matrices de numeros complejos.
```
public Matriz multiplicacion(Matriz B) throws Exception {
		if (this.get_colu()!=B.get_filas()) {
			throw new Exception("No se pueden multiplicar");
		}
		Complejo[][] res=new Complejo[this.get_filas()][B.get_colu()];
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				for (int x=0; x<this.get_colu();x++) {
					res[i][j]= res[i][j].suma(this.get_matriz()[i][x].multiplicacion(B.get_matriz()[x][j])); 
					
				}
			}
		}
		return new Matriz(res);
	}
```
## Avance de lab
![Avance](https://i.ibb.co/y0CR2yM/dddd.jpg)
- avance hecho hasta las 9:54 por henry sanchez arevalo codigo: **2145224**
