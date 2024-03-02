# AREP-Taller5

### Andrea Durán Vivas

Este proyecto es una aplicación web que permite a los usuarios realizar 
cálculos básicos utilizando funciones matemáticas como seno, coseno, magnitud y 
verificar si una cadena es un palíndromo. La aplicación está construida con Spark, 
un microframework para Java, y utiliza Docker para facilitar su despliegue y ejecución

## Arquitectura

La arquitectura del proyecto se basa en un servidor web Spark que maneja las solicitudes HTTP y 
ejecuta las operaciones matemáticas solicitadas. Las operaciones matemáticas son implementadas 
por clases que implementan una interfaz Calculator. Estas clases (Sin, Cos, Magnitude, Palindrome) 
contienen la lógica para realizar los cálculos específicos.

## Diseño de Clases

- **Calculator:** Interfaz que define un método calculate que toma un arreglo de double como parámetro.
- **Sin, Cos, Magnitude, Palindrome:** Clases que implementan la interfaz Calculator, proporcionando la lógica para calcular el seno, coseno, magnitud y verificar si una cadena es un palíndromo, respectivamente.
- **SparkWebServer:** Es el servidor de nuestra aplicación web, en este definimos el puerto por defecto de la app y los paths para las funciones get usando spark y definiendo las funciones lambda necesarias,
usando las clases anteriormente construidas que implementan Calculator

## Generación de Imágenes y Despliegue

Para generar las imágenes de Docker y desplegar la aplicación, sigue estos pasos:

**1. Generar la Imagen de Docker:** (Esto fue lo que se hizo para generar la imagen y subirla a Docker Hub)

Seguimos el tutorial de la clase, donde en resumen, lo que hacemos es:

-  Importar las dependencias necesarias, como org.slf4j y com.sparkjava, y agregarle los plugins de la copia de las dependencias de maven en la ejecución, para que las dependencias estén en la carpeta target
cuando ejecutemos el comando `mvn clean install`.
- Luego creamos los archivos Dockerfile y docker-compose.yml  (verificando la ruta de nuestro servidor y los puertos que queríamos)
- Construimos la imagen de docker con `docker build --tag dockersparkprimer .` Podemos cambiar el nombre en caso de que queramos que la imagen tenga otro nombre.
- Verificamos la imagen creada con `docker images`.
- Creamos un contenedor de la imagen creada con `docker run -d -p [PUERTO]:46000 --name [NOMBRE] dockersparkprimer`, donde el puerto y el nombre del contenedor lo asignamos nosotros según nos parezca más adecuado.
- Verificamos que el contenedor esté corriendo con `docker ps`
- Verificamos que las páginas y funciones definidas estén funcionando correctamente al ingresar al browser y revisarlas.
- Creamos un repositorio en Docker Hub con nuestra cuenta
- Desde terminal, creamos una referencia a nuestra imagen con el nombre del repositorio creado, esto lo hacemos con `docker tag dockersparkprimer [USER]/[NOMBRE_REPO]`
- Verificamos que la referencia exista con `docker images` y nos autenticamos con `docker login`.
- Finalmente, subimos la imagen al repositorio con el comando `docker push [USER]/[NOMBRE_REPO]:latest` y verificamos en la página de Docker Hub que esté el repositorio actualizado.


**2. Ejecutar la Imagen de Docker:** (Esto es lo que debe hacer el usuario, solo bajar la imagen)

Debemos abrir la aplicación Docker en nuestras máquinas y abrir una terminal o un IDE de nuestra preferencia. 
Una vez hecho eso, corremos el siguiente comando para crear la imagen local del proyecto.


`docker run -p 8080:46000 -d --name Taller5Virtualizacion andreaduran/firstsprkwebapprepo
`

La imagen correrá en el puerto ingresado, es decir, en el 8080 (aunque esto se puede cambiar según parezca necesario).
Por lo tanto, lo único que debemos hacer es abrir un browser e ingresar al link http://localhost:8080/ de la máquina local

## Pruebas y Despliegue

Después de desplegar la aplicación, puedes acceder a ella a través de un navegador web en http://localhost:8080. La aplicación muestra una página de bienvenida con botones para acceder a las funciones de seno, coseno, magnitud y palíndromo.

### **Imágenes de Despliegue**

**- Página de inicio**

Así es como se debería ver la página de inicio, hay 4 botones que redirigen a 4 páginas diferentes,
cada una con su propia funcionalidad.

![Inicio](/ss/inicio.png)

**- Página de seno**

Esta es la página de seno, podemos ver los resultados al darle clic al botón
![Sin](/ss/sin.png)

En caso de que se de Enter, se verá de esta manera, ya que usa los parámetros de la query.
De esta manera también podemos acceder al get definido en el servidor para esta función y sus parámetros.

![Sin](/ss/sinRest.png)

**- Página de coseno**

Esta es la página de coseno, podemos ver los resultados al darle clic al botón
![Cos](/ss/cos.png)

En caso de que se de Enter, se verá de esta manera, ya que usa los parámetros de la query.
De esta manera también podemos acceder al get definido en el servidor para esta función y sus parámetros.

![Cos](/ss/cosRest.png)

**- Página de palíndromo**

Esta es la página de palíndromo, podemos ver los resultados al darle clic al botón
![Palindrome](/ss/pal.png)

Este es un ejemplo de cómo podemos acceder al get definido en el servidor para esta función y sus parámetros.
![Palindrome](/ss/palRest.png)

**- Página de magnitud**

Esta es la página del cálculo de la magnitud, podemos ver los resultados al darle clic al botón
![Magnitude](/ss/mag.png)

Este es un ejemplo de cómo podemos acceder al get definido en el servidor para esta función y sus parámetros.
![Magnitude](/ss/magRest.png)


## Documentación
Podemos ver la documentación del proyecto con el siguiente comando:
`mvn javadoc:javadoc`

## Construido con

* [Spark Framework](https://sparkjava.com/) - Java/Kotlin web framework
* [Maven](https://maven.apache.org/) - Dependency Management
* [Java](https://www.java.com/es/) - Programming Language
* [JavaScript](https://developer.mozilla.org/en-US/docs/Web/javascript) - Programming Language
* [CSS](https://www.w3.org/Style/CSS/Overview.en.html) - stylesheet Language
* [HTML](https://html.com/) - HyperText Markup Language



## Versionamiento

Version 1.0.0

## Autores

* **Andrea Durán Vivas**  [Usuario de GitHub](https://github.com/andreaduranvivas)

## Licensia

MIT License

## Agradecimientos

Clase con Daniel Benavides