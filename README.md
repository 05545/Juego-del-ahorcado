# Juego del ahorcado
Este proyecto es una implementación del clásico juego del "Ahorcado" (Hangman). La propuesta tiene como objetivo mostrar una solución para programar un 
juego simple, centrándose en el uso de interfaces y la lógica del juego. Aunque esta implementación es básica, proporciona una base para entender 
cómo se pueden integrar estos conceptos en un proyecto de programación.

## Contenido
- [Descripción](juego-del-ahorcado)
- [Detalles del proyecto](el-proyecto)
- [Correcciones](correcciones)
- [Autores](autores)

## El proyecto
Este proyecto consiste en una versión simplificada del juego del Ahorcado. La lógica del juego se basa en adivinar una palabra oculta a partir de letras 
proporcionadas por el jugador, con un número limitado de intentos. El juego se hizo con el objetivo de que fuése modificable así que por ello se integran funciones
con el uso de HashMap, una estructura de datos disponible en Java.

### La interfaz
La interfaz fue pensada y diseñada con una intención de hacer un juego visualmente atractivo y que proporcione una facilidad al momento de jugar para el usuario.

### Los paquetes
En este proyecto se encuentran tres paquetes. Los cuales se describen a continuacion:
1. Paquete Imagenes: este paquete contiene todos los elementos gráficos usados en el proyecto. En este sentido, cuando se intente implementar el proyecto requiere reconfigurar las rutas.
2. Paquete Interfaces: este paquete contiene exclusivamente los elementos gráficos que se muestran al usuario. Además implementa lógica de interfaces.
3. Paquete Lógica: contiene la parte del proyecto que se encarga de validar entradas y resultados para el jugador, Determina las palabras que tiene que adivinar y valida las entradas que se reciben desde las clases en el paquete Interfaces.

## Como usar
1. Clona el repositorio a tu dispositivo local.
2. Abre NetBeans e importalo.
3. Navega hasta la clase Principal en el paquete Logica y ejecuta.
   > Es probable que se muestre una ventana en blanco por la falta de la implementacion de rutas relativas. Si ocurre lo anterior asegurate de agregar cada imagen e icono segun corresponda.
   > En caso de que muestre correctamente la interfaz basta con que se ejecute y funcionará correctamente.

## Correcciones
Cualquier modificación o alteración del proyecto será de plena responsabilidad del autor de dichos cambios, quien también será reconocido como 
el autor de las correcciones. Se otorga libertad de edición a cualquier persona que considere necesario realizar ajustes.

Es importante tener en cuenta que el proyecto ha sido oficialmente finalizado por los autores actuales. Por lo tanto, no se realizarán más modificaciones 
por nuestra parte. Cualquier cambio futuro será gestionado por aquel que lo quiera utilizar.

## Autores
Este proyecto ha sido desarrollado por:
- Alexis Sánchez
- Ernesto García
- Rodrigo Sosa
Cada miembro del equipo participó activamente en todas las fases del desarrollo del proyecto, sin una distribución específica de roles.
