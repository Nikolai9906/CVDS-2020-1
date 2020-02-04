# Laboratorio 2 :books:

---
## Consulta :card_index:
> Consulta
1. Cuál es su mayor utilidad
	Es una herramienta que sirve para gestionar y manejar proyectos de software.
2. Para qué sirven los plugins
	Son aplicaciones o software que contiene funciones o caracteristicas, las cuales ayuda a mejorar el proceso de algun software en espescifico. En este caso seria maven nuestro software
	URL : https://maven.apache.org/plugins/index.html
3. Ciclo de Vida
	* compile: Genera los ficheros .class compilando los fuentes .java
	* test: Ejecuta los test automáticos de JUnit existentes, abortando el proceso si alguno de ellos falla.
	* package: Genera el fichero .jar con los .class compilados
	* install: Copia el fichero .jar a un directorio de nuestro ordenador donde maven deja todos los .jar. De esta forma esos .jar pueden utilizarse en otros proyectos maven en el mismo ordenador.
	* deploy: Copia el fichero .jar a un servidor remoto, poniéndolo disponible para cualquier proyecto maven con acceso a ese servidor remoto.
5. Qué es y para qué sirve el repositorio central de maven
	Es un lugar que provee nueva informacion y actualizaciones para llevar acabo en proyectos con maven.

## Creando un proyecto con maven

* Grupo: edu.eci.cvds
* Id del Artefacto: Patterns
* Paquete: edu.eci.cvds.patterns
* archetypeArtifactId: maven-archetype-quickstart
> Comandos

*Crear un proyecto*
```
$ mvn archetype:generate
[INFO] Scanning for projects...
.
.
.
Define value for groupId: : edu.eci.cvds
Define value for artifactId: : Patterns
Define value for version: : 1.0
Define value for package: : edu.eci.cvds.patterns
Confirm properties configuration:
groupId: edu.eci.cvds
artifactId: Patterns
version: 1.0
package: edu.eci.cvds.patterns
 Y: : 
```

*Ver arbol*
```
$ cd Patterns
$ tree
.
.
.
.
│   pom.xml
└───src
    ├───main
    │   └───java
    │       └───edu
    │           └───eci
    │               └───cvds
    │                   └───patterns
    │                           App.java
    │
    └───test
        └───java
            └───edu
                └───eci
                    └───cvds
                        └───patterns
                                AppTest.java
```

*Compilar y Ejecutar*
```
-cd desde Patterns-
$ mvn package

.
.
*Sin argumentos*
$ mvn exec:java  -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain"

*Con argumentos*
$ mvn exec:java  -Dexec.mainClass="edu.eci.cvds.patterns.shapes.ShapeMain" -Dexec.args="'Quadrilateral'"
```

## Hacer el esqueleton de la aplicacion
* Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
  - ¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

	1. Sin parámetros: Nos dice " Parameter of type RegularShapeType is required." lo cual indica que requiere un parametro de una forma regular.
	2. Parámetro: qwerty : Nos dice "Parameter 'qwerty' is not a valid RegularShapeType" lo cual indica que el valor ingresado no es un tipo de forma regular.
	3. Parámetro: pentagon : Nos dice "Parameter 'pentagon' is not a valid RegularShapeType" en este caso nos indica en particular que no es un tipo de forma regular debido a que no esta escrito como deberia ser correctamente "Pentagon". 
	4. Parámetro Hexagon : Nos dice "Successfully created a Hexagon with 6 sides." Lo cual se refiere a que fue exitosamente creado un Hexagon con 6 lados.


