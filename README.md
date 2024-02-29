# AREP-Taller5

## Andrea Durán Vivas

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

- **Calculator:++ Interfaz que define un método calculate que toma un arreglo de double como parámetro.
- **Sin, Cos, Magnitude, Palindrome:** Clases que implementan la interfaz Calculator, proporcionando la lógica para calcular el seno, coseno, magnitud y verificar si una cadena es un palíndromo, respectivamente.


## Generación de Imágenes y Despliegue

Para generar las imágenes de Docker y desplegar la aplicación, sigue estos pasos:

1. Construir la Imagen de Docker:

2. Ejecutar la Imagen de Docker:

DOCKER: docker pull andreaduran/firstsprkwebapprepo:latest

## Pruebas y Despliegue

Después de desplegar la aplicación, puedes acceder a ella a través de un navegador web en http://localhost:4567. La aplicación muestra una página de bienvenida con botones para acceder a las funciones de seno, coseno, magnitud y palíndromo.

Imágenes de Despliegue
(Aquí deberían mostrarse imágenes de cómo quedó desplegado la aplicación durante las pruebas, pero debido a las limitaciones de formato, no se pueden incluir imágenes directamente en este texto. En su lugar, puedes incluir enlaces a las imágenes alojadas en un repositorio externo o describir cómo se vería la aplicación basándote en la funcionalidad descrita).
