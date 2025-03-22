## Ejercicio 2 – **La Notablísima Prueba™**

> El Ministerio de Evaluaciones Sin Sentido ha encargado un sistema para evaluar estudiantes, pero el programador que lo hizo estaba más enfocado en su café que en la lógica. Este programa:
> 
1. Recibe **3 notas por estudiante**.
2. Calcula el promedio.
3. Si el promedio es **mayor o igual a 3.0**, el estudiante aprueba.
4. Se evalúan exactamente **4 estudiantes**.
5. Al final, se imprime cuántos aprobaron.

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

optimizacion:
sinceramente que codigo mas picho xD
que vaina mas enrredada
despidan al otro programador (y a mi proximamente)

primero voy a re declarar las variables porque ni se que letra significa que cosa, la proxima por lo menos ponga name aunque sea

lo segundo seria revisar como optimizar ese codigo para que sea mas facil de interpretar

Logica: 

creamos variables de estudiantes, notas, promedios, y aprobados.

ponemos un bucle que recorra para los 4 estudiantes y dentro del bucle dejamos que se ingresen las 3 notas de los estudiantes, una vez ingresadas se van para un acumulador de promedio donde se dividen las notas entre 3 y se da un promedio, este promedio se muestra al estudiante que este ingresando las notas en ese momento y se le dice si aprobo o no
se le suma 1 al acumulador de estudiantes para que el bucle continue hasta llegar a 4 y otro 1 al acumulador de estudiantes aprobados para poder saber cuantos estudiantes pasan la materia.

esto se hace con cada estudiante hasta terminar con los 4, al finalizar el bucle se muestra cuantos estudiantes fueron evaluados y cuantos aprobaron.